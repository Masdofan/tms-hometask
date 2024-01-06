package com.example.hometask44_les48.web;

import com.example.hometask44_les48.dto.UserDto;
import com.example.hometask44_les48.service.DBUserDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class UserController {

    private final DBUserDetailsService userDetailsService;

    @PostMapping("/register")
    public String save(UserDto user) {
        userDetailsService.save(user);
        return "public";
    }
}
