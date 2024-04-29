package Array;

public class TestArray {

	public static void main(String[] args) {
        
		int arrayOne[] = new int[10];
		
		arrayOne[0] = 12;
		arrayOne[1] = 22;
		arrayOne[2] = 33;
		
		System.out.println(arrayOne[2]);
		
		for( int i=0; i< arrayOne.length; i++){
			System.out.println(arrayOne[i]);
		}
		
		int arrayTwo[]= {10,20,30,40,50,60};
		
		System.out.println("Size of second array is :" + arrayTwo.length);
		
		}
	
	
	}


