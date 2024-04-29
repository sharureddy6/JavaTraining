package Map;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
 
		HashMap< String , Integer > hmap = new HashMap<String, Integer>();
		hmap.put("Lion" , 10);
		hmap.put("haorse" , 2123);
		hmap.put("kamel", 21);
		hmap.put("Zoo" , 1248);
		System.out.println(hmap);
		
		if(hmap.containsKey("Lion")){
			System.out.println("Age of lion is : " + hmap.get("Lion"));
		}
		
		System.out.println("Size of hashmap is : " + hmap.size());
		hmap.clear();
		
		System.out.println("is the hashmap empty ? :" + hmap.isEmpty());
		
		
	}

}
