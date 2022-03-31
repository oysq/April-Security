package com.oysq.aprilsecurity.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResourceController {

    @GetMapping("/geeting")
    public String geeting() {
        return "Hello oysq";
    }

}
