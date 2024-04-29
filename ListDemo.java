package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List l1 = new ArrayList();
		
		l1.add(0,12);
		l1.add(1,17);
		System.out.println(l1);
		
		List l2 = new ArrayList();
		l2.add(10);
		l2.add(12);
		l2.add(17);
		l2.add(10);
		l2.add(17);
		l2.add(198);
		l1.addAll(2, l2);
		System.out.println(l1);
		
		List l3 = new ArrayList();
		l3 = l1.subList(3, 10);
		System.out.println(l3);
//		System.out.println(l1.indexOf(198));
//		System.out.println(l1.lastIndexOf(198));
//		
//		l1.remove(2);
//		
//		System.out.println(l1);
//		System.out.println("Element present at index 5 is : " + l1.get(5));
//		
//		l1.set(5,  373);
//		System.out.println("After Set operation : " + l1);
	}

}
