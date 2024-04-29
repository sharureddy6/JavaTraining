package OOPSproject;

public class ICICIBankLoan extends BankLoan{

	public static void main(String[] args) {
     
		BankLoan loan = new BankLoan();
		loan.setAge(45);
		loan.setName("jordan");
		loan.setAmount(10000);
		
		System.out.println("name is :" + loan.getName());
		System.out.println("age is :" + loan.getAge());
		System.out.println("Amount is :" + loan.getAmount());
	}

}
