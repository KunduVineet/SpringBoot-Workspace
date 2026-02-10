package com.ecom.redis.models;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User implements Serializable {

    private int userId;
    private String name;
    private String email;
    private String password;
    private String gender;
    private String city;
}
