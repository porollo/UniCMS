package com.unicms.core.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "images")

public class Image {

    private @Id
    @GeneratedValue
    Long image_id;
    private String name;
    private String type;
    private byte[] pic;
    private String recordCreated;

    private Image() {};

    public Image (String name, String type, byte[] pic) {
        this.name = name;
        this.type = type;
        this.pic = pic;
    }
}