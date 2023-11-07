package com.example.softeng.demo.controllers;

import com.example.softeng.demo.models.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    private static final List<Book>
            books = new ArrayList<Book>();

    public BookController() {
        books.add(new Book("Fantasia","Harry Potter e o Cálice de Fogo","J.K. Rowling"));
        books.add(new Book("Filosófico","A Divina Comédia - Inferno","Dante Alighieri"));
        books.add(new Book("Fantasia", "Percy Jackson e o Ladrão de Raios", "Rick Riordan"));
    }

    @GetMapping
    public String getBooks(Model model)
    {
        model.addAttribute("books",books);
        return "books";
    }
}
