package Array;

public class PassArrayToMethod {
	
	public static void findMin(int arrayOne[]) {
		int min = arrayOne[0];
		
		for (int i = 1; i < arrayOne.length; i++){
			if (min > arrayOne[i]){
				min = arrayOne[i];
			}
		}
		System.out.println("minimum element is :" + min);
	}

	public static int[] getArray(){
		return new int[] {12, 45, 61,78, 98, 100};
	}
	public static void main(String[] args) {
       
		PassArrayToMethod pass = new PassArrayToMethod();
		
		
		int arrayTest[] = {12, 6, 9, 3, 89 , 35, 76};
		pass.findMin(arrayTest);
		
		int arrayThree[] = pass.getArray();
		System.out.println(arrayThree[2]);
	}

}
