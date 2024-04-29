package String;

public class StringIntro {
	
	public static void main (String[] args){
		
		String name  = " Jack Reacher";
		String name1 = " Jack Reacher";
		String name2 = " jack Buer";
		
		String country = new String("United States of America");
		String country1 = new String("United States of America");
		
		/*System.out.println(name.equalsIgnoreCase(name1));
		
		System.out.println(country.equals(country1));

		
		System.out.println(name);
		System.out.println(country);*/
		
		/*System.out.println(name == name1);
		System.out.println(country == country1);*/
		
		String finalString = name + name1 + name2;
		System.out.println(finalString);
		
		String secString = name.concat(name1).concat(name2);
		System.out.println(secString);
	}

}
