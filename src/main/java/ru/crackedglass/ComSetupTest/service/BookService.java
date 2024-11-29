package ru.crackedglass.ComSetupTest.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    private List<String> books;

    public BookService() {
        books = List.of("Anna Karenina", "War and peace", "Eugene Onegin");
    }

    public List<String> findAll() {
        return books;
    }

    public String findById(int id) {
        return books.get(id);
    }
}
