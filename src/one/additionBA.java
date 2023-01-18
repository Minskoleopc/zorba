package one;

public class additionBA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		additionA(1);
		additionA(11,22);
		additionA(11,22,33);
		
	}
	
	// overloading 
	// same class , same method name , differnet signature
	
	
	static void additionA(int x){
		System.out.println(x);
	}
	
	static void additionA(int x ,int y){
		System.out.println(x+y);
	}
	
	static void additionA(int x ,int y ,int z){
		System.out.println(x+y+z);
	}
	
	

}
