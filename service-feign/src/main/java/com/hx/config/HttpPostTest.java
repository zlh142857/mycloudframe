package com.hx.config;



import java.io.IOException;

public class HttpPostTest {
   public static void client(String url){
      /* //创建HttpClient对象
       HttpClient httpClient = new HttpClient();
       //创建GetMethod连接
       PostMethod postMethod = new PostMethod(url);
       //postMethod.setEntity();
       //执行httclient对象
       try {
           int codeStatus = httpClient.executeMethod(postMethod);
           if (codeStatus == 200) {
               postMethod.getParams().setContentCharset("UTF-8");
               String body = postMethod.getResponseBodyAsString();
               //将字符串转换为json对象
               JSONObject jb = new JSONObject();
               JSONArray parseArray =jb.parseArray(body);
               for (Object object:parseArray ) {
                   JSONObject jb1 = (JSONObject) object;
                   System.out.print(jb1);
               }

           }
       } catch (IOException e) {
           e.printStackTrace();
       }
*/

   }
}
