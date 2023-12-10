package com.example.hometask36.service;

import com.example.hometask36.domain.MovieEntity;
import com.example.hometask36.dto.MovieSearchDto;
import com.example.hometask36.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.Predicate;
import javax.transaction.Transactional;
import java.util.ArrayList;
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

    @Override
    public List<MovieEntity> findByCriteria(MovieSearchDto searchDto) {
        Specification<MovieEntity> spec = createSpec(searchDto);
        return repository.findAll(spec);
    }

    private Specification<MovieEntity> createSpec(MovieSearchDto searchDto) {
        return (root, query, builder) -> {
            String title = searchDto.getTitle();
            String genre = searchDto.getGenre();
            Integer rateFrom = searchDto.getRateFrom();
            Integer rateTo = searchDto.getRateTo();

            var predicates = new ArrayList<Predicate>();

            if (title != null && !title.isBlank()) {
                Predicate titleEq = builder.equal(root.get("title"), title);
                predicates.add(titleEq);
            }

            if (genre != null && !genre.isBlank()) {
                Predicate genreEq = builder.equal(root.get("genre"), genre);
                predicates.add(genreEq);
            }

            if (rateFrom != null) {
                Predicate rateGt = builder.gt(root.get("rate"), rateFrom);
                predicates.add(rateGt);
            }

            if (rateTo != null) {
                Predicate rateLt = builder.lt(root.get("rate"), rateTo);
                predicates.add(rateLt);
            }

            Predicate[] array = predicates.toArray(Predicate[]::new);

            return builder.and(array);
        };
    }
}
