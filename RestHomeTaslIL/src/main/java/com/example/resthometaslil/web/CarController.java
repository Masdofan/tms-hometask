package com.example.resthometaslil.web;

import com.example.resthometaslil.dto.CarDto;
import com.example.resthometaslil.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/store/cars")
public class CarController {

    private final StoreService service;

    @PostMapping
    public CarDto save(@RequestBody CarDto dto) {
        return service.save(dto);
    }

    @GetMapping
    public List<CarDto> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public CarDto findById (@PathVariable(name = "id") Integer id) {
        return service.findById(id);
    }

}
