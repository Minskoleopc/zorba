package two;

public class day20E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectanglea rr = new Rectanglea();
		rr.getArea();
		rr.getCordinated();
		rr.getCordinated(2);
	}

}

interface Plot {
	public void getArea();
	// default method
	default void getCordinated() {
		System.out.println("X is x and Y is Y");
	}
	
	default void getCordinated(int x) {
		System.out.println("Or .....X is x and Y is Y");
	}
}

class Rectanglea implements Plot{
	
	// different class , same method name , same signature 
	// inheritance or implements
	// same class same method different signature

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("Area if of rectangle");
	}
	
	public void getCordinated() {
		System.out.println("R .......X is x and Y is Y");
	}
	
}
