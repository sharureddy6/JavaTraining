
public class SecondJavaClass {

	public static void main(String[] args) {
		String str1= "hello";
		String str2 = "Team";
		
		int a= 200;
		int b= 300;
		
		/*System.out.println(str1 + " "+str2);
		System.out.println(a + b);
		System.out.println(a + b + str1 + str2);
		System.out.println(str1 + str2 + a + b);
		*/
		
		/*if (a > 1000){
			System.out.println("A is grater than 1000");
		} else {
			System.out.println("A is less than 1000");
		}*/
		
//		if (a==100){
//			System.out.println("A is 100");
//		} else if (a==200){
//			System.out.println("A is 200");
//		} else if (a==300){
//			System.out.println("A is 300");
//		}else {
//			System.out.println("value doesn't exist");
//		}
		
		int day =6;
		switch (day) {
		case 1:
			System.out.println("today is momday");
			break;
		case 2:
			System.out.println("today is tuesday");
			break;
		case 3:
			System.out.println("today is wednesady");
			break;
		case 4:
			System.out.println("today is thursday");
			break;
		case 5:
			System.out.println("today is friday");
			break;

		default:
			System.out.println("hey!!! it's weekend");
			break;
		}
	}

}
