package io.github.benkoff.spring5books.services;

import io.github.benkoff.spring5books.model.Book;
import java.util.Set;

public interface BookService {
    Set<Book> getAllBooks();
}
