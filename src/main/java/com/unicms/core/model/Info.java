package com.unicms.core.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Data
@Entity

public class Info {

    private @Id
    @GeneratedValue Long id;
    private String applicationName;
    private String appLicationVersion;

    private Info() {}

    public Info(String applicationName, String appLicationVersion) {
        this.applicationName = applicationName;
        this.appLicationVersion = appLicationVersion;
    }
}
