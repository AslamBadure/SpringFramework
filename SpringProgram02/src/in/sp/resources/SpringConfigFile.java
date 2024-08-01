package in.sp.resources;

// java file configuration file

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Student stdId1() {
		
		Student std = new Student();
		
		std.setName("kamal");
		std.setRollno(101);
		std.setGmail("kamal@gmail.com");
		
		return std;
	}
}
