package io.github.benkoff.spring5books.controllers;

import io.github.benkoff.spring5books.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Benkoff on 2017-10-19.
 */

@Controller
public class BookshelfController {
    private final BookService bookService;

    public BookshelfController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping({"", "/", "index"})
    public String getIndex(Model model) {
        return "index";
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());

        return "books";
    }

    @RequestMapping("/book/add")
    public String addBook(Model model) {
        model.addAttribute("add", bookService.addBook());

        return "/book/add";
    }
}

