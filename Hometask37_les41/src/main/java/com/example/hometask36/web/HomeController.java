package com.example.hometask36.web;

import com.example.hometask36.domain.MovieEntity;
import com.example.hometask36.dto.MovieSearchDto;
import com.example.hometask36.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping
public class HomeController {

    private final MovieService movieService;

    @GetMapping("/")
    public ModelAndView homePage(@ModelAttribute(name = "movie") MovieEntity movie, @ModelAttribute(name = "searchDto") MovieSearchDto searchDto) {
        ModelAndView modelAndView = new ModelAndView("home");

        modelAndView.addObject("movies", movieService.getMovies());

        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute(name = "movie") MovieEntity movie) {
        ModelAndView modelAndView = new ModelAndView("home");
        movieService.save(movie);
        modelAndView.addObject("movies", movieService.getMovies());
        modelAndView.addObject("searchDto", new MovieSearchDto());
        return modelAndView;
    }

    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute(name = "movie") MovieEntity movie, Integer id, Integer newRate){
        ModelAndView modelAndView = new ModelAndView("home");
        movieService.update(id, newRate);
        modelAndView.addObject("searchDto", new MovieSearchDto());
        modelAndView.addObject("movies", movieService.getMovies());
        return modelAndView;
    }

    @PostMapping("/search")
    public ModelAndView search(MovieSearchDto searchDto) {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("movies", movieService.getMovies());

        modelAndView.addObject("movie", new MovieEntity());
        modelAndView.addObject("searchDto", new MovieSearchDto());

        List<MovieEntity> result = movieService.findByCriteria(searchDto);

        modelAndView.addObject("movies", result);

        return modelAndView;
    }

}
