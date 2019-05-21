package com.unicms.core.api;

import com.unicms.core.model.Settings;
import com.unicms.core.repository.SettingsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SettingsRESTController {

    private final SettingsRepository settingsRepository;

    public SettingsRESTController(SettingsRepository settingsRepository) {
        this.settingsRepository = settingsRepository;
    }

    @GetMapping("/settings")
    public List<Settings> getSettings() {
        return (List<Settings>) settingsRepository.findAll();
    }

    @PostMapping("/settings")
    void addSettings(@RequestBody Settings settings) {
        settingsRepository.save(settings);
    }
}