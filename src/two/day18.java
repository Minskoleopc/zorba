package two;

public class day18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WorldBankM m = new WorldBankM();
		
		SBIc a = new SBIc("India","pune",411028);
		a.displayCountry();
		a.Save(12);
		a.Loan(3);
	}

}

// abstract class
// abstract method 
// can we create of abstract class --NO 
// can abstract class have non - abstract methods

abstract class WorldBankM {
	String city;
	String country;
	
	public WorldBankM(String cty, String cnt) {
		this.city = cty;
		this.country = cnt;			
	}
	
	// Abstract method --- no body only definition
	abstract public void Save(int x);
	abstract public void Loan(int x);
	//abstract public void displayCountry();
	
	// normal methods
	public void displayCountry() {
		System.out.println(this.country);
	}
	
}

class SBIc extends WorldBankM {

	int pincode ;
	public SBIc(String cty, String cnt ,int pincode) {
		super(cty, cnt);
		this.pincode= pincode;
		
	}

	@Override
	public void Save(int x) {
		// TODO Auto-generated method stub
		System.out.println("SBI save"+x);
		
	}

	@Override
	public void Loan(int x) {
		// TODO Auto-generated method stub
		System.out.println("SBI loan"+x);
	}
	
}


// Abstraction --- WorldBank ---- loan(2) , save(2)
// SBI      PNB    Canara
// loan()  
// save()



