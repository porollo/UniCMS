package com.unicms.core.model;

import lombok.*;

import java.sql.Date;


@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
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

}