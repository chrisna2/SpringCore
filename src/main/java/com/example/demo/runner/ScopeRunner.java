package com.example.demo.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.example.demo.compo.ProtoComp;
import com.example.demo.compo.SingleComp;
import com.example.demo.repo.BookRepository;

@Component
public class ScopeRunner implements ApplicationRunner {
	
	@Autowired
	SingleComp single;
	
	@Autowired
	ProtoComp proto;
	
	@Autowired
	ApplicationContext ctx;
	
	@Autowired
	BookRepository repository;
	
	@Value("${app.name}")
	String appName;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(proto);
		System.out.println(single.getProto());
		
		System.out.println("==proto==");
		System.out.println(ctx.getBean(ProtoComp.class));
		System.out.println(ctx.getBean(ProtoComp.class));
		System.out.println(ctx.getBean(ProtoComp.class));
		
		System.out.println("==single==");
		System.out.println(ctx.getBean(SingleComp.class));
		System.out.println(ctx.getBean(SingleComp.class));
		System.out.println(ctx.getBean(SingleComp.class));
		
		System.out.println("==proto by Single==");
		System.out.println(ctx.getBean(SingleComp.class).getProto());
		System.out.println(ctx.getBean(SingleComp.class).getProto());
		System.out.println(ctx.getBean(SingleComp.class).getProto());
		
		Environment environment = ctx.getEnvironment();
		System.out.println(Arrays.toString(environment.getActiveProfiles()));
		System.out.println(Arrays.toString(environment.getDefaultProfiles()));
		/*
		 이클립스에서 해당 프로파일을 설정 하기 위해선 Run > Run as configuratin > profile 설정
		 */
		System.out.println("-- 프로퍼티 설정 자바에서 --");
		System.out.println(environment.getProperty("app.name"));
		System.out.println(environment.getProperty("app.about"));
		System.out.println(appName);
		
		
		
	}

}
