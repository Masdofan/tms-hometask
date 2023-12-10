package com.example.hometask36.service;

import com.example.hometask36.domain.MovieEntity;
import com.example.hometask36.dto.MovieSearchDto;

import java.util.List;

public interface MovieService {

    public List<MovieEntity> getMovies();

    public void save(MovieEntity movie);

    public void update(Integer id, Integer rate);

    List<MovieEntity> findByCriteria(MovieSearchDto searchDto);
}

