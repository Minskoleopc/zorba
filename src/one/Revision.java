package one;

public class Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		System.out.println(a);

		int s = 100;
		int t = 50;

		System.out.println(s + t);
		System.out.println(s - t);
		System.out.println(s * t);
		System.out.println(s / t);
		System.out.println(s % t);

		int x = 90;
		int y = 45;

		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

		Calculator(900, 45);
		Calculator(100, 10);

		Addition();
		Addition();
		Addition();
		Addition();
		Addition();

		AdditionB(12, 4);
		AdditionB(120, 4);
		AdditionB(120, 40);

		int q1 = AdditionC(34, 5);
		System.out.println(q1);
		System.out.println(q1 - 2);
		System.out.println(q1 * 0.10);
		System.out.println(q1 - 34);

		// relational operators
		// < , > , <= , >= ,!= , ==

		System.out.println(8 > 9); // false
		System.out.println(7 < 6); // false
		System.out.println(9 == 8); // false
		System.out.println(7 != 9); // true
		System.out.println(6 <= 6); // true
		System.out.println(9 >= 8); // true

		// Logical operator.

		// AND &&
		// true  && true ====> true
		// true && false ====> false
		// false && true ====> false
		// false && false ====> false
		
		
		System.out.println(8 == 8 && 7 != 6);
		System.out.println(8 == 8 && 7 == 6);
		System.out.println(8 != 8 && 7 != 6);
		System.out.println(8 != 8 && 7 == 6);
		
		// OR
		// true  || true ====> true
		// false || true ====> true
		// true ||  false ====> true
		// false || false====> false
		
		System.out.println(8 == 8 || 7 != 6); // true
		System.out.println(8 == 8 || 7 == 6); // true 
		System.out.println(8 != 8 || 7 != 6); // true
		System.out.println(8 != 8 || 7 == 6); // false
		
		// OR ||
		// NOT !
		// True  False 
		// False True
		
		System.out.println(!(9 != 8));
		System.out.println(!(9 == 8));
		
		int d = 90; // nothing
		System.out.println(d == 90); // boolean
		
		// conditional statements 
		
		int numT = 4;
//	
//		if(numT > 0 && numT <= 5) {
//			System.out.println("5%discount");
//		}	
//		if(numT > 5 && numT <= 10) {
//			System.out.println("10%discount");
//		}	
//		if(numT > 10) {
//			System.out.println("25% discount");
//		}	
		
		if(numT > 0 && numT <= 5) {
			System.out.println("5%discount");
		}	
		else if(numT > 5 && numT <= 10) {
			System.out.println("10%discount");
		}	
		else if(numT > 10) {
			System.out.println("25% discount");
		}	
		else {
			System.out.println("Please enter correct input");
		}
		
		
		int marks = 92;
		
//		if(marks > 90) {
//			System.out.println("Grade A");
//		}
//		if(marks > 70) {
//			System.out.println("Grade B");
//		}
//		if(marks > 65) {
//			System.out.println("Grade C");
//		}
		
//		if (marks > 90) {
//			System.out.println("Grade A");
//		}
//		else if (marks > 70) {
//			System.out.println("Grade B");
//		}
//		else if (marks > 65) {
//			System.out.println("Grade C");
//		}
		
		int a1 = 10;
		int b1 = 5;
	
		if(a1 > b1) {
			System.out.println("a1 is greater");
		}
		else {
			System.out.println("b1 is greater");
		}
		
		int j = 1000;
		int k = 5000;
		int l = 3000;
		
		if(j > k && j > l) {
			System.out.println("j is greater");
		}
		
		else if (k > j && k > l) {
			System.out.println("k is greater");
		}
		else {
			System.out.println("l is greater");
		}
		
		// switch case 
		
		int days = 44;
//		
//		switch(days) {
//		case 1:
//			System.out.println("Sunday");
//		case 2:
//			System.out.println("Monday");
//		case 3:
//			System.out.println("Tuesday");
//		case 4:
//			System.out.println("Wednesday");
//		case 5:
//			System.out.println("Thursday");
//		case 6:
//			System.out.println("Friday");
//		case 7:
//			System.out.println("Saturday");
//		default:
//			System.out.println("enter correct input");
//		}
		
//		switch(days) {
//		case 1:
//			System.out.println("Sunday");
//			break;
//		case 2:
//			System.out.println("Monday");
//			break;
//		case 3:
//			System.out.println("Tuesday");
//			break;
//		case 4:
//			System.out.println("Wednesday");
//			break;
//		case 5:
//			System.out.println("Thursday");
//			break;
//		case 6:
//			System.out.println("Friday");
//			break;
//		case 7:
//			System.out.println("Saturday");
//			break;
//		default:
//			System.out.println("enter correct input");
//		}
//		
		
		switch(days){
		case 1:
		case 11:
			System.out.println("Sunday");
			break;
		case 2:
		case 22:
			System.out.println("Monday");
			break;
		case 3:
		case 33:	
			System.out.println("Tuesday");
			break;
		case 4:
		case 44:
			System.out.println("Wednesday");
			break;
		case 5:
		case 55:
			System.out.println("Thursday");
			break;
		case 6:
		case 66:
			System.out.println("Friday");
			break;
		case 7:
		case 77:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("enter correct input");
		}
		
		
		
		
		
		
			//8pm ist	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

	static void Calculator(int x, int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

	}

	// function without parameter and without return type

	static void Addition() {
		System.out.println(8 + 7);
	}

	// function with parameter and without return type

	static void AdditionB(int x, int y) {
		System.out.println(x + y);
	}

	// function with parameter and with return type

	static int AdditionC(int x, int y) {
		return x + y;
	}

}
