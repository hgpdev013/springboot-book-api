package com.example.softeng.demo.controllers;

import com.example.softeng.demo.models.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookApiController {
    private static final List<Book>
            books = new ArrayList<Book>();

    public BookApiController() {
        books.add(new Book("Fantasia", "Harry Potter e o Cálice de Fogo", "J.K. Rowling"));
        books.add(new Book("Filosófico", "A Divina Comédia - Inferno", "Dante Alighieri"));
        books.add(new Book("Fantasia", "Percy Jackson e o Ladrão de Raios", "Rick Riordan"));
    }

    @GetMapping
    public List<Book> getBooks(){
        return books;
    }
}
