package Iterator;

import java.util.ArrayList;
import java.util.Iterator; 
import java.util.ListIterator;

public class ListIteratorSample {

	public static void main(String[] args) {
		
				
				ArrayList al = new ArrayList();
				
				for (int i = 0; i < 10; i++)
					al.add(i);
					System.out.println("Elements of array list : " + al);
					
					ListIterator ltr = al.listIterator();
					
					
			
				//checking the next element availability
				while (ltr.hasNext()){
					// moving the cursor to next element 
					
					int i = (Integer) ltr.next();
					
					//getting even elements one by one 
					System.out.println(i + " ");
					
					//Remove odd elements 
					 if (i % 2 == 0){
						 i++; //change to odd
						 ltr.set(i); //set method to change value
						 ltr.add(i); // to add
					 }
				}
				System.out.println();
			 System.out.println( "elements after remove operation : " + al);
				
					
					
					
				}
					
				

			


	}


