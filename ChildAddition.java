package Oops;

public class ChildAddition extends Addition {

	public static void main(String[] args) {
    
		Addition add = new Addition();
		add.Addvalues(11, 11);
		add.Addvalues(11, 11, 11);
		add.Addvalues(22, 22);
		double d = add.Addvalues(11.11 , 22.22);
		System.out.println( "Addition is : " + d ); 
		
	}

}
