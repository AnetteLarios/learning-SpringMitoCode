package com.test.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import com.test.beans.AppConfig;
import com.test.beans.AppConfig2;
import com.test.beans.City;
import com.test.beans.Human;
import com.test.beans.World;
public class App {

	public static void main(String[] args) {
	ApplicationContext appContext = new ClassPathXmlApplicationContext("com/test/xml/beans.xml");
	//ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);
	//World w = (World) appContext.getBean("mars");
	Human h = (Human) appContext.getBean("human");
	Human h2 = (Human) appContext.getBean("human");
	// System.out.println(w.getWave());
	/*String namesCities = ""; 
	for (City cities : h.getCountry().getCities()) {
		namesCities += cities.getName() +",";
	}
	*/
	/*
	System.out.println(h.getId() + " " + h.getName() + " " + h.getNickname() + " " +
					   h.getCountry().getName() + " " + h.getCity().getName());
	System.out.println(h2.getId() + " " + h2.getName() + " " + h2.getNickname() + " " +
			   h2.getCountry().getName() + " " + h2.getCity().getName());
			   */
	System.out.println(h);
	System.out.println(h2);
	((ConfigurableApplicationContext)appContext).close(); 
	}
}
