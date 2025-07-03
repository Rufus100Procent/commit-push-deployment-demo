package com.example.commitpushdeploymentdemo;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("prod")
@RestController
public class ProdApi {

    @GetMapping
    public String helloProd() {
        return "hello from prod";
    }

}
