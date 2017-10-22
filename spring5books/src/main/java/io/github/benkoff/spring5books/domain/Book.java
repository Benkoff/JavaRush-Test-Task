package io.github.benkoff.spring5books.domain;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by Benkoff on 2017-10-18.
 *
 */

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private String author;
    private String isbn;
    private int printed;
    private boolean readalready;

    public Book() {
    }

    public Book(String title, String description, String author, String isbn, int printed, boolean readalready) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.isbn = isbn;
        this.printed = printed;
        this.readalready = readalready;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPrinted() {
        return printed;
    }

    public void setPrinted(int printed) {
        this.printed = printed;
    }

    public boolean isReadalready() {
        return readalready;
    }

    public void setReadalready(boolean readalready) {
        this.readalready = readalready;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", printed=" + printed +
                ", readalready=" + readalready +
                '}';
    }
}
