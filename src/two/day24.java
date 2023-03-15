package two;


enum Color {
	RED,
	GREEN,
	BLUE
	
}

//class Color{
//		
//	public static final Color RED = new Color();
//  public static final Color GREEN = new Color();
//  public static final Color BLUE = new Color();
//
//}


enum Day{
	SUN,
	MON,
	TUE,
	WED,
	THU,
	FRI,
	SAT,
}

class Test {
	
	Day day;
	
	public Test(Day d) {
		this.day = d;
	}
	
	public void weekManagement() {
		
		switch(day) {
		case MON:
			System.out.println("Excel");
			break;
		case TUE:
			System.out.println("Python");
			break;
		case WED:
			System.out.println("Css");
			break;
		case THU:
			System.out.println("Javascript");
			break;
		case FRI:
			System.out.println("Java");
			break;
		case SAT:
			System.out.println("SQL");
			break;
		case SUN:
			System.out.println("TestCase");
			break;
			
		}
		
	}
	
}








public class day24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Color c1 = Color.RED;
		Color c2 = Color.BLUE;
		Color c3 = Color.GREEN;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
		Test t = new Test(Day.MON);
		t.weekManagement();
		
		Day[] days = Day.values();
		
		for(Day s:days) {
			System.out.println(s.ordinal());
			System.out.println(s);
		}
		
		System.out.println(Day.MON); // MON
		System.out.println(Day.TUE);
		
			
		
	}

}
