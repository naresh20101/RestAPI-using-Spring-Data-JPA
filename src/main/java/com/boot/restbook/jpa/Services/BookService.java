package com.boot.restbook.jpa.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.boot.restbook.jpa.Model.Book;
import com.boot.restbook.jpa.dao.BookRepository;
@Component
public class BookService {
	@Autowired
	private BookRepository bookRepository;
//get all books
	public List<Book> getAllBooks()
	{
		List<Book> list=(List<Book>) this.bookRepository.findAll();
		return list;
	}

	//get single book by id
	
	public Book geById(int id)
	{
		Book book=null;
		try {
		
		
		book=this.bookRepository.findById(id);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return book;
		
	}
	//add book
	public Book addBook(Book b)
	{
		Book result= bookRepository.save(b);
		return result;
	}
	//delete book
	public void deleteBook(int id)
	{
		bookRepository.deleteById(id);
	}
	//update book
	public void updateBook(Book book,int id)
	{
		book.setId(id);
		bookRepository.save(book);
	}

}
