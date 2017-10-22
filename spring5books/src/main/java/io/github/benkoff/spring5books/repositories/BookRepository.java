package io.github.benkoff.spring5books.repositories;

import io.github.benkoff.spring5books.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Benkoff on 2017-10-18.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
