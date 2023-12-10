package com.example.hometask35.web;

import com.example.hometask35.domain.MovieEntity;
import com.example.hometask35.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@Controller
@RequestMapping
public class HomeController {

    private final MovieService movieService;

    @GetMapping("/home")
    public ModelAndView homePage() {
        ModelAndView modelAndView = new ModelAndView("home");

        modelAndView.addObject("movies", movieService.getMovies());

        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView save(MovieEntity movie) {
        ModelAndView modelAndView = new ModelAndView("home");
        movieService.save(movie);
        modelAndView.addObject("movies", movieService.getMovies());
        return modelAndView;
    }

}
