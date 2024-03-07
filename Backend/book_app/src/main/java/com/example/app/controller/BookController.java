/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.app.controller;

import com.example.app.entity.Book;
import com.example.app.service.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lenovo
 */

@RestController
public class BookController {
    
     @Autowired
    private BookService bookService;
    
    @GetMapping(path = "/books")
    public List<Book> getAllBook(){
        return bookService.findAllBook();
    
}

    @GetMapping(path ="/books/{id}")
    public Book getBookById(@PathVariable int id)
    {
       return bookService.getBookById(id);
    }

    @PostMapping(path = "/books")
    public Book createBook(@RequestBody Book book)
    {
        return bookService.createBook(book);
    }
    
    @PutMapping(path = "/books")
    public Book updateBook(@RequestBody Book book)
    {
        return bookService.updateBook(book);
    }
    
    @DeleteMapping(path = "/books/{id}")
    public void deleteBookById(@PathVariable int id)
    {
        bookService.deleteBookById(id);
    }
    
    
    @GetMapping(path="/books" , params = "name")
    public List<Book>findBookByName(@RequestParam String name) {
        return bookService.findBookByName(name);

    }
}

    