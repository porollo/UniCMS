package com.unicms.core.service;

import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class InstallService {

    private Path path = Paths.get("/unicms.lock");

    private boolean checkInstall () {

        if (Files.exists(path)) {
            return true;
        }
        else {
            return false;
        }
    }
}
