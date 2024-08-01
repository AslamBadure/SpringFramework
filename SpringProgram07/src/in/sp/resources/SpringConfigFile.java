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
		addre.setHouseno(100);
		addre.setCity("Hydrabad");
		addre.setPincode(24333);
		return addre;	
	}
	
	@Bean
	public Student createStdObj() {
		Student std= new Student();
		std.setRollno(1000);
		std.setName("anilkumar");
		std.setAddress(createAddreObj());
		return std;
		
	}
	
}
