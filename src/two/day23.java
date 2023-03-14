package two;

public class day23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Vehicle3 v = new Vehicle3();
//		Vehicle3 v2 = new Vehicle3();
//		Vehicle3 v3 = new Vehicle3();
		
		
		//Vehicle3 va2 = new Vehicle3();
		
		Vehicle3.createInstance();
		Vehicle3.createInstance();
		Vehicle3.createInstance();
		Vehicle3.createInstance();
		
	}
	
	

}

class Vehicle3 {
	
	static Vehicle3 va ;
	private Vehicle3() {
		
	}
	public static Vehicle3 createInstance() {
		
		if(va == null) {
			System.out.println("hello");
			va = new Vehicle3();
		}
		return va;
	}
}





//class Vehicle3 {
//	
//	String type = "sedane";
//	public void displayType() {
//		System.out.println("Sedane");
//	}
//	
//}
