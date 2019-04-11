package com.unicms.core.util;

import com.unicms.core.model.Info;
import com.unicms.core.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final InfoRepository repository;

    @Autowired
    public DatabaseLoader(InfoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Info("UniCMS", "1.0.0"));
    }
}