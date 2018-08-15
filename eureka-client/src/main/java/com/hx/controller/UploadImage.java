package com.hx.controller;

import com.hx.config.FileUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@RestController
public class UploadImage {
    //处理文件上传
    @RequestMapping(value="/uploadimg", method = RequestMethod.POST)
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

}
