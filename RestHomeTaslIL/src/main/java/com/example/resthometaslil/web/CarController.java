package com.example.resthometaslil.web;

import com.example.resthometaslil.dto.CarDto;
import com.example.resthometaslil.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/store/cars")
public class CarController {

    private final StoreService service;

    @PostMapping
    public CarDto save(@RequestBody CarDto dto) {
        return service.save(dto);
    }

}