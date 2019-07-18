package com.unicms.core.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "settings")

public class Settings {

    private @Id
    @GeneratedValue
    Long id;
    private String applicationName;
    private String applicationVersion;
    private String dbName;
    private String viewEngine;

    private Settings() {}

    public Settings(String applicationName, String applicationVersion, String dbName, String viewEngine) {
        this.applicationName = applicationName;
        this.applicationVersion = applicationVersion;
        this.dbName = dbName;
        this.viewEngine = viewEngine;
    }
}
