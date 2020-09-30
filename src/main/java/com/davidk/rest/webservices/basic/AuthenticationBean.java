package com.davidk.rest.webservices.basic;

import lombok.Data;

@Data
public class AuthenticationBean {

    private String message;

    public AuthenticationBean(String message) {
        this.message = message;
    }
}
