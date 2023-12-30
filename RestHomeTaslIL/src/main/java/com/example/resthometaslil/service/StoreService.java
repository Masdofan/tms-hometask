package com.example.resthometaslil.service;

import com.example.resthometaslil.dto.CarDto;

import java.util.List;

public interface StoreService {

    CarDto save(CarDto dto);

    List<CarDto> findAll();

    CarDto findById(Integer id);



}
