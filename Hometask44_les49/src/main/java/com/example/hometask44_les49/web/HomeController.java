package com.example.hometask44_les49.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping
    public void auth() {
        System.out.println();
    }

    @GetMapping("/private")
    public String priv() {
        return "private";
    }

}
