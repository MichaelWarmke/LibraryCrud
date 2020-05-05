package com.warmke.mike.libcrud.domain;

import lombok.Value;

@Value
public class User {

    enum Role {
        ADMIN,
        USER
    }

    String username;
    String hashedpw;
    User.Role role;
}
