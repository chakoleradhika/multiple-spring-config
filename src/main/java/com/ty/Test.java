package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qspider.Teacher;

public class Test 
{
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("myconfig.xml");
		
		Student stud =(Student) context.getBean("myStudent");
		stud.learning();
		
		Manager manager = (Manager) context.getBean("myManager");
		manager.work();
		
		Teacher teacher = (Teacher) context.getBean("myTeacher");
		teacher.teaching();
	}

}
