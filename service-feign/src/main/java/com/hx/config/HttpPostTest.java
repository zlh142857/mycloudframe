package com.hx.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
@RestController
public class HttpPostTest {
    void testPost(String urlStr) {
        try {

            URL url = new URL(urlStr);
            URLConnection con = url.openConnection();
            /*con.setDoOutput(true);
            con.setRequestProperty("Pragma:", "no-cache");
            con.setRequestProperty("Cache-Control", "no-cache");
            con.setRequestProperty("Content-Type", "text/xml");*/

            OutputStreamWriter out = new OutputStreamWriter(con
                    .getOutputStream());
            String xmlInfo = getXmlInfo();
            System.out.println("urlStr=" + urlStr);
            System.out.println("xmlInfo=" + xmlInfo);
            out.write(new String(xmlInfo.getBytes("utf-8")));
            out.flush();
            out.close();
            BufferedReader br = new BufferedReader(new InputStreamReader(con
                    .getInputStream()));
            StringBuilder data = new StringBuilder();
            String line = "";
            for (line = br.readLine(); line != null; line = br.readLine()) {
                data.append(line);
                String xml = data.toString();
                System.out.println(xml);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getXmlInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("<response version=\"1.0\">");
        sb.append("    <type></type>");
        sb.append("    <signAlgOid></signAlgOid>");
        sb.append("    <encAlgOid></encAlgOid>");
        sb.append("    <symKey></symKey>");
        sb.append("    <signature></signature>");
        sb.append("    <signatureContent></signatureContent>");
        sb.append("</response>");
        return sb.toString();
    }
    @RequestMapping("/httpposttest")
    public static void main(String[] args) {
        String url = "http://10.106.9.99:8080/app/servlet/ResourceRegisterServlet";
        new HttpPostTest().testPost(url);
    }
}
