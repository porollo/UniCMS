package com.unicms.core.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "react_components")

public class ReactComponent implements Serializable {

    private @Id
    @GeneratedValue
    Long id;
    private String componentName;
    private String componentClass; // Model, service, component

    private ReactComponent() {}

    public ReactComponent(String componentName, String componentClass) {
        this.componentName = componentName;
        this.componentClass = componentClass;
    }
}