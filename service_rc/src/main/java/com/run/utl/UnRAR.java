package com.run.utl;

import com.alibaba.fastjson.JSONObject;
import com.github.junrar.Archive;
import com.github.junrar.exception.RarException;
import com.github.junrar.rarfile.FileHeader;

import java.io.*;
import java.util.List;
import java.util.Map;

public class UnRAR {
    /**
     * @param srcRarPath       原始rar路径+name
     * @param dstDirectoryPath 要解压到的目录
     */
    public static String unrar(String srcRarPath, String dstDirectoryPath) throws IOException, RarException {
        if (!srcRarPath.endsWith(".rar")) {
            return "";
        }
        File file = new File(dstDirectoryPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuffer filePathAndName = new StringBuffer();

        Archive archive = new Archive(new FileInputStream(new File(srcRarPath)));
        if (archive != null) {
            // 打印文件信息
            archive.getMainHeader().print();
            FileHeader fileHeader = archive.nextFileHeader();
            while (fileHeader != null) {

                // 解决中文乱码问题【压缩文件中文乱码】
                String fileName = fileHeader.getFileNameW().isEmpty() ? fileHeader.getFileNameString() : fileHeader.getFileNameW();
                filePathAndName.append(dstDirectoryPath).append("\\").append(fileName);
                // 文件夹
                if (fileHeader.isDirectory()) {
                    File fol = new File(dstDirectoryPath + File.separator + fileName.trim());
                    fol.mkdirs();
                } else { // 文件
                    // 解决linux系统中\分隔符无法识别问题
                    String[] fileParts = fileName.split("\\\\");
                    StringBuilder filePath = new StringBuilder();
                    for (String filePart : fileParts) {
                        filePath.append(filePart).append(File.separator);
                    }
                    fileName = filePath.substring(0, filePath.length() - 1);
                    File out = new File(dstDirectoryPath + File.separator + fileName.trim());
                    if (!out.exists()) {
                        // 相对路径可能多级，可能需要创建父目录.
                        if (!out.getParentFile().exists()) {
                            out.getParentFile().mkdirs();
                        }
                        out.createNewFile();
                    }
                    FileOutputStream os = new FileOutputStream(out);
                    archive.extractFile(fileHeader, os);
                }
                fileHeader = archive.nextFileHeader();
            }
        } else {
            System.out.println("rar file decompression failed , archive is null");
        }
        return filePathAndName.toString();
    }

    public static void main(String[] args) throws IOException, RarException {
        String srcFilePath = "D:\\ssw\\interface.rar";
        String destDirectoryPath = "D:\\ssw\\extractRar";
        String s = unrar(srcFilePath, destDirectoryPath);
        System.out.println(s);

        File file = new File(s);

        BufferedReader bufferedReader = null;

        StringBuffer stringBuffer = new StringBuffer();

        String tempString = null;
        int line = 1;
        // System.out.println("以行为单位读取文件内容，一次读一整行：");
        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
        while ((tempString = bufferedReader.readLine()) != null) {
            System.out.println("Line" + line + ":" + tempString);
            stringBuffer.append(tempString.trim());
            line++;
        }
        bufferedReader.close();
        String jsonStr = stringBuffer.toString();
        Map map = (Map) JSONObject.parse(jsonStr);

        List<Map> protocalSpecificationList = (List<Map>) map.get("protocalSpecification");
        for (Map entry : protocalSpecificationList) {
            System.out.println(entry.toString());
            if ("接口名称".equals(entry.get("name"))) {
                System.out.println(entry.get("description"));
            }
            if ("服务规约版本号".equals(entry.get("name"))) {
                System.out.println(entry.get("description"));
            }
            if ("URL".equals(entry.get("name"))) {
                System.out.println(entry.get("description"));
            }
            if ("请求方式".equals(entry.get("name"))) {
                System.out.println(entry.get("description"));
            }
            if ("状态".equals(entry.get("name"))) {
                System.out.println(entry.get("description"));
            }
            if ("返回类型".equals(entry.get("name"))) {
                System.out.println(entry.get("description"));
            }
            if ("接口类型".equals(entry.get("name"))) {
                System.out.println(entry.get("description"));
            }
            if ("接口说明".equals(entry.get("name"))) {
                System.out.println(entry.get("description"));
            }

        }

    }


}
