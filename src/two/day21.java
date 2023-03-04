package two;

public class day21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Object -- properties and methods
		System.out.println(Math.PI);
		System.out.println(Math.abs(-90.90));
		System.out.println(Math.abs(90));
		
		// Math is class 
		// We can create objects 
	
//		PersonJ aa = new PersonJ("k");
//		System.out.println(aa.fullName);
		// How are we able to access property and method without creating class

		
//		Students mayuri = new Students("chinmay deshpande",32);
//		System.out.println(mayuri.fullName);
//		System.out.println(mayuri.age);
//		
//		System.out.println(mayuri.Country);
//		mayuri.displayCountry();
		
		
		Students.displayCountry();
		System.out.println(Students.Country);
		
		// can we call or access static properties and methods on reference variable
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


// Static keywords


class Students {
	String fullName;
	int age;
	static String Country  = "india";
	
	
	public Students(String fullName , int age) {
		this.fullName = fullName;
		this.age = age;
	}
	
	// basic method
	
	public void displayFullname() {
		System.out.println(this.fullName);
	}
	
	// static method
	
	public static void displayCountry() {
		System.out.println(Students.Country);
	}
	
}















//class PersonJ {
//	String fullName;
//	public PersonJ(String c) {
//		this.fullName = c;
//	}
//			
//}