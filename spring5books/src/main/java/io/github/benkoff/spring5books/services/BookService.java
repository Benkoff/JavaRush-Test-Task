package io.github.benkoff.spring5books.services;

import io.github.benkoff.spring5books.commands.BookCommand;
import io.github.benkoff.spring5books.domain.Book;
import java.util.Set;

public interface BookService {
    Set<Book> getAllBooks(String sample);
    Book findById(Long id);
    void deleteById(Long id);
    BookCommand saveBookCommand(BookCommand command);
    BookCommand findCommandById(Long id);
}
