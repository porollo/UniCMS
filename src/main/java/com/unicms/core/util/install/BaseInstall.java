package com.unicms.core.util.install;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BaseInstall {

    private String filePath = "/";

    private void CreateLockSetupFile() {

        try {
            Path filePathObj = Paths.get(filePath);
            Path result = Files.createFile(filePathObj);
            System.out.println("Create lockfile " + filePath + " success. ");
            String fileAbsoultePath = result.toFile().getAbsolutePath();
            System.out.println("File absolute path is " + fileAbsoultePath);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}