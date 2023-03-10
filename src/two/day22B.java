package two;

public class day22B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car cc = new Car("adad","q3");
		
		Car.TypeEngine tr = cc.new TypeEngine();
		tr.Size();
		tr.displayEngine();
		
		

	}

}

// How to access outer class property inside a inner class


class Car {
	
	String type ;
	String model;
	
	public Car(String ty, String md) {
		this.type = ty; //
		this.model = md;
	}
	
	class TypeEngine {
		
		String engine;
		
		public String Size() {  // size
			
			if(Car.this.type.equals("suv")) {
				this.engine = "bigger";
			}
			else if(Car.this.type.equals("sedane")) {
				this.engine = "smaller";
			}
			else {
				this.engine = "default";
			}
			
			return this.engine;
			
			
		}
		
		public void displayEngine() {    // 
			System.out.println(this.engine);
		}
		
			
	}
	
	
	
}