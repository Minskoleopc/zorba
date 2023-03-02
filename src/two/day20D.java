package two;

public class day20D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dd a = new Dd("pune",411028);
		a.one();
		
	}

}


interface Aa {
	public void one();
	public void two();
}

interface Bb {
	public void three();
	public void four();
}

abstract class Cc {
	String city;
	public Cc(String cc) {
		this.city = cc;
	}
	
	abstract public void five();
	
	public void displayCity() {
		System.out.println(this.city);
	}
	
}

class Dd extends Cc implements Aa , Bb {
	int pincode;
	public Dd(String cc ,int pincode) {
		super(cc);
		this.pincode = pincode;
	}

	@Override
	public void three() {
		// TODO Auto-generated method stub
		System.out.println("three");
	}

	@Override
	public void four() {
		// TODO Auto-generated method stub
		System.out.println("four");
	}

	@Override
	public void one() {
		// TODO Auto-generated method stub
		System.out.println("one");
	}

	@Override
	public void two() {
		// TODO Auto-generated method stub
		System.out.println("two");
	}

	@Override
	public void five() {
		// TODO Auto-generated method stub
		System.out.println("five");
	}
	
	public void Dda() {
		System.out.println("D is called");
	}
	
	
	
}




