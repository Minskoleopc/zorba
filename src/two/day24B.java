package two;

public class day24B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Color2 c2 = Color2.YELLOW;
		c2.displayColor();
		System.out.println(c2);

	}

}


enum Color2 {
	
	YELLOW,
	ORANGE,
	GREEN,
	RED;
	
	private Color2() {
		System.out.println("constructor called");
	}
	
	public void displayColor(){
		System.out.println("color2 method called");
	}
}