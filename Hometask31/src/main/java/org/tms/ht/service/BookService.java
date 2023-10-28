package org.tms.ht.service;

import org.tms.ht.domain.Book;

import java.util.List;

public interface BookService {

    List<Book> getBooks();

    public void save(Book book);
}