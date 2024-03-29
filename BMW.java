package Oops;

public class BMW extends Car{
	
	 String name = "BMW";
	 
	 BMW(){
		 super();
		 System.out.println("Calling BMW constructor");
	 }
	 
	 public void setwheels(){
		 
	 }
	 
	 public void getname(){
		 System.out.println(name);
		 System.out.println(super.name);
	 }
	 
	 public void run(){
		 System.out.println("BMW is running");
		 super.run();
		 
	 }

	public static void main(String[] args) {
		BMW bmw = new BMW();
		bmw.run();
		

	}

}
