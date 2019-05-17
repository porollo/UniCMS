package com.unicms.core.util;

import com.unicms.core.model.Settings;
import com.unicms.core.repository.SettingsRepository;
import com.unicms.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SettingsDatabaseLoader implements CommandLineRunner {

    private SettingsRepository settingsRepository;
    private UserRepository userRepository;

    @Autowired
    public SettingsDatabaseLoader(SettingsRepository settingsRepository, @Qualifier("userRepository") UserRepository userRepository) {
        this.settingsRepository = settingsRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.settingsRepository.save(new Settings("UniCMS", "0.0.1", "SQL Server 2016", "ReactJS"));
    }
}