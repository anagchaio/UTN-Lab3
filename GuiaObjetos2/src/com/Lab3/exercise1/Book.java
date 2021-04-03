package com.Lab3.exercise1;

public class Book {

    private String title;
    private Double price;
    private Integer stock;
    private Author author;
    private Author[] authors;

    public Book(String title, Double price, Integer stock, Author author) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.author = author;
    }
    public Book(String title, Double price, Integer stock, Author[] authors) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public void printBookData(){
        System.out.println("[The Book] Title: "+this.getTitle()+" of Author: "+this.getAuthor().getName()+" "+this.getAuthor().getSurname()+" is sold at $"+this.getPrice()+". Stock: "+this.getStock());
    }
    public void printAuthorsNames(){
        for (Author author:this.getAuthors()) {
            author.printAuthorFullName();
        }
    }
    public void printBook(){
        System.out.println("[The Book] Title: "+this.getTitle()+" of ");
        this.printAuthorsNames();
        System.out.println(" is sold at $"+this.getPrice()+". Stock: "+this.getStock());
    }
    
}
