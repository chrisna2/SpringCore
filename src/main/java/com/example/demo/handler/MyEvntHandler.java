package com.example.demo.handler;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.demo.event.MyEvent;

@Component
public class MyEvntHandler{

	@EventListener
	public void run(MyEvent event) {
		System.out.println("이벤트 받음, 데이터 => "+event.getData());
		
	}

}
