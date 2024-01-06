package com.example.resthometaskbl.mapper;

import com.example.resthometaskbl.dto.CarDto;
import com.example.resthometaskbl.model.CarEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarMapper {

    CarEntity toEntity(CarDto dto);

    CarDto toDto(CarEntity entity);

}
