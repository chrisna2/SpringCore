package com.example.demo;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
public class DemoSpring51Application {

	/*
	@Autowired
	MyService service;//컴포넌트 스캔은 자기가 속한 하위 페키지의 범위 안에서 한다.
	 Field service in com.example.demo.DemoSpring51Application required a bean of type 
	 'com.example.out.MyService' that could not be found.
	 
	 컴포넌트 스캔은 거를 수도 있고 범위 지정이 가능하다.
	*/
	
	public static void main(String[] args) {
		SpringApplication.run(DemoSpring51Application.class, args);
	}
	
	
	//메세지 소스 관련 설정 
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource msgsrc =  new ReloadableResourceBundleMessageSource();
		msgsrc.setBasename("classpath:/messages");
		msgsrc.setDefaultEncoding("UTF-8");
		msgsrc.setDefaultLocale(Locale.US);
		return msgsrc;
	}

}
