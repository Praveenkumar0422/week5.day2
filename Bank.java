package oops;



public class  Bank  extends SBI implements CIBIL,PNB  {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		CIBIL obj=new Bank();
		obj.cibilScore();
		PNB obj1=new Bank();
		obj1.creditScore();
		obj1.maximumLoanAmount();
		obj1.minimumBalance();
		SBI obj2=new Bank();
		obj2.bankBalance();
		obj2.ITLoan();
		obj2.maximumLoanAmount();
	
		
		
		
		

	}

	public void cibilScore() {
		// TODO Auto-generated method stub
		System.out.println("cibil score");
		
	}

	public void maximumLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("maximumLoanAmount");
		
	}

	public void creditScore() {
		// TODO Auto-generated method stub
		System.out.println("creditScore");
		
	}

	public void minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("minimumBalance");
		
	}

	@Override
	public void bankBalance() {
		// TODO Auto-generated method stub
		System.out.println("bankbalance");
		
	}

	

}
