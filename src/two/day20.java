package two;

public class day20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.getArea(12, 13);
	}
	
	
	
}

interface Polygon {
	public void getArea(int length , int breadth);
}

class Rectangle implements Polygon {

	@Override
	public void getArea(int length, int breadth) {
		System.out.println("The area of rectangle is "+(length*breadth));
	}
	
	
}







// Abstract class 

// can we create object ?? NO 
// abstract class can have both methods 
// to abstract class use abstract keyword for class as well as method
// can abstract class have constructor ?? yes
// can we inherit abstract class ?
// interface implements 
// purpose of interface















