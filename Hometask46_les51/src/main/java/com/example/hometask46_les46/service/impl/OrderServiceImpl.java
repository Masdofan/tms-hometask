package com.example.hometask46_les46.service.impl;

import com.example.hometask46_les46.dto.OrderDto;
import com.example.hometask46_les46.mapper.OrderMapper;
import com.example.hometask46_les46.repository.OrderRepository;
import com.example.hometask46_les46.service.OrderService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    private final OrderMapper mapper;

    private final OrderRepository repository;

    @Override
    public OrderDto save(OrderDto dto) {
        var entity = mapper.toEntity(dto);

        var save = repository.save(entity);

        return mapper.toDto(save);
    }
}
