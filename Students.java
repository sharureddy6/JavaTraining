
public class Students {
	
	public Students(){
		System.out.println("Hi, I am constructor ");
		
		System.out.println("Hi, i am second metbod ");
	}
	
	int rollnumber;
	String name;
	
	public Students(int i, String n){
		rollnumber = i;
		name = n;
	}

	public void display(){
		System.out.println("Rollnumber is :  " + rollnumber + " name is :  " + name );
	}
	public static void main(String[] args) {

		Students std = new Students();
		Students std1 = new Students( 10, "Rick");
		Students std2 = new Students (23, "hannah");
		std1.display();
		std2.display();
		}

}
