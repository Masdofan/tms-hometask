package org.tms.ht.service.impl;

import org.springframework.stereotype.Service;
import org.tms.ht.domain.Book;
import org.tms.ht.service.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Override
    public void getBook() {

    }

    @Override
    public void save(Book book) {

        String name = book.getName();

        if (name == null || name.isBlank()) {
            throw new RuntimeException();
        }

        System.out.println("save book");

    }
}
