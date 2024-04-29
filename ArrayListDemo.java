package ListInterface;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
      
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(11);
		list.add(102);
		list.add(1034);
		list.add(133);
		System.out.println(list);
		list.remove(1);
	    System.out.println(list);
	    System.out.println(list.get(3));
		
		
	}

}
