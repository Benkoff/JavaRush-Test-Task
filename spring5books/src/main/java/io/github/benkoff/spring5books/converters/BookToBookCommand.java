package io.github.benkoff.spring5books.converters;

import io.github.benkoff.spring5books.commands.BookCommand;
import io.github.benkoff.spring5books.domain.Book;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * Created by Ben on 2017-10-22.
 *
 */
@Component
public class BookToBookCommand implements Converter<Book, BookCommand> {
    @Nullable
    @Override
    public BookCommand convert(Book source) {
        if (source == null)
            return null;

        final BookCommand bookCommand = new BookCommand();
        bookCommand.setId(source.getId());
        bookCommand.setTitle(source.getTitle());
        bookCommand.setDescription(source.getDescription());
        bookCommand.setAuthor(source.getAuthor());
        bookCommand.setIsbn(source.getIsbn());
        bookCommand.setPrinted(source.getPrinted());
        bookCommand.setReadalready(source.isReadalready());

        return bookCommand;
    }
}
