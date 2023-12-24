package com.example.resthometaskbl.service;

import com.example.resthometaskbl.dto.CarDto;

import java.util.List;

public interface CarService {

    CarDto save(CarDto dto);

    List<CarDto> findAll();

    CarDto findById(Integer id);

}
