package com.example.resthometaskbl.web;

import com.example.resthometaskbl.dto.CarDto;
import com.example.resthometaskbl.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService service;

    @PostMapping
    public CarDto save(@RequestBody CarDto request) {
        return service.save(request);
    }

}
