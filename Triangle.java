package Oops;

public class Triangle extends Shape{
	
	public void displayShape(){
		System.out.println("shape is triangle");
	}

	public static void main(String[] args) {
        
		Shape s = new Circle();
		Shape s1 = new Triangle();
		
		s.displayShape();
		s1.displayShape();
	}

}
