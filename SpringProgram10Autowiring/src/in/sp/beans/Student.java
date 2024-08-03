package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int rollno;
	private String name;
	
	@Autowired
	private Address address;
	
	//  @Autowired
	private Subjects subjects;

	public Subjects getSubjects() {
		return subjects;
	}
	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void Display() {
		System.out.println("Rollno: "+rollno);
		System.out.println("Name: "+name);
		System.out.println("Adderess: "+address);
		System.out.println("Subjects: "+subjects);
	}
}
