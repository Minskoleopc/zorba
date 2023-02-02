package one;

public class day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String is inbuilt data type
		String fullName = "chinmay";
		// create object of type string
		String q = fullName.toUpperCase(); // CHINMAY
		System.out.println(q);
		
		// creating instance or object of human class
		Human amol = new Human("amol rao",23);
		System.out.println(amol.age); // 23
		System.out.println(amol.fullname); // amol rao
		amol.talk();
		amol.walk();
		
		// creating instance or object of human class
		Human chinmay = new Human("chinmay deshpande",27);
		System.out.println(chinmay.age);
		System.out.println(chinmay.fullname);
		chinmay.walk();
		chinmay.talk();
		

	}
	
	


}

class Human {
	// Properties or fields
	String fullname;
	int age;
	// constructor to set property values , field values
	public Human(String fullN, int age) { //
		this.fullname = fullN;
		this.age = age;
	}
	// methods 
	// talk() and walk()
	
	public void talk() {
		System.out.println("I am talking");
	}
	
	public void walk() {
		System.out.println("I am walking");
	}
	
}

// vehicle type and create object out of it