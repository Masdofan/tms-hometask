package com.example.hometask36.service;

import com.example.hometask36.domain.MovieEntity;
import com.example.hometask36.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
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

    @Override
    @Transactional
    public void update(Integer id, Integer rate) {
        repository.updateRate(id, rate);
    }
}
