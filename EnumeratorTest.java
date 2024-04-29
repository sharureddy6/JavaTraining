package Iterator;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorTest {

	public static void main(String[] args) {

		Vector v = new Vector();
		for (int i = 0; i < 10; i++){
			v.addElement(i);
			
		}
		System.out.println(v);
		
		//index just before the first element in v 
		Enumeration e = v.elements();
		//check for the next element availability 
		while (e.hasMoreElements()){
			//moving cursor to next element 
			int i = (Integer) e.nextElement();
			System.out.println(i + " ");
			
		}
		
	}

}
