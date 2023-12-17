package com.example.resthometaslil.service.impl;

import com.example.resthometaslil.dto.CarDto;
import com.example.resthometaslil.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class StoreServiceImpl implements StoreService {

    private final RestTemplate template;
    @Override
    public CarDto save(CarDto dto) {

        var responseEntity = template.postForEntity("127.0.0.1:8081/cars", dto, CarDto.class);

        return responseEntity.getBody();
    }
}
