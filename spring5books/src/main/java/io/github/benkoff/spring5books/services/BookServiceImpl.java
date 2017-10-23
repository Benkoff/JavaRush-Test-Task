package io.github.benkoff.spring5books.services;

import io.github.benkoff.spring5books.commands.BookCommand;
import io.github.benkoff.spring5books.converters.BookCommandToBook;
import io.github.benkoff.spring5books.converters.BookToBookCommand;
import io.github.benkoff.spring5books.domain.Book;
import io.github.benkoff.spring5books.repositories.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookCommandToBook bookCommandToBook;
    private final BookToBookCommand bookToBookCommand;

    public BookServiceImpl(BookRepository bookRepository,
                           BookCommandToBook bookCommandToBook,
                           BookToBookCommand bookToBookCommand) {
        this.bookRepository = bookRepository;
        this.bookCommandToBook = bookCommandToBook;
        this.bookToBookCommand = bookToBookCommand;
    }

    // this realization is based on CrudRepository extension but there is
    // PagingAndSortingRepository which makes all the same and even more under the hood
    @Override
    public Set<Book> getAllBooks(String sample) {
        Set<Book> books = new HashSet<>();
        bookRepository.findAll().iterator().forEachRemaining(books::add);

        // I have no idea where to put the form receiving String sample
        if (!sample.equals("") && !sample.equals(null)) {
            Set<Book> filteredTitles = books.stream()
                    .filter(i -> i.getTitle().toLowerCase().contains(sample.toLowerCase()))
                    .collect(Collectors.toSet());
            Set<Book> filteredAuthors = books.stream()
                    .filter(i -> i.getAuthor().toLowerCase().contains(sample.toLowerCase()))
                    .collect(Collectors.toSet());
            books = new HashSet<>();
            books.addAll(filteredTitles);
            books.addAll(filteredAuthors);
        }

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
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    @Transactional
    public BookCommand saveBookCommand(BookCommand command) {
        Book detachedBook = bookCommandToBook.convert(command);
        Book savedBook = bookRepository.save(detachedBook);

        return bookToBookCommand.convert(savedBook);
    }

    @Override
    public Long getNextId() {
        return getAllBooks("").stream().map(i -> i.getId()).max(Long::compare).get() + 1;
    }

    @Override
    @Transactional
    public BookCommand findCommandById(Long id) {
        return bookToBookCommand.convert(findById(id));
    }
}
