package com.unicms.core.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "articles")

public class Article implements Serializable {

    private @Id
    @GeneratedValue
    Long id;
    private String articleTitle;
    private String articleContent;
    private String articleOwner;

    private Article() {}

    public Article(String articleTitle, String articleContent, String articleOwner) {
        this.articleTitle = articleTitle;
        this.articleContent = articleContent;
        this.articleOwner = articleOwner;
    }
}