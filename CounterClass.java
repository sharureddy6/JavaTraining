
public class CounterClass {
	int i = 0;
	static int j = 0;
	
	public CounterClass(){
		i++;
		j++;
		
	System.out.println("value of i is : " + i);
	System.out.println("value of j is : " + j);
	}
	

	public static void main(String[] args) {
		CounterClass counter = new CounterClass();
		CounterClass counter1 = new CounterClass();
		CounterClass counter2 = new CounterClass();

		
		/* System.out.println(counter.i);
		System.out.println(CounterClass.j); */
		
	}

}
