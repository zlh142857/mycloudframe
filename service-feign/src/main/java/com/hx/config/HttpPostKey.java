package com.hx.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Base64;

@RestController
public class HttpPostKey {
    @RequestMapping("postKey")
    public void postKey(HttpServletRequest request, HttpServletResponse response) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
        StringBuilder data = new StringBuilder();
        String line = null;
        while ((line = br.readLine()) != null) {
            data.append(line);
        }
        String xml = data.toString();
        System.out.println(xml);
        String sb="";
        sb+=("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        sb+=("<response version=\"1.0\">");
        sb+=("    <type>0</type>");
        sb+=("    <signAlgOid></signAlgOid>");
        sb+=("    <signature></signature>");
        sb+=("    <signatureContent>PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0idXRmLTgiPz4KPHNpZ25hdHVyZUNvbnRlbnQ+CiAgICA8bm9uY2U+MDAxPC9ub25jZT4KICAgIDxjb250ZW50PlBEOTRiV3dnZG1WeWMybHZiajBpTVM0d0lpQmxibU52WkdsdVp6MGlkWFJtTFRnaVB6NEtQSEpsYzNWc2RDQjJaWEp6YVc5dVBTSXdNREVpUGdvZ0lDQWdQSE4wWVhSMWN6NHdQQzl6ZEdGMGRYTStDaUFnSUNBOFptRnBiRkpsWVhOdmJqNDhMMlpoYVd4U1pXRnpiMjQrQ2p3dmNtVnpkV3gwUGc9PTwvY29udGVudD4KPC9zaWduYXR1cmVDb250ZW50Pg==</signatureContent>");
        sb+=("</response>");
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print(sb);
        out.flush();
        out.close();
        //http://172.16.107.205:8763/postKey
    }
    @RequestMapping("/base")
    public void base(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {

        Cookie[] cookie = request.getCookies();
        for (int i = 0; i < cookie.length; i++) {
            Cookie cook = cookie[i];
            if(cook.getName().equalsIgnoreCase("UserIP")){ //获取键
                System.out.println(cook.getValue().toString());    //获取值
            }
            if(cook.getName().equalsIgnoreCase("UserProperty")){
                String str=cook.getValue();//获取键
                System.out.println(str);    //获取值
                String str1=str.replace("*","=");
                System.out.println(str1);
                Base64.Decoder decoder = Base64.getDecoder();
                System.out.println(new String(decoder.decode(str1), "gbk"));
            }
        }




        /*Base64.Decoder decoder = Base64.getDecoder();
        String str="VXNlcklkPVUxMUB6b25nYnUud3VqaW5nLmNufFVJX05BTUU9suLK1NPDu6czfFVJX0NFUlRJRD0zMzN8YWdlPTMwfGxldmVsPb/GvLZ8YXBwPUExQGJqLmNvbSxBMkBiai5jb20*";
        String str1=str.replace("*","=");
        System.out.println(str1);
        System.out.println(new String(decoder.decode(str1), "gbk"));*/
    }
}
