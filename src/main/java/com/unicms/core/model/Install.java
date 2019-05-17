package com.unicms.core.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "installs")

public class Install {

    private @Id
    @GeneratedValue
    Long id;
    private String articleTitle;
    private String articleContent;

    private Install() {}

    public Install(String articleTitle, String articleContent) {
        this.articleTitle = articleTitle;
        this.articleContent = articleContent;
    }
}