package com.unicms.core.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "infos")

public class Info {

    private @Id
    @GeneratedValue Long id;
    private String applicationName;
    private String applicationVersion;

    private Info() {}

    public Info(String applicationName, String applicationVersion) {
        this.applicationName = applicationName;
        this.applicationVersion = applicationVersion;
    }
}
