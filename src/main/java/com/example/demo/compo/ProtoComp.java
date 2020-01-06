package com.example.demo.compo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//TARGET_CLASS : 다른 컴포넌트에서 호출해도 매번 다른 메모리 참조값을 불러 온다.
@Scope(value="prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ProtoComp {
	
	@Autowired
	SingleComp single;

	public SingleComp getSingle() {
		return single;
	}

	public void setSingle(SingleComp single) {
		this.single = single;
	}
	

}
