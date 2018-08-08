/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: FileUtil
 * Author:   zlh
 * Date:     2018/8/8 20:49
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hx.config;

import java.io.File;
import java.io.FileOutputStream;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zlh
 * @create 2018/8/8
 * @since 1.0.0
 */
public class FileUtil {
    public static void uploadFile(byte[] file, String fileName) throws Exception {
        String filePath="G:\\";
        FileOutputStream out = new FileOutputStream(filePath+fileName);
        out.write(file);
        out.flush();
        out.close();
    }
}