package org.tms.ht.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.tms.ht.domain.Book;
import org.tms.ht.service.BookService;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/home")
public class HomeController {

    private BookService bookService;

    public ModelAndView homePage(@ModelAttribute(name = "book") Book book) {

        ModelAndView modelAndView = new ModelAndView("home");

        modelAndView.addObject("books", bookService.getBooks());

        return modelAndView;
    }


    @GetMapping
    public String homepage() {
        bookService.getBooks();
        return "home";
    }

    @PostMapping
    public ModelAndView addBook(@ModelAttribute(name = "book") @Valid Book book, BindingResult result) {
        bookService.save(book);

        ModelAndView modelAndView = new ModelAndView("home");

        List<FieldError> fieldErrors = result.getFieldErrors();

        if (result.hasFieldErrors()) {
            result.getFieldErrors()
                    .forEach(fieldError -> {
                        String field = fieldError.getField();
                        String defaultMessage = fieldError.getDefaultMessage();

                        modelAndView.addObject(field + "Error", defaultMessage);

                    });
        }

        modelAndView.addObject("books", bookService.getBooks());
        return modelAndView;
    }

}