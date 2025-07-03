package com.example.commitpushdeploymentdemo;


import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("dev")
public class DevApi {


    @GetMapping
    public String helloDevProfile() {
        return "hello  from dev";
    }
}

