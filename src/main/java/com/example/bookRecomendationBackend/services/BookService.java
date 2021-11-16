package com.example.bookRecomendationBackend.services;
import com.example.bookRecomendationBackend.models.Book;
import com.example.bookRecomendationBackend.repository.BookReposatory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookReposatory repository;

    public Book saveBook(Book book) {
        return repository.save(book);
    }

    public List<Book> saveBooks(List<Book> books) {
        return repository.saveAll(books);
    }

    public List<Book> getBooks() {
        return repository.findAll();
    }

    public Book getBookId(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteBook(int id) {
        repository.deleteById(id);
        return "Book removed !! " + id;
    }

    public Book updateBook(Book book) {
        return null;
    }

}
