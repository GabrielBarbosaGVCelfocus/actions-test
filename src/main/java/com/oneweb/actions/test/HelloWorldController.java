package com.oneweb.actions.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(path="/")
    public String helloWorld() {
        return "Hello, World!";
    }
}
