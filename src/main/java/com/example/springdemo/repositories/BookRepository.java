package com.example.springdemo.repositories;

import com.example.springdemo.entities.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long>{
    List<Book> findbyTitle(String title);
}
