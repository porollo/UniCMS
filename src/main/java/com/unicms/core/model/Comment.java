package com.unicms.core.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "comments")

public class Comment implements Serializable {

    private @Id
    @GeneratedValue
    Long id;
    private String commentTitle;
    private String commentContent;
    private String commentOwner;

    public Comment() {}

    public Comment(String commentTitle, String commentContent, String commentOwner) {
        this.commentTitle = commentTitle;
        this.commentContent = commentContent;
        this.commentOwner = commentOwner;
    }
}
