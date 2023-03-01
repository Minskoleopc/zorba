package two;

public class day19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WorldBankRules n = new WorldBankRules();
		//We cannot create object interface
		
		Canara a = new Canara();
		a.save(0);
		a.discount(0);
		a.loan(0);
		
		PNBaa a1  = new PNBaa();
		a1.save(0);
		a1.discount(0);
		a1.loan(0);
		
		

		
	}

}

interface WorldBankRules{
	
	// We cannot create object of interface
	// interface  always used to have abstract methods ---- without body
	public void save(int x);
	public void loan(int x);
	public void discount(int x);
	
}

class Canara implements WorldBankRules {

	@Override
	public void save(int x) {
		System.out.println("save method canara");
		
	}

	@Override
	public void loan(int x) {
		// TODO Auto-generated method stub
		System.out.println("loan method canara");
		
	}

	@Override
	public void discount(int x) {
		// TODO Auto-generated method stub
		System.out.println("discount method canara");
		
	}
	

}


class PNBaa implements WorldBankRules{

	@Override
	public void save(int x) {
		// TODO Auto-generated method stub
		System.out.println("PNB save");
	}

	@Override
	public void loan(int x) {
		// TODO Auto-generated method stub
		System.out.println("PNB loan");
	}

	@Override
	public void discount(int x) {
		// TODO Auto-generated method stub
		System.out.println("PNB discount");
	}
	
	
}




