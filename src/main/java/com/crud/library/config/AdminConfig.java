package com.crud.library.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.nio.file.Paths;

@Service
public class AdminConfig {

    //logger
    private static final Logger logger = LoggerFactory.getLogger(AdminConfig.class);

    //Getting folder path from config
//    @Value("${folder.path}")
    private String folderPath;

    @Value("${folder.name}")
    private String backUpFolderName;

    public String backUpFolderPath(){
        String userDirectory = Paths.get("").toAbsolutePath().toString();
        folderPath = userDirectory + backUpFolderName;
        logger.info("Path found successfully");
        return folderPath;
    }

}
