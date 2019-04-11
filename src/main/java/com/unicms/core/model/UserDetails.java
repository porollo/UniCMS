package com.unicms.core.model;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.sql.Date;

@Data
@Entity

public class UserDetails {

    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private Date   birthday;
    private String address;
    private String postalCode;
    private String city;
    private String country;


    public UserDetails(int id, String firstName, String lastName, String phone, Date birthday, String address, String postalCode, String city, String country, User user) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.birthday = birthday;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
        this.user = user;
    }

    @OneToOne(mappedBy = "user_details")
    private User user;

}