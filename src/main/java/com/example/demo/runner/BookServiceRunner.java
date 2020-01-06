package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.service.BookService;

@Component
public class BookServiceRunner implements ApplicationRunner{

	@Autowired
	BookService bookService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		bookService.printBookRepository();
	}
	

}
