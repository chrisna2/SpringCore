package com.example.demo.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.service.EventService;
import com.example.demo.service.SimpleEventService;

@Primary
@Service
public class EventServiceProxy implements EventService{
	
	@Autowired
	SimpleEventService enventService;
	
	@Override
	public void createEvent() {
		//long begin = System.currentTimeMillis();
		enventService.createEvent();
		//System.out.println(System.currentTimeMillis()-begin);
	}

	@Override
	public void publishEvent() {
		//long begin = System.currentTimeMillis();
		enventService.publishEvent();
		//System.out.println(System.currentTimeMillis()-begin);
	}

	@Override
	public void deleteEvent() {
		enventService.deleteEvent();
	}

}
