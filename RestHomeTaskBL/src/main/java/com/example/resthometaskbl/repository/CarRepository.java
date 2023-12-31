package com.example.resthometaskbl.repository;

import com.example.resthometaskbl.model.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarEntity, Integer> {
}
