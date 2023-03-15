package two;

public class day24C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrafficColor [] colors = TrafficColor.values();
		for( TrafficColor a :colors) {
			System.out.println(a.getAction());
			System.out.println(a);
		}
		
		TrafficColor v1 = TrafficColor.RED;
		System.out.println(v1.getAction());
		

	}

}

enum TrafficColor {
	RED("STOP"),
	GREEN("GO"),
	ORANGE("SLOW");
	
	private String action;
	private TrafficColor(String cl) {
		this.action = cl;
		
	}
	public  String getAction() {
		return this.action;
	}
	
	
	
	
	
}
