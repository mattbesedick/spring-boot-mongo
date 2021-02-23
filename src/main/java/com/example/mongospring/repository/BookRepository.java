package com.example.mongospring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongospring.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {
	
}
