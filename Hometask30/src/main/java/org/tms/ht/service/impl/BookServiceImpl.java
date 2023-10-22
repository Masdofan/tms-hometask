package org.tms.ht.service.impl;

import org.springframework.stereotype.Service;
import org.tms.ht.domain.Book;
import org.tms.ht.service.BookService;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    List<Book> books = new ArrayList<>();

    @Override
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public void save(Book book) {

        books.add(book);

        String name = book.getName();

//        if (name == null || name.isBlank()) {
//            throw new RuntimeException();
//        }

    }
}