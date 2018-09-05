package com.hx.controller;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.nio.charset.Charset;

@RestController
public class HttpOne {
    @RequestMapping("/httpone")
    public String http(@RequestParam("file") MultipartFile file,
                       HttpServletRequest request) {
        //创建HttpClient对象
        CloseableHttpClient client = HttpClients.createDefault();
        //接收文件的路径
        HttpPost post = new HttpPost("http://172.16.107.114:8080/httpclienttofile_war/httptwo.do");
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(20000).setConnectTimeout(20000).build();//设置请求和传输超时时间
        post.setConfig(requestConfig);
        //post.addHeader("Accept-Charset", "GB2312,utf-8;q=0.7,*;q=0.7");
        //post.addHeader("Host", "80");
        //post.addHeader("Accept", "Accept text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        //post.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; QQDownload 1.7; .NET CLR 1.1.4322; CIBA; .NET CLR 2.0.50727)");
        String fileName = file.getOriginalFilename();
        InputStream inputStream=null;
        try {
            inputStream = file.getInputStream();
            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
            builder.setCharset(Charset.forName("utf-8"));
            //第一个参数为 相当于 Form表单提交的file框的name值 第二个参数就是我们要发送的InputStream对象了
            //第三个参数是文件名
            //3)
            builder.addBinaryBody("file", inputStream, ContentType.create("multipart/form-data"), fileName);
            //4)构建请求参数 普通表单项
            StringBody stringBody = new StringBody("12", ContentType.MULTIPART_FORM_DATA);
            builder.addPart("id", stringBody);
            HttpEntity entity = builder.build();
            post.setEntity(entity);
            //发送请求
            HttpResponse response = client.execute(post);
            entity = response.getEntity();
            if (entity != null) {
                inputStream = entity.getContent();
                //转换为字节输入流
                BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, Consts.UTF_8));
                String body = null;
                while ((body = br.readLine()) != null) {
                    System.out.println(body);
                }
            }
            return "成功";
        } catch (IOException e) {
            e.printStackTrace();
            return "失败";
        }finally {
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    return "失败";
                }
            }
        }
    }
}