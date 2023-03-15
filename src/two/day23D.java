package two;


enum Carss {
	
	// enums constants calling woth constructor
	SUV("BMW"),
	SEDANE("Q6"),
	MINI("MINI COPPER");
	

	private final String typeCar;
	
	private Carss(String a) {
		this.typeCar = a;
	}
	
	public String getTypes() {
		return this.typeCar;
	}

}
public class day23D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carss a = Carss.SEDANE;
		//System.out.println(a.);
		System.out.println(a.getTypes());
	}

}
