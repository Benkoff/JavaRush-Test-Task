package io.github.benkoff.spring5books.services;

import io.github.benkoff.spring5books.model.Book;
import io.github.benkoff.spring5books.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Set<Book> getAllBooks() {
        Set<Book> books = new HashSet<>();
        bookRepository.findAll().iterator().forEachRemaining(books::add);

        return books;
    }
}
