package com.secretjuju.springtutorial.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
public class MyController {
    String message = "helloworld";

    @GetMapping("/msg")
    public @ResponseBody String sayMsg() {
        return this.message;
    }

    @PutMapping("/msg")
    public ResponseEntity<?> updateMsg(
            @RequestBody HashMap<String, String> updateMsgForm) {
        String message = updateMsgForm.get("msg");
        if (message.length() < 100) {
            this.message = message;
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
