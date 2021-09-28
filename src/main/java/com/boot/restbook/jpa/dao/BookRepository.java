package com.boot.restbook.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.boot.restbook.jpa.Model.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	public Book findById(int id);

}
