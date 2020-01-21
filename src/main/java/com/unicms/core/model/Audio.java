package com.unicms.core.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "audio")

public class Audio implements Serializable {

    private @Id
    @GeneratedValue
    Long id;
    private String audioTitle;
    private String audioContent;
    private String audioDuration;
    private String audioStyle;
    private String audioOwner;

    public Audio() {}

    public Audio(String audioTitle, String audioContent, String audioDuration, String audioStyle, String audioOwner) {
        this.audioTitle = audioTitle;
        this.audioContent = audioContent;
        this.audioDuration = audioDuration;
        this.audioStyle = audioStyle;
        this.audioOwner = audioOwner;
    }
}