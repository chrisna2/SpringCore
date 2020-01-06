package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.repo.BookRepository;

@Service
public class BookService {
	
	@Autowired 
	//@Qualifier("hkBookRepo")//클래스 명의 소문자로 시작
	List<BookRepository> bookRepository;
	//여러개의 상속 빈을 모두 받을 경우 다음과 같이 List목록으로 설정가능
	
	public void printBookRepository() {
		bookRepository.forEach(System.out::println);
		//System.out.println(bookRepository.getClass());
	}
	
//	@Autowired
//	public BookService(BookRepository bookRepository) {
//		this.bookRepository = bookRepository;
//	}
	
//	@Autowired(required = false)
//	public void setBookRepository(BookRepository bookRepository) {
//		this.bookRepository = bookRepository;
//	}
	
	/**
	 * Parameter 0 of constructor in com.example.demo.BookService required a bean of type 
	 * 'com.example.demo.BookRepository' that could not be found.
	 * 
	 * 해당 타입의 빈을 찾을 수 없어서 발생하는 문제
	 * 따라서 Autowired 를 사용하기 위해서는 빈등록 설정이 필수 적이다.
	 * @component @repository
	 * @Service 등등등
	 * 
	 */

}
