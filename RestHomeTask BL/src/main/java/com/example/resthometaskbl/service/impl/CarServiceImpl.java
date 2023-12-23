package com.example.resthometaskbl.service.impl;

import com.example.resthometaskbl.dto.CarDto;
import com.example.resthometaskbl.repository.CarRepository;
import com.example.resthometaskbl.service.CarService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import com.example.resthometaskbl.mapper.CarMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Transactional
public class CarServiceImpl implements CarService {

    private final CarMapper mapper;
    private final CarRepository repository;

    @Override
    public CarDto save(CarDto dto) {
        var entity = mapper.toEntity(dto);

        var save = repository.save(entity);

        return mapper.toDto(save);
    }


}
