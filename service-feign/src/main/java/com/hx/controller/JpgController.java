package com.hx.controller;

import com.itextpdf.text.*;

import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@RestController
public class JpgController {
    @RequestMapping("/jpg")
    public boolean jpg(@RequestParam("file") MultipartFile file,
                       HttpServletRequest request) throws IOException, BadElementException {
        String fileName = file.getOriginalFilename();
        String str=fileName.substring(fileName.lastIndexOf("."));
        String rename="";
        if(str.equals(".jpg")){
            rename=fileName.replace(".jpg",".pdf");
        }
        if(str.equals(".png")){
            rename=fileName.replace(".png",".pdf");
        }
        if(str.equals(".gif")){
            rename=fileName.replace(".gif",".pdf");
        }
        if(str.equals(".bmp")){
            rename=fileName.replace(".bmp",".pdf");
        }
        if(str.equals(".tif")){
            rename=fileName.replace(".tif",".pdf");
        }
        if(str.equals(".webp")){
            rename=fileName.replace(".webp",".pdf");
        }
        if(str.equals(".jpeg")){
            rename=fileName.replace(".jpeg",".pdf");
        }
        String pdfPath="D:\\IdeaWorkspace\\springconfidential\\service-feign\\src\\main\\resources\\pdf\\"+rename;
        String imagePath="D:\\IdeaWorkspace\\springconfidential\\service-feign\\src\\main\\resources\\image\\"+fileName;
        if(!file.isEmpty()) {
            byte [] fileBytes=file.getBytes();
            FileOutputStream out = new FileOutputStream(imagePath);
            out.write(fileBytes);
            out.flush();
            out.close();
            BufferedImage img = ImageIO.read(new File(imagePath));
            FileOutputStream fospdf = new FileOutputStream(pdfPath);
            Document doc = new Document();
            doc.setPageSize(new Rectangle(img.getWidth(), img.getHeight()));
            Image image = Image.getInstance(imagePath);
            float scalePercentage = (72 / 300f) * 100.0f;
            image.scalePercent(scalePercentage, scalePercentage);
            try {
                PdfWriter.getInstance( doc, fospdf);
            } catch (DocumentException e) {
                e.printStackTrace();
            }
            doc.open();
            try {
                doc.add(image);
                doc.close();
            } catch (DocumentException e) {
                e.printStackTrace();
            }
            File tu = new File(imagePath);
            tu.delete();
            /*File pdf = new File(pdfPath);
            pdf.delete();*/
            return true;
        }else{
            return false;
        }

    }
}
