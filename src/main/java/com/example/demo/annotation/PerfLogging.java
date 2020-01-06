package com.example.demo.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)//어노테이션 만들기 : 클래스 안에서만 작동(기본값 Class)
@Target(ElementType.METHOD)//어노테이션 사용 위치 : 메서드
@Documented
public @interface PerfLogging {

}
