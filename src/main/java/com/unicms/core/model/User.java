package com.unicms.core.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String username;
    private String password;
    private String email;
    private boolean enable;
    private Timestamp recordCreated;

    private User() {}

    public User(Long id, String username, String password, String email, boolean enable, Timestamp recordCreated, UserDetails userDetails) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.enable = enable;
        this.recordCreated = recordCreated;
        this.userDetails = userDetails;
    }

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private UserDetails userDetails;
}