package io.github.benkoff.spring5books.controllers;

import io.github.benkoff.spring5books.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/book/show/{id}")
    public String showById(@PathVariable String id, Model model) {
        model.addAttribute("book", bookService.findById(new Long(id)));

        return "book/show";
    }
}
