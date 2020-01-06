package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.annotation.PerfLogging;

@Service
public class SimpleEventService implements EventService{

	@Override
	@PerfLogging
	public void createEvent() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Created an event");
	}

	@Override
	@PerfLogging
	public void publishEvent() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Published an event");
	}

	@Override
	public void deleteEvent() {
		System.out.println("Deleted an event");
		
	}
	


}
