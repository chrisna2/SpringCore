package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.repo.BookRepository;
import com.example.demo.repo.MyBookRepo;

@Configuration
//테스트라는 프로파일에서만 사용가능함
public class ProfileTestConfig {
	
	@Bean
	@Profile("test")
	public BookRepository bookRepository() {
		return new MyBookRepo();
	}

}
