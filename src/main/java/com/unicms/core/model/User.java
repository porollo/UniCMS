package com.unicms.core.model;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_details_id", referencedColumnName = "id")
    private UserDetails userDetails;

}