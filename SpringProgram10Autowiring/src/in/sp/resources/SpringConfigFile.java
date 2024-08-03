package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

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
		public Subjects createSubObj() {
			
			Subjects subj= new Subjects();
			
			List<String> sub_list=new ArrayList<String>();
			
			sub_list.add("Java");
			sub_list.add("Python");
			sub_list.add("C++");
			
			subj.setSubjects(sub_list);
			return subj;
			
		}
		
		

		@Bean
		public Student createStdObj() {
			Student std= new Student();
			std.setRollno(1);
			std.setName("Akash");
			//std.setAddress(createAddreObj()); // manually
			
			std.setSubjects(createSubObj()); // manually
			return std;
			
		}
}
