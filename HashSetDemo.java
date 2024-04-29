package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet hash = new HashSet<>();
		hash.add("Country");
		hash.add("City");
		hash.add("Denver");
		hash.add("Currency");
		hash.add("Rupee");
		hash.add(12);
		System.out.println(hash);
		
		hash.remove("Denver");
		System.out.println(hash);
		System.out.println("Contains the value City : " + hash.contains("City"));
		
		Iterator i = hash.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		hash.clear();
		System.out.println("Hash is : " + hash);
		
		
	}

}
