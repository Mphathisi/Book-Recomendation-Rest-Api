package com.example.bookRecomendationBackend.repository;

import com.example.bookRecomendationBackend.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReposatory extends JpaRepository<Book,Integer> {

}
