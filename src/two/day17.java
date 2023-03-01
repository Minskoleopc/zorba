package two;

public class day17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Inheritance
		// Polymorphism
		// Abstraction
		// Hiding 

		//new WorldBankQ();
		SBIa  y = new SBIa();
		y.BranchName();
		y.Loan();
		y.Save();
		y.displayCountryName();
		
		Student aa = new Student("chinmay","deshpande",23);
	
		aa.displayName();
		aa.displayCity();
		
		
		
		
		
		
		
		
		
	}
	
	

}

abstract class WorldBankQ{
	
	// abstract class can have method with definition only
	// abstract class can have normal methods
	// abstract method
	abstract public void Loan();
	abstract public void Save();
	// regular method
	public void displayCountryName() {
		System.out.println("India");
	}
	// You cannot create object of abstract class
}


class SBIa extends WorldBankQ{

	public void Loan() {
		// TODO Auto-generated method stub
		
		System.out.println("SBI loan method");
		
	}

	public void Save() {
		// TODO Auto-generated method stub
		System.out.println("SBI save method");
	}
	
	public void BranchName() {
		System.out.println("SBI branch");
	}
	
	
}


abstract  class Information{
	
	String firstName;
	String lastName;
	public Information(String firstName , String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;		
	}
	
		abstract public void displayName();
	
	
}

class Student extends Information {
	
	int rollNo;

	public Student(String firstName, String lastName,int rollNo) {
		super(firstName, lastName);
		this.rollNo = rollNo;
	}


	public void displayName() {
		// TODO Auto-generated method stub
		System.out.println(this.firstName+ this.lastName);
	}
	
	public void displayCity() {
		System.out.println("Pune");
	}
	
}


// KFC 

// Menu items 
// chicken tikka 
// chicken burger


// pune   - price
// banglore - price
// mumbai - price




//credit card
//withdrawl();

// payTM

































