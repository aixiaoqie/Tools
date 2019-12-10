package com.run.utl;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;

import java.io.File;
import java.util.List;
// String dest = "D:\\ssw\\extract";
public class UnZIP {
    public static String unzip(String srcZipPath, String dstDirectoryPath) throws ZipException {
        if (!srcZipPath.endsWith(".zip")) {
            return "";
        }
        File file = new File(srcZipPath);
                //解压文件
        ZipFile zFile = new ZipFile(file);
        zFile.setFileNameCharset("UTF-8");

        File destDir = new File(dstDirectoryPath);
        zFile.extractAll(dstDirectoryPath);
StringBuffer stringBuffer = new StringBuffer();
        List<FileHeader> fileHeaderList = zFile.getFileHeaders();//获取zip包内信息
        for (FileHeader fileHeader : fileHeaderList) {
            String fileName = fileHeader.getFileName();
            stringBuffer.append(dstDirectoryPath).append("\\").append(fileName);
            if (!fileHeader.isDirectory()) {
                System.out.println(fileName);
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) throws ZipException {
        String srcFilePath = "D:\\ssw\\interface.zip";
        String destDirectoryPath = "D:\\ssw\\extractZip";
        String s = unzip(srcFilePath, destDirectoryPath);
        System.out.println(s);
    }
}
