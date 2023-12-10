package com.example.hometask35.service;

import com.example.hometask35.domain.MovieEntity;

import java.util.List;

public interface MovieService {

    public List<MovieEntity> getMovies();

    public void save(MovieEntity movie);
}

