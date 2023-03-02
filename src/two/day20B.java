package two;

public class day20B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Minskole mm = new Minskole();
		mm.UPI();
		mm.withDrawl();
		mm.transaction();
		mm.savingInterest();
}

}

interface creditCard {
	public void withDrawl();
	public void transaction();
	
}

interface debitCard {
	public void savingInterest();
}

interface walletPayment {
	public void UPI();
}

class Minskole implements creditCard , debitCard , walletPayment{

	@Override
	public void UPI() {
		// TODO Auto-generated method stub
		System.out.println("UPI added from wallet");
	}

	@Override
	public void savingInterest() {
		// TODO Auto-generated method stub
		System.out.println("Saving interest");
	}

	@Override
	public void withDrawl() {
		// TODO Auto-generated method stub
		System.out.println("ways to withdrawl");
	}

	@Override
	public void transaction() {
		// TODO Auto-generated method stub
		System.out.println("ways to transaction");
	}
	
	
}






