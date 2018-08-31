package com.hx.controller;

import com.alibaba.fastjson.JSONObject;
import com.hx.config.FtpUtil;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

@RestController
public class FtpController {
    @RequestMapping("/testUpload")
    public String testUpload(@RequestParam("file") MultipartFile file,
                           HttpServletRequest request){
        if(file.isEmpty()){
            JSONObject json = new JSONObject();
            String str="file为空";
            json.put("str", str);
            return "successCallBack("+json.toJSONString()+")";
        }else{
            try {
                InputStream infile=file.getInputStream();
                FtpUtil ftp =new FtpUtil();
                /*ftp.uploadFile2("\\uploadimage","123.pdf",infile);*/
                ftp.downloadFile("\\uploadimage","123.pdf","D:\\我的软件2");
            } catch (IOException e) {
                e.printStackTrace();
                return "获取inputstream出错";
            }
            JSONObject json = new JSONObject();
            String str="下载PDF文件成功";
            json.put("str", str);
            return "successCallBack("+json.toJSONString()+")";
        }


    }
    /*public static void testUpload() {*/
    /*    FTPClient ftpClient = new FTPClient();
        FileInputStream fis = null;

        try {
            ftpClient.connect("172.16.107.114");
            ftpClient.login("root", "huixiang");

            fis = new FileInputStream("D://需求文档模板.docx");
            System.out.println(fis);
            //设置上传目录
            ftpClient.changeWorkingDirectory("/uploadimage");
            ftpClient.setBufferSize(1024);
            ftpClient.setControlEncoding("UTF-8");
            //设置文件类型（二进制）
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftpClient.storeFile("需求文档模板.docx", fis);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("FTP客户端出错");
        } finally {
            IOUtils.closeQuietly(fis);
            try {
                ftpClient.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("关闭FTP连接出错");
            }
        }
    }

    *//**
     * FTP下载单个文件测试
     *//*
    @RequestMapping("/testDown")
    public void testDownload() {
        FTPClient ftpClient = new FTPClient();
        FileOutputStream fos = null;

        try {
            ftpClient.connect("172.16.107.114");
            ftpClient.login("root", "huixiang");

            String remoteFileName = "/uploadimage/需求文档模板.docx";
            fos = new FileOutputStream("d:/需求文档模板222.docx");

            ftpClient.setBufferSize(1024);
            //设置文件类型（二进制）
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftpClient.retrieveFile(remoteFileName, fos);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("FTP客户端出错");
        } finally {
            IOUtils.closeQuietly(fos);
            try {
                ftpClient.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("关闭FTP连接出错");
            }
        }
    }*/


}
