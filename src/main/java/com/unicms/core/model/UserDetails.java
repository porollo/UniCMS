package com.unicms.core.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "user_details")

public class UserDetails implements Serializable {

    private @Id
    @GeneratedValue Long id;

    private String name;
    private String surname;
    private String phone;
    private Date   birthday;
    private String address;
    private String postalCode;
    private String city;
    private String country;

    @OneToOne
    @MapsId
    private User user;

}
