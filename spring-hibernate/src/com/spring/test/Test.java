package com.spring.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Person;

public class Test  {

	@org.junit.Test
	public void testPerson(){
		//��ȡspring�������ļ�
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//�������ļ����ض���
		Person person=(Person) context.getBean("person");
		
		System.out.println(person);
		System.out.println(person.info());
		
		
		
	}
	
}
