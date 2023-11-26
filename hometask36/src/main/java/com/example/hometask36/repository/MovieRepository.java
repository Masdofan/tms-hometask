package com.example.hometask36.repository;

import com.example.hometask36.domain.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {

    @Modifying
    @Query(value = "update MovieEntity set rate = :rate where id = :id")
    void updateRate(Integer id, Integer rate);

}
