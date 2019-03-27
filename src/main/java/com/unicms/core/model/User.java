package com.unicms.core.model;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude="password")
@NoArgsConstructor
public class User {

    private int id;
    private String username;
    private String password;
    private String email;
    private boolean enable;
    private Timestamp recordCreated;

}