package Set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
    
		TreeSet tset = new TreeSet<>();
		
		tset.add(2382);
		tset.add(1233);
		tset.add(222);
		tset.add(72323);
		tset.add(232);
		System.out.println(tset);
		
		//tset.remove(232);
	//	System.out.println(tset);
		
		System.out.println(" Set Contains 2382 : " + tset.contains(2382));
		
		System.out.println("First element of treeset :" + tset.first());
		System.out.println("last of element of treeset :" + tset.last());
		
		System.out.println("use of headset : " + tset.headSet(2382));
		System.out.println("use of tailset : " + tset.tailSet(2382));
		System.out.println("use of subset : " + tset.subSet(1233, 72323));
		
		tset.clear();
		System.out.println(tset);
	}

}
