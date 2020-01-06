package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.service.SimpleEventService;

@Component
public class AopRunner implements ApplicationRunner{
	
	@Autowired
	SimpleEventService eventService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("==Aop Runner==");
		eventService.createEvent();
		eventService.publishEvent();
		eventService.deleteEvent();
	}

}
