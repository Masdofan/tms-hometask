package com.example.hometask46_les46.mapper;

import com.example.hometask46_les46.dto.OrderDto;
import com.example.hometask46_les46.model.OrderEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderEntity toEntity(OrderDto dto);

    OrderDto toDto (OrderEntity entity);

}
