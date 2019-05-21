package com.unicms.core.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "users")

public class User {

    private @Id
    @GeneratedValue
    Long user_id;
    private String email;
    private String username;
    private String name;
    private String lastname;
    private String password;
    private boolean enable;
    private String recordCreated;

    private User() {};

    public User (String email, String username, String name, String lastname, String password, boolean enable, String recordCreated) {
        this.email = email;
        this.username = username;
        this.name =  name;
        this.lastname = lastname;
        this.password = password;
        this.enable = enable;
        this.recordCreated = recordCreated;
    }

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private UserDetails userDetails;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;



}