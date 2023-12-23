package com.example.resthometaslil.service.impl;

import com.example.resthometaslil.client.CarClient;
import com.example.resthometaslil.dto.CarDto;
import com.example.resthometaslil.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StoreServiceImpl implements StoreService {

    private final CarClient client;

    @Override
    public CarDto save(CarDto dto) {
        return client.save(dto);
    }

    @Override
    public List<CarDto> getAll() {

    }

    @Override
    public CarDto getById(Integer id) {
        return client.findById(id);
    }
}
