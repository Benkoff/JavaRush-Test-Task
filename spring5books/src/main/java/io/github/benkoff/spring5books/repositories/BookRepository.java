package io.github.benkoff.spring5books.repositories;

import io.github.benkoff.spring5books.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ben on 2017-10-18.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
