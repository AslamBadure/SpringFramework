package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddreObj() {
		Address addre = new Address(200,"mysore", 560011);		
		return addre;	
	}
	
	
	@Bean
	public Student createStdObj1() {
		
		Student std=new Student(102, "rahul",createAddreObj());
		return std;
	}
	
}
