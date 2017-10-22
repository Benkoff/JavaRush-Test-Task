package io.github.benkoff.spring5books.services;

import io.github.benkoff.spring5books.domain.Book;
import java.util.Set;

public interface BookService {
    Set<Book> getAllBooks();
    Book findById(Long id);
    Set<Book> addBook();
    Set<Book> deleteAllById(Long id);
    Book readById(Long id);
    Book saveById(Long id);
}
