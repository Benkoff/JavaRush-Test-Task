package io.github.benkoff.spring5books.controllers;

import io.github.benkoff.spring5books.commands.BookCommand;
import io.github.benkoff.spring5books.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

        return "/book/show";
    }

    @RequestMapping("book/new")
    public String newBook(Model model) {
        model.addAttribute("book", new BookCommand());

        return "book/bookform";
    }

    @RequestMapping("book/read/{id}")
    public String readBook(@PathVariable String id, Model model) {
        BookCommand command = bookService.findCommandById(new Long(id));
        if (!command.isReadalready()) {
            command.setReadalready(true);
        }
        bookService.saveBookCommand(command);
        model.addAttribute("book", command);

        return "redirect:/books";
    }

    @RequestMapping("book/delete/{id}")
    public String deleteBook(@PathVariable String id) {
        bookService.deleteById(new Long(id));

        return "redirect:/books";
    }

    @PostMapping
    @RequestMapping("book")
    public String saveBook(@ModelAttribute BookCommand command) {
        // in fact it doesn't work because of prior wrong type error in BookCommand field
        if (!new Integer(command.getPrinted()).toString().matches("\\d+")) {
            return "book";
        }
        BookCommand savedCommand = bookService.saveBookCommand(command);

        return "redirect:/books";
    }

    @PostMapping
    @RequestMapping("book/update")
    public String updateBook(@ModelAttribute BookCommand command) {
        // in fact it doesn't work because of prior wrong type error in BookCommand field
        if (!new Integer(command.getPrinted()).toString().matches("\\d+")) {
            return "book";
        }
        Long id = command.getId();
        command.setAuthor(bookService.findById(id).getAuthor());
        command.setReadalready(false);
        BookCommand savedCommand = bookService.saveBookCommand(command);

        return "redirect:/books";
    }
}
