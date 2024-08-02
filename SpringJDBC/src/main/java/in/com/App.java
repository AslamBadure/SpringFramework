package in.com;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class App 
{
	public static void main( String[] args ) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("in/com/config.xml");

		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
		try {
            System.out.println(jdbcTemplate.getDataSource().getConnection());
            
            String sql = "INSERT INTO student(id, name, address) VALUES (?, ?, ?)";
            
            int i = jdbcTemplate.update(sql, 2, "com", "Karnataka");
            
            System.out.println("Inserted successfully: " + i);
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
