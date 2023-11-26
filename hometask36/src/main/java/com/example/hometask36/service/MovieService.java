package com.example.hometask36.service;

import com.example.hometask36.domain.MovieEntity;

import java.util.List;

public interface MovieService {

    public List<MovieEntity> getMovies();

    public void save(MovieEntity movie);

    public void update(Integer id, Integer rate);
}

