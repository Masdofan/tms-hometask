package com.example.resthometaskbl.mapper;

import com.example.resthometaskbl.dto.CarDto;
import com.example.resthometaskbl.model.CarEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-16T22:40:48+0300",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.8.1 (Amazon.com Inc.)"
)
@Component
public class CarMapperImpl implements CarMapper {

    @Override
    public CarEntity toEntity(CarDto dto) {
        if ( dto == null ) {
            return null;
        }

        CarEntity carEntity = new CarEntity();

        carEntity.setId( dto.getId() );
        carEntity.setModel( dto.getModel() );
        carEntity.setNumber( dto.getNumber() );

        return carEntity;
    }

    @Override
    public CarDto toDto(CarEntity entity) {
        if ( entity == null ) {
            return null;
        }

        CarDto carDto = new CarDto();

        carDto.setId( entity.getId() );
        carDto.setModel( entity.getModel() );
        carDto.setNumber( entity.getNumber() );

        return carDto;
    }
}
