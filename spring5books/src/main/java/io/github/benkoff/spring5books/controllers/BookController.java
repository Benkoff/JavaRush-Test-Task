package io.github.benkoff.spring5books.controllers;

import io.github.benkoff.spring5books.domain.Book;
import io.github.benkoff.spring5books.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping("/book/delete/{id}")
    public String deleteBook(@PathVariable String id, Model model) {
        model.addAttribute("delete", bookService.deleteAllById(new Long(id)));

        return "/book/delete";
    }

    @RequestMapping("/book/read/{id}")
    public String readBook(@PathVariable String id, Model model) {
        model.addAttribute("read", bookService.readById(new Long(id)));

        return "/book/read";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(Book book, Model model){
        model.addAttribute("save", bookService.saveById(new Long(id)));

        return "redirect:/books";
    }
}
