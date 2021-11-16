package com.example.bookRecomendationBackend.controller;


import com.example.bookRecomendationBackend.models.Book;
import com.example.bookRecomendationBackend.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping("/prescribedbook")
    public Book addBooks(@RequestBody Book book) {
        return service.saveBook(book);
    }

    @PostMapping("/prescribedbooks")
    public List<Book> addProducts(@RequestBody List<Book> bookLists) {
        return service.saveBooks(bookLists);
    }

    @GetMapping("/prescribedbooks")
    public List<Book> findAllProducts() {
        return service.getBooks();
    }

    @GetMapping("/prescribedbooks/{id}")
    public Book findProductById(@PathVariable int id) {
        return service.getBookId(id);
    }

    @PutMapping("/prescribedbooks")
    public Book updateBook(@RequestBody Book book) {
        return service.updateBook(book);
    }

    @DeleteMapping("/prescribedbooks/{id}")
    public String deleteBook(@PathVariable int id) {
        return service.deleteBook(id);
    }

}
