package two;

public class day13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// default -- declarations are visible only within the package
		// private or public package
		// private -- declarations are visible within the class only
		// protected - declaration are visible within the package or all subclasses
		// public - declarations are visible everywhere

		// Object of Logger

		Logger logA = new Logger();
		logA.message();

		// Object of LoggerB

		LoggerB logB = new LoggerB();
		// System.out.println(logB.fullName); not possible its private field

		logB.displayFullName2();

		// Object of Data class

		Data set1 = new Data();
		set1.city = "nagpur";
		System.out.println(set1.city);

		// Object of DataB

		DataB set2 = new DataB();

//		
//		System.out.println(set2.city);
//		set2.city = "nagpur"
//		

		set2.setCityName("nagpur");
		String updatedCity = set2.getCityName();
		System.out.println(updatedCity);

		
		DataC set3 = new DataC("jaipur");
		System.out.println(set3.getCity());
		
		set3.setCity("bangalore");
		System.out.println(set3.getCity());
		
		
		
	}

}

class Logger {
	void message() {
		System.out.println("hello");
	}

}

class LoggerB {

	private String fullName = "chinmay";

	private void displayFullName() {
		System.out.println(this.fullName);
	}

	void displayFullName2() {
		this.displayFullName();
	}

}

class Data {

	String city = "pune";

}

class DataB {

	private String city = "pune";

	// set the new value
	// setter
	public void setCityName(String cN) {
		this.city = cN;
	}

	// get the value for city outside the class
	// getter
	public String getCityName() {
		return this.city;
	}

	// facebook -- signup

}

class DataC {

	private String city;

	public DataC(String ct) {
		this.city = ct;
	}

	// update the city

	void setCity(String cty) {
		this.city = cty;
	}

	// get the city
	String getCity() {
		return this.city ;
	}

}

// public and access 
// default and access
// private and access
// private field and private method and access
// set and get private field without constructor
// set and get private field with constructor
// can constructor be private??


