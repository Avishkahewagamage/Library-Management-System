/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.app.service;

import com.example.app.data.BookRepository;
import com.example.app.entity.Book;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */
@Service
public class BookService {
    
    @Autowired
     private BookRepository bookRepository;

    public List<Book> findAllBook() {
        return bookRepository.findAll();
        
    }
    
    public Book getBookById(int id)
    {
        Optional<Book>bookOptional=bookRepository.findById(id);
        return bookOptional.get();
    }
    
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
    
    public Book updateBook(Book book)
    {
        return bookRepository.save(book);
    }
    
     public void  deleteBookById(int id)
    {
        bookRepository.deleteById(id);
    }
    
     public List<Book> findBookByName(String name){
        return bookRepository.findBookByName(name);

    }
}


   