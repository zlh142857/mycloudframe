package com.hx.controller;


import com.alibaba.fastjson.JSONObject;
import com.hx.config.FileUtil;
import com.hx.service.SchedualServiceHi;

import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;


@RestController
public class TestController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam String name, String callback) {
        String result=schedualServiceHi.sayHiFromClientOne( name );
        String json= JSONObject.toJSONString(result);
        return callback +"("+json+")";
    }

    @RequestMapping(value="/toIndex")
    public String index(){
        System.out.println("ddddddddddddddddddddddddddddddddddddddddddd");

        return "/index";
    }
    //处理文件上传
    @RequestMapping(value="/uploadimg")
    public String uploadImg(@RequestParam("file") MultipartFile file,
                     HttpServletRequest request,String callback) {
        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();
        try {
            FileUtil.uploadFile(file.getBytes(), fileName);
            //返回json
            return callback+fileName;
        } catch (Exception e) {
            return callback+"upload fail";
        }
    }
    //查询列表时图片显示<img src=""/>
    /**
     * 显示二维码图片
     * @param
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping("showImage")
    public void showImageByType(String filename,HttpServletResponse response) throws Exception{
        InputStream inputStream = null;
        OutputStream writer = null;
        try {
            inputStream = new FileInputStream(new File("D:\\imageTest\\"+filename));
                    writer = response.getOutputStream();

            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = inputStream.read(buf)) != -1) {
                writer.write(buf, 0, len); //写
            }
            inputStream.close();
        } catch (Exception e) {
            System.out.println("看这里+++++++++++++++++++出错了+++++++++++++++++++++++++++");
        } finally{
            try {
                if(inputStream != null){
                    inputStream.close();
                }
                if(writer != null){
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("看这里finally+++出错了++++inputStream和OutputStream都是空的");
            }
        }
    }



    /*public void testPostLogin() throws  Exception{
        String url = "http://192.168.1.160:8080/app/user/login.xhtml";
        Map<String,String> paramMap = new HashMap<String,String>();
        paramMap.put("username","ting");
        paramMap.put("password","1");
        URL realUrl = new URL(url);
        // 打开与URL之间的链接
        URLConnection conn = realUrl.openConnection();
        // 设置通用的请求属性
        conn.setRequestProperty("accept","*//*");*/
        /*conn.setRequestProperty("connection","Keep-Alive");
        conn.setRequestProperty("user-agent","Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)\"");
        conn.setRequestProperty("Charset","UTF-8");
        //发送POST请求必须设置如下两行
        conn.setDoOutput(true);
        conn.setDoInput(true);
        // 获取URLConnection对象对应的输出流
        PrintWriter out = new PrintWriter(conn.getOutputStream());
        // 设置请求属性
        String param = "";
        if(paramMap!=null&&paramMap.size()>0){
            for(Map.Entry<String,String> entry :paramMap.entrySet()){
                String key = entry.getKey();
                String value = entry.getValue();
                param += (key+"="+value+"&");
            }
            param = param.substring(0,param.length()-1);
        }
        // 发送请求参数
        out.print(param);
        // flush输出流缓冲
        out.flush();
        // 定义BufferedReader输入流来读取URL的响应
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
        String line ;
        String result = "" ;
        while((line=reader.readLine())!=null){
            result +=line;
        }
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject)parser.parse(result);
        Object regFlag = jsonObject.get("retFlag");
        Object message = jsonObject.get("message");
        Object data = jsonObject.get("data");
        jsonObject = (JSONObject)parser.parse(data.toString());
        Object id = jsonObject.get("id");
        Object username = jsonObject.get("username");
        System.out.print(result);*/
    //}

}
