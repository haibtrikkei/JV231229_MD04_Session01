package com.rikkeiacademy.demo_springboot.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadFile {
    public String uploadToLocal(MultipartFile multipartFile);
    public String uploadToFirebase(String localPath);
}
