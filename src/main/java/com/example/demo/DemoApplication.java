package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args); // 업캐스팅.
		String[] beenNames = context.getBeanDefinitionNames();
//		for(String beanName : beenNames){
//			System.out.println(beanName);
//		}

		MyBean myBean = (MyBean) context.getBean("myBean");
//		var person = (Person) context.getBean(Person.class);
		MyBean myBean2 = (MyBean) context.getBean("myBean");
		MyBean myBean3 = (MyBean) context.getBean("myBean");
	}

}
