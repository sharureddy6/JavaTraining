package Oops;

public class CalculateInterest {

	public static void main(String[] args) {
     
		AmericanExpress am = new AmericanExpress();
		BankofAmerica ba = new BankofAmerica();
		ICICI icici = new ICICI();
		
		System.out.println(am.getInterest());
		System.out.println(ba.getInterest());
		System.out.println(icici.getInterest());


	}

}
