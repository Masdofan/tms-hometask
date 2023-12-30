package com.example.resthometaslil.client;

import com.example.resthometaslil.dto.CarDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "car-client", url = "http://127.0.0.1:8081", path = "/cars")
public interface CarClient {

    @PostMapping
    CarDto save(@RequestBody CarDto request);

    @GetMapping("/{id}")
    CarDto findById(@PathVariable(name = "id") Integer id);

    @GetMapping
    List<CarDto> findAll();

}
