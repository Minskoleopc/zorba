package two;

enum Cars {

	SEDANE, SUV, MINI
}

public class day23C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCars cc = new TestCars(Cars.SEDANE);
		cc.getCarType();

	}

}

class TestCars {
	Cars cCar;

	public TestCars(Cars s) {
		this.cCar = s;
	}

//	public void getCarType() {
//		switch (cCar) {
//		case SEDANE:
//			System.out.println("Audi Q6");
//			break;
//		case SUV:
//			System.out.println("BMW");
//			break;
//
//		case MINI:
//			System.out.println("Mini Cooper");
//			break;
//		default:
//			System.out.println("Have you own type");
//		}
//		
//	}
	
	
	
	public String getCarType() {
	switch (cCar) {
	case SEDANE:
		System.out.println("Audi Q6");
		return "AUDI Q6";
	case SUV:
		System.out.println("BMW");
		return "BMW";

	case MINI:
		System.out.println("Mini Cooper");
		return "Mini Cooper";
	default:
		System.out.println("Have you own type");
		return "Have you own type";
	}
	
}
	
	
	
	
	
	
	
	
	
	

}