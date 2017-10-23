package io.github.benkoff.spring5books.controllers;

import io.github.benkoff.spring5books.domain.Sample;
import io.github.benkoff.spring5books.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Benkoff on 2017-10-19.
 */

@Controller
public class BookshelfController {
    private final BookService bookService;
    private Sample sample = new Sample();

    public BookshelfController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping({"", "/", "index"})
    public String getIndex(Model model) {
        return "index";
    }

    @PostMapping
    @RequestMapping("/books")
    public String sampleSubmit(@ModelAttribute Sample sample, Model model) {
        if (!sample.equals(null) && !sample.getContent().equals(null))
            this.sample = sample;
        model.addAttribute("sample", sample);
        model.addAttribute("books", bookService.getAllBooks(sample.getContent()));

        return "books";
    }
}
