package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.example.demo.event.MyEvent;

@Component
public class EventRunner implements ApplicationRunner{
	
	@Autowired
	ApplicationEventPublisher pubEvent;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("== 이벤트 발생 ==");
		pubEvent.publishEvent(new MyEvent(this, 100));
	}

}
