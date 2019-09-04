package com.unicms.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching

public class UniCmsCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniCmsCoreApplication.class, args);
    }

}
