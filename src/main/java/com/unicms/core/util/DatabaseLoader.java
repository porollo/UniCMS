package com.unicms.core.util;

import com.unicms.core.model.Role;
import com.unicms.core.model.Settings;
import com.unicms.core.model.User;
import com.unicms.core.repository.RoleRepository;
import com.unicms.core.repository.SettingsRepository;
import com.unicms.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private SettingsRepository settingsRepository;
    private UserRepository userRepository;
    private RoleRepository roleRepository;

    @Autowired
    public DatabaseLoader(SettingsRepository settingsRepository, UserRepository userRepository, RoleRepository roleRepository) {
        this.settingsRepository = settingsRepository;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.settingsRepository.save(new Settings("UniCMS", "0.0.1", "SQL Server 2018", "ReactJS"));

        this.userRepository.save(new User("d.porollo@gmail.com", "spider", "Dmitriy", "Porollo","123456", true, "30.05.1985"));
        this.userRepository.save(new User("a.sidorov@gmail.com", "viper", "Alex", "Sidorov","123456", true, "10.10.1982"));

        this.roleRepository.save(new Role("ADMIN"));
    }
}