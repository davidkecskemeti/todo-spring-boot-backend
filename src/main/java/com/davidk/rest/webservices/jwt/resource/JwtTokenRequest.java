package com.davidk.rest.webservices.jwt.resource;

import java.io.Serializable;

public class JwtTokenRequest implements Serializable {

    private static final long serialVersionUID = -5616176897013108345L;

//    {
//        "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTYwMTkzMzA0OSwiaWF0IjoxNjAxMzI4MjQ5fQ.A9PFcE8i_FYsCsE1sTlFDKtCM3kkUBL65aF4JDSUHTtaX750ppSeoOVyCDSmDADo0krvcUB0foAqcov9GSoB2w"
//    }

    private String username;
    private String password;

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}