package two;

public class day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// constructor
		
		Human a = new Human();
		int vli = a.Add();
		System.out.println(vli);
		
		// constructor with parameter
		
		Bank icici = new Bank(1000,123,"chinmay","current");
		Bank sbi = new Bank(10000,123,"chinmay","current");
		
		System.out.println(icici.accName);
		System.out.println(icici.accNo);
		System.out.println(icici.bal);
		System.out.println(icici.type);
		System.out.println(icici.country);
		
		int updatedBal = icici.deposit(1000);
		System.out.println(updatedBal);
		// default constructor also
		icici.withDrawl(3000);
		
		int updatedBal2 = icici.withDrawl(500);
		System.out.println(updatedBal2);
		icici.country = "Nepal";
		
		sbi.deposit(50000);
	}
	
	

}

class Human {
	int i = 0;
	public Human() {
		System.out.println("Constructor called");
		i = 5;
	}
	
	public int Add() {
		return this.i;
	}
}


class Bank{
	
	int bal;
	int accNo;
	String accName;
	String type;
	String country ;
	int transactions [];
	
	public Bank(int bal, int accNo, String accName , String type) {
		this.bal = bal; 
		this.accNo = accNo;
		this.accName  =accName;
		this.type = type;
		this.country = "India";
		this.transactions = new int[5];
	}
	
	public int deposit(int amount) {
		this.bal = this.bal + amount;
		System.out.println("Deposit successful");
		return this.bal;
	}
	
	public int withDrawl(int amount) {
		if(this.bal > amount) {
			this.bal = this.bal - amount;
			return this.bal;
		}
		else {
			System.out.println("In sufficient balance");
			return this.bal;
		}
	}
	
	// Assignment
	
	// If the account type is saving  --- interest should  5%
	// If the account type is current --- interest should  10%
	
	// show the last five transactions 
	
	
	
}






