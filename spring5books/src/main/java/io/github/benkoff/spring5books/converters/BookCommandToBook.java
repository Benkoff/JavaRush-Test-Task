package io.github.benkoff.spring5books.converters;

import org.springframework.core.convert.converter.Converter;
import io.github.benkoff.spring5books.commands.BookCommand;
import io.github.benkoff.spring5books.domain.Book;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * Created by Ben on 2017-10-22.
 *
 */
@Component
public class BookCommandToBook implements Converter<BookCommand, Book> {
    @Nullable
    @Override
    public Book convert(BookCommand source) {
        if (source == null)
            return null;

        final Book book = new Book();
        book.setId(source.getId());
        book.setTitle(source.getTitle());
        book.setDescription(source.getDescription());
        book.setAuthor(source.getAuthor());
        book.setIsbn(source.getIsbn());
        book.setPrinted(source.getPrinted());
        book.setReadalready(source.isReadalready());

        return book;
    }
}
