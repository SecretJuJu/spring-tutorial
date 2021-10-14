package com.secretjuju.springtutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    String message = "helloworld";

    @GetMapping("/msg")
    public String sayMsg() {
        return this.message;
    }

}
