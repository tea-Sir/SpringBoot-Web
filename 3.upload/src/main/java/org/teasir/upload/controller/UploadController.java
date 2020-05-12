package org.teasir.upload.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
public class UploadController {
    /*
    * 单个文件上传
    * */
    @PostMapping("/upload")
    public String upload(MultipartFile file, HttpServletRequest request) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String fmtDate = sdf.format(new Date());
        String realPath = request.getServletContext().getRealPath("/png") + fmtDate;
        File folder = new File(realPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        String oldName = file.getOriginalFilename();
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));
        try {
            file.transferTo(new File(folder, newName));
            String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/png" + fmtDate + newName;
            return url;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "error";
    }

    /*
     * 多文件上传
     * */
    @PostMapping("/uploads")
    public String upload(MultipartFile [] files, HttpServletRequest request) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String fmtDate = sdf.format(new Date());
        String realPath = request.getServletContext().getRealPath("/png") + fmtDate;
        File folder = new File(realPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        for(MultipartFile file:files){
            String oldName = file.getOriginalFilename();
            String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));
            try {
                file.transferTo(new File(folder, newName));
                String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/png" + fmtDate + newName;
                System.out.println(url);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return "success";
    }
}
