package com.example.hometask46_les46.repository;

import com.example.hometask46_les46.model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
}
