package two;

public class day22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grocery g = new Grocery();
		System.out.println(g.price);
		
		Grocery.Fruit ga = g.new Fruit();
		System.out.println(ga.supplier);
		System.out.println(ga.vendor);
		ga.displayCity();
		
		Grocery.Vegetables va = g.new Vegetables();
		System.out.println(va.supplier);
		System.out.println(va.vendor);
		va.displayCity();
		
		
		
		
	}

}

class Grocery {
	
	int price  = 100;
	
	
	// Inner class
	class Fruit {
		String supplier = "Vedanta";
		String vendor = "Adani";
		public void displayCity() {
			System.out.println("City is pune");
		}
	}
	// Inner
	class Vegetables {
		String supplier = "Reliance";
		String vendor = "Tata";
		public void displayCity() {
			System.out.println("City is Banglore");
		}
		
	}
	
	
	
	
	
	
	
	
}