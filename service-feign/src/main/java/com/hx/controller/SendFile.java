package com.hx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
@RestController
public class SendFile {
    /*public String post(){
        String message="";
        try {
            URL url=new URL("http://119.29.175.247/wikewechat/Admin/Login/login.html");
            HttpURLConnection connection= (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setConnectTimeout(30000);
            connection.setReadTimeout(30000);
            connection.setRequestProperty("Content-type","application/x-javascript->json");
            connection.connect();
            OutputStream outputStream=connection.getOutputStream();
            StringBuffer sb=new StringBuffer();
            sb.append("email=");
            sb.append("409947972@qq.com&");
            sb.append("password=");
            sb.append("1234&");
            sb.append("verify_code=");
            sb.append("4fJ8");
            String param=sb.toString();
            outputStream.write(param.getBytes());
            outputStream.flush();
            outputStream.close();

            InputStream inputStream=connection.getInputStream();
            byte[] data=new byte[1024];
            StringBuffer sb1=new StringBuffer();
            int length=0;
            while ((length=inputStream.read(data))!=-1){
                String s=new String(data, Charset.forName("utf-8"));
                sb1.append(s);
            }
            message=sb1.toString();
            inputStream.close();
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return message;
    }*/
    @RequestMapping("/url")
    public String url(){
        String url = "http://www.baidu.com/img/baidu_jgylogo1.gif";
        URL u = null;
        try {
            u = new URL(url);
            InputStream is = u.openStream();
            OutputStream os = new FileOutputStream("D://test.jpg");
            int buff = 0;
            while((buff = is.read()) != -1){
                os.write(buff);
            }
            os.close();
            is.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }
}
