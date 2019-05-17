package com.unicms.core.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "user_details")

public class UserDetails {

    private @Id
    @GeneratedValue Long id;

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
