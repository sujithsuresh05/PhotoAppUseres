package com.photoapp.users.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersControllers {

    @Autowired
    Environment environment;
    @GetMapping("/status/check")
    public String status() {
        String port = environment.getProperty("local.server.port");
        return "Working on port " + port;
    }

}
