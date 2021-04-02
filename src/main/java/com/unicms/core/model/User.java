package com.unicms.core.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "users")

public class User implements Serializable {

    private @Id
    @GeneratedValue
    Long id;
    private String username;
    private String firstName;
    private String patronymic;
    private String surname;
    private Boolean active;

    public User(long l, String format, Long id) {
        this.id = id;
    }

    public User(String username, String firstName, String patronymic, String surname, Boolean active) {
        this.username = username;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.surname = surname;
        this.active = active;
    }

    public User() {

    }
}