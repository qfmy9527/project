package com.spring.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Person;

public class Test  {

	@org.junit.Test
	public void testPerson(){
		//获取spring的配置文件
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//由配置文件返回对象
		Person person=(Person) context.getBean("person");
		
		System.out.println(person);
		System.out.println(person.info());
		
		
		
	}
	
}
