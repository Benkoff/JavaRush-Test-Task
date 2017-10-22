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
    public Book findById(Long id) {
        Optional<Book> bookOptional = bookRepository.findById(id);
        if (!bookOptional.isPresent()) {
            throw new RuntimeException("Book not found!");
        }

        return bookOptional.get();
    }

    @Override
    public Set<Book> addBook() {
        return new HashSet<Book>();
    }

    @Override
    public Set<Book> deleteAllById(Long id) {
//        Book book = findById(id);
//        Set<Book> books = getAllBooks();

//        bookRepository.deleteAll(new Long(id));
        return null;
    }

    @Override
    public Book readById(Long id) {
//
        return null;
    }

    @Override
    public Book saveById(Long id) {
        Book book = findById(id);
        bookRepository.save(book);

        return book;
    }
}
