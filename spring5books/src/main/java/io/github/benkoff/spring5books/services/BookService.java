package io.github.benkoff.spring5books.services;

import io.github.benkoff.spring5books.model.Book;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public interface BookService {
    Set<Book> getAllBooks();
}
