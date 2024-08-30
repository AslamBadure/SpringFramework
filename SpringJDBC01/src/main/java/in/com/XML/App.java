package in.com.XML;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        
       JdbcTemplate jdbcTemplate=context.getBean("jdbc", JdbcTemplate.class);
        try {
			System.out.println(jdbcTemplate.getDataSource().getConnection());
			
			String sd="insert into student(id,name,Address) values(?,?,?)";
			
			int i=jdbcTemplate.update(sd,5,"nanadlal","UP");
			System.out.println(" Successfully inserted : "+i);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
        
       
    }
}
