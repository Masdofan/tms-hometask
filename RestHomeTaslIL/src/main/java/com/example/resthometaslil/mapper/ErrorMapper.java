package com.example.resthometaslil.mapper;

import com.example.resthometaslil.dto.IlErrorMessage;
import com.example.resthometaslil.exc.StoreFailedException;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ErrorMapper {
    @Mapping(target = "errorDetails", source = "errorMessage")
    @Mapping(target = "serviceName", source = "serviceName")
    @Mapping(target = "action", ignore = true)
    IlErrorMessage toIl(StoreFailedException exc);
}