package com.run.app.extend.swagger.sr;

import com.alibaba.fastjson.JSONObject;
import com.run.ent.custom.ResultModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Api(value = "UpLoadFile", tags = "文件上传")
@RestController
@RequestMapping(value = "/extend/swagger/sr/file")
public class FileUpload {
    @ApiOperation(value = "rar文件上传在线解析", notes = "rar文件上传在线解析")
    @RequestMapping(value = "/upload/rarFile", method = RequestMethod.POST)
    public ResultModel uploadFile(@RequestParam("rarFile") MultipartFile multipartFile) throws IOException, ZipException {
        String filename = multipartFile.getOriginalFilename();
        System.out.println(filename);
        String path = "D:\\ssw";
        File file = new File(path + "\\" + filename);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        multipartFile.transferTo(file);



        ResultModel model = new ResultModel();
        model.setResultMessage("upload rar success");
        return model;
    }


    @ApiOperation(value = "zip文件上传在线解析", notes = "zip文件上传在线解析")
    @RequestMapping(value = "/upload/zipOnline", method = RequestMethod.POST)
    public ResultModel uploadFile2(@RequestParam("zipFile") MultipartFile multipartFile) throws IOException, ZipException {
        String filename = multipartFile.getOriginalFilename();
        System.out.println(filename);
        String path = "D:\\ssw";
        File file = new File(path + "\\" + filename);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        multipartFile.transferTo(file);
//        InputStream multipartFileInputStream = multipartFile.getInputStream();

        StringBuffer stringBuffer = new StringBuffer();
        FileInputStream fileInputStream = new FileInputStream(file);
        ZipInputStream zin = new ZipInputStream(fileInputStream);
        ZipEntry ze = null;
        //循环遍历
        while ((ze = zin.getNextEntry()) != null) {
            System.out.println("文件名：" + ze.getName() + " 文件大小：" + ze.getSize() + " bytes");
            System.out.println("文件内容：");
            //读取
            BufferedReader br = new BufferedReader(new InputStreamReader(zin, Charset.forName("utf-8")));
            String line;
            //内容不为空，输出
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                stringBuffer.append(line.trim());
            }
        }
        System.out.println("字符串内容------" + stringBuffer);
        Map map = (Map) JSONObject.parse(stringBuffer.toString());
        System.out.println(map.get("baseInfo"));
        zin.close();
//        fileInputStream.close();

        ResultModel model = new ResultModel();
        model.setResultMessage("upload zip success");
        return model;
    }

    @ApiOperation(value = "zip文件上传", notes = "zip文件上传")
    @RequestMapping(value = "/upload/zip", method = RequestMethod.POST)
    public ResultModel uploadFiletest(@RequestParam("zipFile") MultipartFile multipartFile) throws IOException, ZipException {
        String filename = multipartFile.getOriginalFilename();
        System.out.println(filename);
        String path = "D:\\ssw";
        File file = new File(path + "\\" + filename);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        multipartFile.transferTo(file);

        //解压文件
        ZipFile zFile = new ZipFile(file);
        zFile.setFileNameCharset("UTF-8");
        String dest = "D:\\ssw\\extract";
        File destDir = new File(dest);
        zFile.extractAll(dest);

        List<FileHeader> fileHeaderList = zFile.getFileHeaders();//获取zip包内信息
        for (FileHeader fileHeader : fileHeaderList) {
            String fileName = fileHeader.getFileName();
            if (!fileHeader.isDirectory()) {
                System.out.println(fileName);
            }
        }

        ResultModel model = new ResultModel();
        model.setResultMessage("upload zip success");
        return model;
    }

}
