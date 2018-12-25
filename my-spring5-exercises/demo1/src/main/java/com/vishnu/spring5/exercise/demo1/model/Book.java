package com.vishnu.spring5.exercise.demo1.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String title;
	private String isbin;
	private String publisher;
	
	@ManyToMany
	@JoinTable(name = "author_books", joinColumns = @JoinColumn(name="book_id"), 
	inverseJoinColumns = @JoinColumn(name="author_id"))
	private Set<Author> authors = new HashSet<>();

	
	
	
	public Book(String title, String isbin, String publisher) {
		this.title = title;
		this.isbin = isbin;
		this.publisher = publisher;
	}




	public Book(String title, String isbin, String publisher, Set<Author> authors) {
		this.title = title;
		this.isbin = isbin;
		this.publisher = publisher;
		this.authors = authors;
	}
	
	
	

}
