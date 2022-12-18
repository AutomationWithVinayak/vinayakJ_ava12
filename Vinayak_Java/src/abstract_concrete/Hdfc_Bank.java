package abstract_concrete;

public class Hdfc_Bank extends Rbi_Bank{

	
	public static void main(String[] args) {
		Rbi_Bank obj=new Hdfc_Bank();
		obj.credit();
		obj.debit();
		
		obj.loan();
		
	}
	public void loan() {
		System.out.println("Hdfc ----- Loan");
		
	}
	public void Fund() {
		System.out.println("Hdfc ----Fund");
	}

}
