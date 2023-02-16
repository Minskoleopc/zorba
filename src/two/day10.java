package two;

public class day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person amol = new Person("amol","rao",12);
		Person poorva = new Person("poorva","vyas",15);
		
		System.out.println(poorva.age);
		poorva.age = 33;
		System.out.println(amol.age);
		poorva.talk();
		
	}

}

// userdefined datatype

class Person {
	
	String firstName;
	String lastName;
	int age;
	
	public Person(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;
				
	}
	
	public void walk() {
		System.out.println("I am walking");
	}
	public void talk() {
		System.out.println("I am talking");
	}
}







