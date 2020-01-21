package com.unicms.core.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "video")

public class Video implements Serializable {

    private @Id
    @GeneratedValue
    Long id;
    private String videoTitle;
    private String videoContent;
    private String videoDuration;
    private String videoGenre;
    private String videoOwner;

    public Video() {}

    public Video(String videoTitle, String videoContent, String videoDuration, String videoGenre, String videoOwner) {
        this.videoTitle = videoTitle;
        this.videoContent = videoContent;
        this.videoDuration = videoDuration;
        this.videoGenre = videoGenre;
        this.videoOwner = videoOwner;
    }
}