package in.sp.resources;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddreObj() {
		
		Address addre=new Address();
		addre.setHouseno(23);
		addre.setCity("Bidar");
		addre.setPincode(585419);
		return addre;	
	}
	
	@Bean
	public Student createStdObj() {
		Student std= new Student();
		std.setRollno(1);
		std.setName("Akash");
		//std.setAddress(createAddreObj()); // manually
		return std;
		
	}
}
