package com.unicms.core.model;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.sql.Timestamp;

@Data
@Entity

public class User {

    private int id;
    private String username;
    private String password;
    private String email;
    private boolean enable;
    private Timestamp recordCreated;

    public User(int id, String username, String password, String email, boolean enable, Timestamp recordCreated, UserDetails userDetails) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.enable = enable;
        this.recordCreated = recordCreated;
        this.userDetails = userDetails;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_details_id", referencedColumnName = "id")
    private UserDetails userDetails;

}