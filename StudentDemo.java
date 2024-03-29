
public class StudentDemo {
	
	int rollnumber;
	String name;
	String standard;
	
	public StudentDemo(int rollnumber, String name , String standard){
		
		this.rollnumber = rollnumber;
		this.name = name;
		this.standard = standard;
		
	}
	
	public void display(){
		System.out.println("Student Rollnumber is : " + rollnumber + " name is : " + name + " and is in standard : " + standard );
	}

	public static void main(String[] args) {
		
		StudentDemo std = new StudentDemo( 10, "harry" , "2nd");
		StudentDemo std1 = new StudentDemo(20, "garry", "3rd");
		
		std.display();
		std1.display();
		

	}

}
