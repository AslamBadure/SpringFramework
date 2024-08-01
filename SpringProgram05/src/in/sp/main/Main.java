package in.sp.main;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {

		String config="in/sp/resources/applicationContext.xml";
		ApplicationContext context= new ClassPathXmlApplicationContext(config);
		
		Student std=(Student) context.getBean("stdid");
		std.display();
	}
}
