package Map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<String , Integer> lmap = new LinkedHashMap<String, Integer> ();
		
		lmap.put("Lion" , 10);
		lmap.put("haorse" , 2123);
		lmap.put("kamel", 21);
		lmap.put("Zoo" , 1248);
		lmap.putIfAbsent("Lion" , 11);
		System.out.println(lmap);
		System.out.println("size of map : " + lmap.size());
System.out.println("is map empty ?: " + lmap.isEmpty());
System.out.println("Contains 10? :" + lmap.containsValue(10));
	}

}
