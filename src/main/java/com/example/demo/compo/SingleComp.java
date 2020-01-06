package com.example.demo.compo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingleComp {
//기본적으로 스프링에서 등록된 빈은 싱글톤이다.
//ApplicationRunner 구동시 해당 싱글톤 객체가 생성된다. 따라서 그로인해 초반에 속도 저하가 발생할 수 있다.
	
	@Autowired
	ProtoComp proto;

	public ProtoComp getProto() {
		return proto;
	}

	public void setProto(ProtoComp proto) {
		this.proto = proto;
	}

}
