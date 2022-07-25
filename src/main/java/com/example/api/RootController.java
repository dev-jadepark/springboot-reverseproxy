package com.example.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping(path="/hello-world")
    public String helloWorld(){
        return "hello World";
    }
}
