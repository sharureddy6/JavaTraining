package String;

public class StringBufferIntro {

	public static void main(String[] args) {
      
		String name = "Gotham";
		name.concat(" Batman's ");
		// System.out.println(name);
		
		StringBuffer name1 = new StringBuffer("Batman's ");
		// name1.append("Gotham ");
		//name1.insert(4, "city" );
		//name1.replace(1, 3, "manner");
		//name1.delete(4, 7);
		name1.reverse();
		System.out.println(name1);
	}

}
