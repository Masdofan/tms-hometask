package com.example.resthometaslil.client;

import com.example.resthometaslil.dto.CarDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "car-client", url = "http://127.0.0.1:8081", path = "/cars")
public interface CarClient {

    @PostMapping
    CarDto save(@RequestBody CarDto request);

    @GetMapping
    CarDto findById(Integer id);

}
