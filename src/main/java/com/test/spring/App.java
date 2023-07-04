package com.test.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.beans.AppConfig;
import com.test.beans.World;
public class App {

	public static void main(String[] args) {
	//ApplicationContext appContext = new ClassPathXmlApplicationContext("com/test/xml/beans.xml");
	ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
	World w = (World) appContext.getBean("world");
	System.out.println(w.getWave());
	 
	}
	

}
