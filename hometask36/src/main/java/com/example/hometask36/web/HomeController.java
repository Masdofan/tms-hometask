package com.example.hometask36.web;

import com.example.hometask36.domain.MovieEntity;
import com.example.hometask36.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@Controller
@RequestMapping
public class HomeController {

    private final MovieService movieService;

    @GetMapping("/home")
    public ModelAndView homePage(@ModelAttribute(name = "movie") MovieEntity movie) {
        ModelAndView modelAndView = new ModelAndView("home");

        modelAndView.addObject("movies", movieService.getMovies());

        return modelAndView;
    }

    @PostMapping("/save")
    public String save(@ModelAttribute MovieEntity movie) {
        ModelAndView modelAndView = new ModelAndView("home");
        movieService.save(movie);
        modelAndView.addObject("movies", movieService.getMovies());
        return "redirect:/home";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute MovieEntity movie, Integer id, Integer newRate){
//        ModelAndView modelAndView = new ModelAndView("home");
        movieService.update(id, newRate);

//        modelAndView.addObject("movies", movieService.getMovies());
        return "redirect:/home";
    }

}
