package com.example.resthometaskbl.web;

import com.example.resthometaskbl.dto.CarDto;
import com.example.resthometaskbl.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService service;

    @PostMapping
    public CarDto save(@RequestBody CarDto request) {
        return service.save(request);
    }

    @GetMapping
    public List<CarDto> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public CarDto findById(@PathVariable(name = "id") Integer id) {
        return service.findById(id);
    }

}
