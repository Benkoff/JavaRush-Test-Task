package io.github.benkoff.spring5books.services;

import io.github.benkoff.spring5books.domain.Book;
import io.github.benkoff.spring5books.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
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

    @Override
    public Book findById(Long i) {
        Optional<Book> bookOptional = bookRepository.findById(i);
        if (!bookOptional.isPresent()) {
            throw new RuntimeException("Book not found!");
        }

        return bookOptional.get();
    }
}
