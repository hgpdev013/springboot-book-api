package com.example.softeng.demo.models;

public class Book {
    private String gender;
    private String name;
    private String author;

    public Book(String gender, String name, String author){
        this.gender = gender;
        this.name = name;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
