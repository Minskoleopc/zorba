package one;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Define and variable and assign a value
	
		int a = 10;
		System.out.println(a);
		
		// Arithmetic operator
		int s = 10;
		int t = 5;
				
		int q = s+t;
		System.out.println(q);  // 15
		System.out.println(s+t); // 15
		System.out.println(q+q);// 30
		
		
		
		System.out.println(s+t);
		System.out.println(s-t);
		System.out.println(s*t);
		System.out.println(s/t);
		System.out.println(s%t);
		
		//Addition - +
		//Subtraction - -
		//Multiplication - *
		//Division - /
		//Modulus - %
		
		int q1 = 90;
		int q2 = 45;
		
		System.out.println(q1+q2);
		System.out.println(q1-q2);
		System.out.println(q1*q2);
		System.out.println(q1/q2);
		System.out.println(q1%q2);
		
		// 10 pair - 50 lines
		
		// Calling the function
		
		Cal(12,13);
		Cal(120,12);
		
		//Calling second function - CalA()
		
		CalA();
		CalA();
		CalA();
		CalA();
		CalA();
		
		CalB(120,60);
		CalB(12,6);
		CalB(10,5);
		
		int x2 = CalC(12,3);
		System.out.println(x2);
		System.out.println(x2 + 15);
		System.out.println(x2 * 0.10);
		System.out.println(x2 /2);
		
		int q22 = Sub(10,5);
		System.out.println(q22);
		int q23 = Sub(100,50);
		System.out.println(q23);
		System.out.println(q23+q23);
		
		
	
	
	}
	
	static void Cal(int x , int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
	}
	
	//function without parameter and without return 
	
	static void CalA() {
		System.out.println(9+9);
	}
	
	// function with parameter and without return type
	static void CalB(int x , int y) {
		System.out.println(x+y);
	}
	
	
	// function with parameter and with return type
	// Difference  -- > $100 Given and showing $100
	
	static int CalC(int x, int y) {
		return (x + y);
	}
	
	// multiplication 
	
	static int Mul(int x , int y) {
		return x * y;
	}
	
	// division 
	
	static int Div(int x , int y) {
		return x / y;
	}
	
	// subtraction
	static int Sub(int x , int y) {
		return x - y;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
