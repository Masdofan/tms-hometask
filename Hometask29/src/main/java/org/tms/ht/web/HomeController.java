package org.tms.ht.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.tms.ht.domain.Book;
import org.tms.ht.service.BookService;

import javax.servlet.http.HttpServletRequest;

@AllArgsConstructor
@Controller
@RequestMapping("/home")
public class HomeController {

    private BookService bookService;


    @GetMapping
    public String homepage() {
//        bookService.getBook();
        return "home";
    }

    @PostMapping
    public String addBook(Book book) {
        bookService.save(book);
        return "home";
    }

    @ExceptionHandler(RuntimeException.class) 
    public  String processError() {
        System.out.println("GET ERROR");
        return "error";
    }

}




