package Interface_Concepts;

public class Developingloans implements BankingLoans {

	public static void main(String[] args) {
		Developingloans dp = new Developingloans();
		dp.homeloan();
		dp.localloan();
		BankingLoans bl = new Developingloans();  //Runtime polymorphism // bl is responsible to call all the methods in BankingLoans.
		
	}

	@Override
	public void homeloan() {
		System.out.println("Home loan");
		
	}

	@Override
	public void personalloan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carloan() {
		// TODO Auto-generated method stub
		
	}
	
	public void localloan() {
		System.out.println("Local loan");
	}

}
