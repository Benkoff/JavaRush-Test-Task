package io.github.benkoff.spring5books.services;

import io.github.benkoff.spring5books.domain.Book;
import java.util.Set;

public interface BookService {
    Set<Book> getAllBooks();
    Book findById(Long i);
    Set<Book> addBook();
}
