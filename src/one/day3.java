package one;

public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello");
		addition();
		addition();
		addition();
		System.out.println("bye");
		
		sub(100,50); 
		sub(900,450);
		
		int q1 = multilplication(12,12);
		System.out.println(q1);
		System.out.println(q1 * 0.10);
		System.out.println(q1 + 10);
		
		
		multilplication2(q1,10);
	}

	
	// function without parameter and without return 
	
	static void addition() {
		System.out.println(9+9);
	}
	
	
	// function with parameter and without return type
	
	static void sub(int x, int y){
		System.out.println(x-y);
	}
	

	// function with parameter and with return type 
	
	static int multilplication(int x , int y) {
		System.out.println(x*y); //144
		return x * y ;
	}
	
	static void multilplication2(int x , int y) {
		System.out.println(x*y);  // 1440	
	}
	
	
	
	
}
