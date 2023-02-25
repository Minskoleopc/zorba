package two;

public class day16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c = new Calculator();
		c.addition(12, 13);
		c.addition(12, 13,14);
		c.addition(12, 13,14,23);
		
		
		//Calculator2 
		Calculator2 d = new Calculator2();
		Calculator2 e = new Calculator2(1);
		Calculator2 f = new Calculator2(1,4);
		Calculator2 g = new Calculator2(1,4,5);
		
		
		SBI s =  new SBI("pune",411028,9);
		s.loan(12);
		s.save(13);
		
		PNB a = new PNB("jaipur",123321,5);
		a.save(12);
		a.loan(0);
		
		
	}

}

class Calculator {
	
	// same class 
	// same method name 
	// different signature 
	// This is over loading 
	
	
	
	public void addition(int x , int y) {
		System.out.println(x+y);
	}
	
	
	public void addition(int x , int y ,int z) {
		System.out.println(x+y+z);
	}
	
	public void addition(int x , int y ,int z ,int a) {
		System.out.println(x+y+z+a);
	}
	
	
}

// constructor  overloading 

class Calculator2 {
	
	public Calculator2(){
		System.out.println("Default constructor");
	}
	
	public Calculator2(int x){
		System.out.println("called with 1 paramter");
	}
	
	public Calculator2(int x,int y){
		System.out.println("called with 2 paramter");
	}
	
	public Calculator2(int x,int y,int z){
		System.out.println("called with 3 paramter");
	}
	
}

// Method overriding 
// Different class 
// Same method name 
// Same signature via Inheritance


class WorldBank {
	String city;
	int pincode;
	
	public WorldBank(String city , int pincode) {
		this.city = city;
		this.pincode = pincode;		
	}
	
	public void loan(int x) {
		System.out.println("World Bank :Home loan is "+x);
	}
	
	public void save(int y) {
		System.out.println("World Bank :Saving percent "+y);
	}
		
}

class SBI extends  WorldBank {
	int code;
	public SBI(String city, int pincode,int code) {
		super(city, pincode);
		this.code = code;
		
	}
	
	public void loan(int x) {
		System.out.println("SBI :Home loan is "+x);
	}
	
	public void save(int y) {
		System.out.println("SBI:Saving percent "+y);
	}
	
}

class PNB extends WorldBank{
	int bcode;
	public PNB(String city, int pincode, int bcode) {
		super(city, pincode);
		this.bcode = bcode;
		// TODO Auto-generated constructor stub
	}
	
	public void loan(int x) {
		System.out.println("PNB :Home loan is "+x);
		super.loan(99);
	}
	
	public void save(int y) {
		System.out.println("PBN:Saving percent "+y);
		super.loan(99);
	}


}







































