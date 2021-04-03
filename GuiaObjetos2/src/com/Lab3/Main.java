package com.Lab3;

import com.Lab3.exercise1.Author;
import com.Lab3.exercise1.Book;
import com.Lab3.exercise2.Client;
import com.Lab3.exercise2.Invoice;
import com.Lab3.exercise2.SalesItem;

public class Main {

    public static void main(String[] args) {
        /*Exercise1*/
        /*a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.*//*
        Author author1 = new Author("Joshua", "Bloch", "joshua@email.com", 'M');

        *//*b. Imprima por pantalla al autor previamente instanciado.*//*
        author1.printAuthorData();

        *//*c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450
        pesos con una cantidad de 150 copias.*//*
        Book book1 = new Book("Effective Java",450.00,150,author1);
        *//*d. Imprima por pantalla el libro instanciado.*//*
        book1.printBookData();
        *//*e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
        cantidad en 50 copias.*//*
        book1.setPrice(500.00);
        book1.setStock(book1.getStock()+50);
        *//*f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el
        Libro “Effective Java”.*//*
        book1.getAuthor().printAuthorData();
        *//*g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
        siguiente mensaje:
        “El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”*//*
        book1.printBookData();
        *//*h. Modificar la clase Libro, para que acepte más de 1 Autor. Y realizar los
        cambios necesarios en el método del punto g, para imprimir un nuevo
        mensaje que liste los autores que contribuyeron a ese libro.*//*
        Author author2 = new Author("Ana", "Chaio", "anagchaio@email.com", 'F');
        Author[] authors = {author1,author2};
        Book book2 = new Book("Java Beginners",1245.50,50,authors);
        book2.printBook();*/
        /*Exercise2*/
        Client client = new Client("Ana Paula","anagchaio@gmail.com",15.00);
        SalesItem item1 = new SalesItem("Shoes","Kids",500.00);
        SalesItem item2 = new SalesItem("Shirt","Kids",150.00);
        SalesItem item3 = new SalesItem("Pants","Kids",99.00);
        SalesItem[] items = {item1,item2,item3};
        Invoice invoice = new Invoice(client,items);
        invoice.printInvoice();
    }
}
