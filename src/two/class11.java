package two;

public class class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonB amol = new PersonB();
		System.out.println(amol.firstName);
		System.out.println(amol.lastName);
		System.out.println(amol.age);

		PersonB sumit = new PersonB();
		System.out.println(sumit.firstName);
		System.out.println(sumit.lastName);
		System.out.println(sumit.age);

		amol.age = 34;
		amol.firstName = "amol";
		amol.lastName = "rao";

		PersonD amit = new PersonD("amit", "bhure", 18);
		PersonD chinmay = new PersonD("chinmay", "deshpande", 20);
		PersonD sarika = new PersonD("sarika", "pansare", 22);

		System.out.println(amit.firstName);
		System.out.println(chinmay.firstName);

		chinmay.age = 88;
		chinmay.displayName();

		String names[] = { "chinmay", "amit", "amol", "ram" };
		PersonD students[] = { amit, chinmay, sarika };

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].firstName);
			System.out.println(students[i].lastName);
			System.out.println(students[i].age);
		}
		
		for(PersonD a:students) {
			System.out.println(a.firstName);
			System.out.println(a.lastName);
			System.out.println(a.age);
		}
		
		// 3 objects of vehicle
		
		Vehicle cars [] = {
			new Vehicle("blue","SUV"), // 0
			new Vehicle("red","sedane"), // 1
			new Vehicle("black","SUV")  // 1
			
		};
		
		
		for(Vehicle c:cars) {
			c.displayColor();
			System.out.println(c.color);
			System.out.println(c.type);
		}
		
		
		
		

	}

}

// user defined

class PersonB {
	// Properties
	String firstName = "chinmay";
	String lastName = "deshpande";
	int age = 32;

	// Method
	public void fullName() {
		System.out.println(this.firstName + this.lastName);
	}

}

// constructor

class PersonD {
	String firstName;
	String lastName;
	int age;

	// Constructor always return object
	public PersonD(String fn, String ln, int ag) {
		this.firstName = fn; // "chinmay"
		this.lastName = ln; // "deshpande"
		this.age = ag; // 20
	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

// vehicle 

class Vehicle {
	
	String color;
	String type;
	public Vehicle(String color,String type) {
		this.color = color;
		this.type = type;
	}
	
	public  void displayColor() {
		System.out.println(this.color);
	}
	
}



