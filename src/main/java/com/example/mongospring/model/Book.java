package com.example.mongospring.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "book") 
public class Book {
	
	@Id 
	private ObjectId id;
	private String name;
	private String author;
	
	
	public ObjectId getId() {
		return id;
	}

	public void set_id(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
