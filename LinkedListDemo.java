package ListInterface;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add(10);
		list.add(12);
		list.add("United");
		list.add("Camry");
		list.add(256);
		list.add(987);
		System.out.println(list);
		list.addFirst("City");
		System.out.println(list);
		list.addLast("Tokyo");
		System.out.println(list);
		
	}

}
