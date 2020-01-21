package com.unicms.core.api;

import com.unicms.core.model.Video;
import com.unicms.core.repository.VideoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class VideosRESTController {

    private final VideoRepository videoRepository;

    public VideosRESTController(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @GetMapping("/videos")
    public List<Video> getVideos() {
        return (List<Video>) videoRepository.findAll();
    }

    @GetMapping("/videos/{id}")
    public Optional<Video> getAudiosVideo(@PathVariable Long id) {
        return videoRepository.findById(id);
    }

    @PostMapping("/videos")
    void addVideo(@RequestBody Video video) {
        videoRepository.save(video);
    }

    @DeleteMapping("/videos")
    public void deleteVideo(@RequestBody Video video) {
        videoRepository.delete(video);}
}