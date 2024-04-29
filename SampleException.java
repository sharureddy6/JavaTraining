package ExceptionHandling;

public class SampleException {

	public static void main(String[] args) {

		try {
			int value = 100;
			int result = value/0;
			
			System.out.println(result);
		} catch(Exception e){
			System.out.println(e);
			System.out.println("Please enter another value to divide by integer");
			e.printStackTrace();
		}
	}

}
