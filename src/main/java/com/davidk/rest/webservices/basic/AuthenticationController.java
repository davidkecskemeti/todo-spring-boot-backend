package com.davidk.rest.webservices.basic;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AuthenticationController {

    @GetMapping(path = "/basicauth")
    public AuthenticationBean authenticationBean(){
        return new AuthenticationBean("You are authenticated");
    }
}
