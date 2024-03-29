
public class FirstJavaProgram {
	static int varSec= 9876;
	
	public static void firstmethod(){
		int number = 12345;
		boolean flag = false;
		char character = 'a';
		long phonenumber = 9291920992L;
		double decimalvalue = 234.3D;
		String city = "Edinburgh";
		System.out.println(number);
		System.out.println(city);
		System.out.println(varSec);
	}

	public static void main(String[] args) {
		FirstJavaProgram.firstmethod();
		System.out.println(varSec);

	}

}
