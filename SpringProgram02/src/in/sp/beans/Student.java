package in.sp.beans;



public class Student {
	private String name;
	private int rollno;
	private String gmail;

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
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+ rollno);
		System.out.println("Gmail: "+ gmail);
	}
}

