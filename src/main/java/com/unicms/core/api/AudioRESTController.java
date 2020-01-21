package com.unicms.core.api;

import com.unicms.core.model.Audio;
import com.unicms.core.repository.AudioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class AudioRESTController {

    private final AudioRepository audioRepository;

    public AudioRESTController(AudioRepository audioRepository) {
        this.audioRepository = audioRepository;
    }

    @GetMapping("/audios")
    public List<Audio> getAudios() {
        return (List<Audio>) audioRepository.findAll();
    }

    @GetMapping("/audios/{id}")
    public Optional<Audio> getAudio(@PathVariable Long id) {
        return audioRepository.findById(id);
    }

    @PostMapping("/audios")
    void addAudio(@RequestBody Audio audio) {
        audioRepository.save(audio);
    }

    @DeleteMapping("/audios")
    public void deleteAudio(@RequestBody Audio audio) {
        audioRepository.delete(audio);}
}