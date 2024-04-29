package ExceptionHandling;

public class NestedTryCatch {

	public static void main(String[] args) {
   
		try {
			System.out.println("First Try Block");
			String text = "LionS";
			System.out.println(text.length());
			
			try{
				System.out.println("Seconf Try block");
				int value = 100/0;
				
			} catch(Exception e){
				System.out.println("End of second try block");
						e.printStackTrace();
						
			} catch(Exception e){
				System.out.println("end of first try block");
				e.printStackTrace();
			}
		}
	}
}



