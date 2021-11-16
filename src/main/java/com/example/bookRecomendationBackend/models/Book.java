package com.example.bookRecomendationBackend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BOOK_TABLE")

public class Book {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String author;
    private  int yearPublished;
    private  String edition;
    private String publisher;
    private int yearPrescribed;
    private String module;
}
