package com.example.hometask42_les47.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {

    @GetMapping("/public")
    public String publicPage() {
        return "public";
    }

    @GetMapping("/authusers")
    public String authUsersPage() {
        return "authusers";
    }

    @GetMapping("/accessonly")
    public String accessOnlyPage() {
        return "accessonly";
    }

}
