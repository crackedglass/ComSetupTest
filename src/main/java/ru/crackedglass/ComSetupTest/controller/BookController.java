package ru.crackedglass.ComSetupTest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.crackedglass.ComSetupTest.service.BookService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping()
    public List<String> findAll() {
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public String findOne(@PathVariable int id) {
        return bookService.findById(id);
    }

}
