package com.example.demo.runner;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class MassageRunner implements ApplicationRunner{
	
	@Autowired
	MessageSource msg;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("==국제화 기능을 제공하는 메세지 인터페이스==");
		System.out.println(msg.getClass());
		System.out.println(msg.getMessage("greeting", new String[]{"나현기"}, Locale.KOREA));
		System.out.println(msg.getMessage("greeting", new String[]{"Hyun Kee"}, Locale.getDefault()));
	}
}
