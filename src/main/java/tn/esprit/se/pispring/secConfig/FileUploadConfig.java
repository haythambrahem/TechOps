package tn.esprit.se.pispring.secConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FileUploadConfig {

    @Value("${file.upload-dir}")
    private String uploadDir;

    public String getUploadDir() {
        return uploadDir;
    }
}

