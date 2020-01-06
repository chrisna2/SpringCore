package com.example.demo.repo;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository 
@Primary//최 우선 순위 빈 설정
@Profile("!prod")//프로파일의 조건은 여러개로 나열 할 수 있다.
/*
 * ! : not
 * & : and
 * | : or
 */
public class MyBookRepo implements BookRepository{
	
	/*
	Description:

	Field bookRepository in com.example.demo.BookService required a single bean, but 2 were found:
		- hkBookRepo: defined in file [C:\kcc_dev\workspace\spring\demoSpring51\target\classes\com\example\demo\HkBookRepo.class]
		- myBookRepo: defined in file [C:\kcc_dev\workspace\spring\demoSpring51\target\classes\com\example\demo\MyBookRepo.class]
	
	
	Action:
	
	Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed
	 */

}
