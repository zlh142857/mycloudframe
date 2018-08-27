package com.hx.controller;

import com.hx.config.FtpUtil;
import org.apache.poi.xwpf.converter.pdf.PdfConverter;
import org.apache.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class PdfController {
    @RequestMapping("/pdf")
    public String pdf(@RequestParam("file") MultipartFile file,
                    HttpServletRequest request){
        // 判断是否为空
        if (file.isEmpty()) {
            return "file为空";
        }
        try {
            //将上传的MultipartFile转换为inputStream
            InputStream inputStream = file.getInputStream();
            FtpUtil ftp =new FtpUtil();
            ftp.uploadFile2("\\uploadimage","123.docx",inputStream);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            return "失败了";

        }
        /*String docPath = "D:\\需求文档模板.docx";
        String pdfPath = "D:\\需求文档模板.pdf";
        XWPFDocument document = null;
        try (InputStream doc = Files.newInputStream(Paths.get(docPath))) {
            document = new XWPFDocument(doc);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PdfOptions options = PdfOptions.create();
        try (OutputStream out = Files.newOutputStream(Paths.get(pdfPath))) {
            PdfConverter.getInstance().convert(document, out, options);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        return "成功了";
    }
}
