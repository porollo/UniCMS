package com.unicms.core.util.database;

import com.unicms.core.model.*;
import com.unicms.core.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private SettingsRepository settingsRepository;
    private UserRepository userRepository;
    private RolesRepository rolesRepository;
    private ArticleRepository articleRepository;
    private CommentRepository commentRepository;

    @Autowired
    public DatabaseLoader(SettingsRepository settingsRepository, UserRepository userRepository, RolesRepository rolesRepository, ArticleRepository articleRepository, CommentRepository commentRepository) {
        this.settingsRepository = settingsRepository;
        this.userRepository = userRepository;
        this.rolesRepository = rolesRepository;
        this.articleRepository = articleRepository;
        this.commentRepository = commentRepository;
    }

    @Override
    public void run(String... strings) throws Exception {

        this.settingsRepository.deleteAll();
        this.settingsRepository.save(new Settings("UniCMS", "0.0.1", "SQL Server 2018", "Angular"));

        this.userRepository.deleteAll();
        this.userRepository.save(new User("d.porollo@gmail.com", "spider", "12345678", true, "30.05.1985"));
        this.userRepository.save(new User("a.sidorov@gmail.com", "viper", "12345678", true, "10.10.1982"));

        this.rolesRepository.deleteAll();
        this.rolesRepository.save(new Roles("ADMIN"));

        this.articleRepository.deleteAll();
        this.articleRepository.save(new Article("Hello", "Test content", "d.porollo@gmail.com")); // Users !!!

        this.commentRepository.deleteAll();
        this.commentRepository.save(new Comment("Comment title", "Comment Content", "d.pporollo@gmail.com"));

    }
}