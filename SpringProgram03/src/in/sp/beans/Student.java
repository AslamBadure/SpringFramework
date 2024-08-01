package in.sp.beans;

// Xml file configuration


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("Aslam")
	private String name;
	@Value("101")
	private int rollno;
	@Value("10.0")
	private double marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public void display() {
		System.out.println("name: "+name);
		System.out.println("rollno: "+rollno);
		System.out.println("marks: "+marks);
	}
	
}
