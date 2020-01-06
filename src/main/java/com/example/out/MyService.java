package com.example.out;

import org.springframework.stereotype.Service;

@Service
public class MyService {

	//ApplicationRunner 클래스 밖에 패키지의 경우 정상적으로 Autowired를 주입 받지 못한다.
}
