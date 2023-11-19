package com.example.hometask35.service;

import com.example.hometask35.domain.MovieEntity;
import com.example.hometask35.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class MovieServiceImpl implements MovieService{

    private final MovieRepository repository;

    public List<MovieEntity> getMovies() {
        return repository.findAll();
    }

    public void save(MovieEntity movie) {
        repository.save(movie);
    }

}
