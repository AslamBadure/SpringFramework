package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {

		String config="/in/sp/resources/applicationcontext.xml";
		ApplicationContext context= new ClassPathXmlApplicationContext(config);
		
		Student std=(Student) context.getBean("student");
		std.display();
		
	}
}
