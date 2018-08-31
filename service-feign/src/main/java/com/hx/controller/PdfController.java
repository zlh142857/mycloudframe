package com.hx.controller;

import com.hx.config.FtpUtil;
import com.lowagie.text.Font;
import com.lowagie.text.pdf.BaseFont;
import fr.opensagres.xdocreport.itext.extension.font.IFontProvider;
import org.apache.poi.xwpf.converter.pdf.PdfConverter;
import org.apache.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class PdfController {
    @RequestMapping("/pdf")
    public String pdf(@RequestParam("file") MultipartFile file,
                    HttpServletRequest request){
        if(file.isEmpty()){
            return "file为空";
        }
        try{
            String fileName = file.getOriginalFilename();
            String str=fileName.substring(fileName.lastIndexOf("."));
            if(str.equals(".doc")||str.equals(".docx")){
                try {
                    InputStream inputStream = file.getInputStream();
                    XWPFDocument document = new XWPFDocument(inputStream);
                    String rename="";
                    if(str.equals(".doc")){
                        rename=fileName.replace(".doc",".pdf");
                    }
                    if(str.equals(".docx")){
                        rename=fileName.replace(".docx",".pdf");
                    }
                    String pdfPath="D:\\IdeaWorkspace\\springconfidential\\service-feign\\src\\main\\resources\\pdf\\"+rename;

                    PdfOptions options = PdfOptions.create();
                    //中文字体处理
                    options.fontProvider(new IFontProvider() {
                        public Font getFont(String familyName, String encoding, float size, int style, Color color) {
                            try {
                                BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
                                Font fontChinese = new Font(bfChinese, size, style, color);
                                if (familyName != null)
                                    fontChinese.setFamily(familyName);
                                return fontChinese;
                            } catch (Exception e) {
                                e.printStackTrace();
                                return null;
                            }
                        }
                    });
                    try (OutputStream out = Files.newOutputStream(Paths.get(pdfPath))) {
                        PdfConverter.getInstance().convert(document, out, options);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    /*File f = new File(pdfPath);
                    f.delete();*/
                } catch (IOException e1) {
                    e1.printStackTrace();
                    System.out.println("输出失败");
                }
            }
        }catch (Exception e){
            System.out.println("失败");
        }
        //String contentType = file.getContentType();
        //可以判断文件格式
        /*String fileName = file.getOriginalFilename();
        String str=fileName.substring(fileName.lastIndexOf("."));//输出内容为".后缀名"*/
        /*// 判断是否为空
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

        }*/
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
        return "";
    }
}
