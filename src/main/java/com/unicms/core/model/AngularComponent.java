package com.unicms.core.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "angular_components")

public class AngularComponent {

    private @Id
    @GeneratedValue
    Long id;
    private String componentName;
    private String componentClass; // Model, service, component

    private AngularComponent() {}

    public AngularComponent(String componentName, String componentClass) {
        this.componentName = componentName;
        this.componentClass = componentClass;
    }
}