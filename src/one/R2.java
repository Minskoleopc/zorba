package one;

public class R2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int z = 10;
		int y = 5;
		System.out.println(z + y);
		System.out.println(z - y);
		System.out.println(z * y);
		System.out.println(z / y);
		System.out.println(z % y);

		int s = 8;
		int t = 4;

		System.out.println(s + t);
		System.out.println(s - t);
		System.out.println(s * t);
		System.out.println(s / t);
		System.out.println(s % t);

		// 10 pair -- 50 lines DRY

		// Calling the function
		Calculator(10, 5);
		Calculator(100, 50);
		Calculator(80, 40);

		Addition();
		Addition();
		Addition();

		AdditionB(12, 4);
		AdditionB(12, 3);
		AdditionB(12, 5);

		int x1 = 90;
		int x2 = 45;

		int e = AdditionC(x1, x2);
		System.out.println(e);
		System.out.println(e + 3);
		System.out.println(e * 0.10);

		// comparison operator
		// < ,> , <= , >= , != ,==

		System.out.println(4 == 5); // False
		System.out.println(4 != 5); // True
		System.out.println(4 < 5); // True
		System.out.println(4 > 5); // False
		System.out.println(4 >= 5); // False
		System.out.println(4 <= 5); // True
		System.out.println(4 <= 4); // True
		System.out.println(4 >= 4); // True

		// Logical operator

		// AND &&

		// Truth Table

		// True && True -------> True
		// True && False -------> False
		// False && True -------> False
		// False && False -------> False

		System.out.println(22 == 22 && 33 == 33);
		System.out.println(22 != 22 && 33 == 33);
		System.out.println(22 != 23 && 33 != 33);
		System.out.println(22 == 23 && 33 != 33);

		// OR ||

		// True || True -------> True
		// True || False -------> True
		// False || True -------> True
		// False || False -------> False

		System.out.println(22 == 22 || 33 == 33);
		System.out.println(22 != 22 || 33 == 33);
		System.out.println(22 != 23 || 33 != 33);
		System.out.println(22 == 23 || 33 != 33);

		// NOT !

		// False -- True
		// True -- False

		System.out.println(!(8 == 8));
		System.out.println(!(8 != 8));

		// condition statements

		int numT = 5;

//		if(numT > 0 && numT <= 5) {
//			System.out.println("10 % discount");
//		}
//		if(numT > 5 && numT <= 10) {
//			System.out.println("20 % discount");
//		}
//		if(numT > 10) {
//			System.out.println("30 % discount");
//		}

		if (numT > 0 && numT <= 5) {
			System.out.println("10 % discount");
		} else if (numT > 5 && numT <= 10) {
			System.out.println("20 % discount");
		} else if (numT > 10) {
			System.out.println("30 % discount");
		}

		int marks = 92;

//		if(marks > 90) {
//			System.out.println("Grade A");
//		}
//		if(marks > 75) {
//			System.out.println("Grade B");
//		}
//		if(marks > 60) {
//			System.out.println("Grade C");
//		}

		if (marks > 90) {
			System.out.println("Grade A");
		} else if (marks > 75) {
			System.out.println("Grade B");
		} else if (marks > 60) {
			System.out.println("Grade C");
		} else {
			System.out.println("Fail please try again");
		}

		int q1 = 100;
		int q2 = 500;

//		if(q1 > q2) {
//			System.out.println("q1 is greater");
//		}
//		else {
//			System.out.println("q2 is greater");
//		}

		// Ternary operator

		String result = q1 > q2 ? "q1 is greater" : "q2 is greater";
		System.out.println(result);

		// switch

		String city = "indore";
//		switch (city) {
//
//		case "pune":
//			System.out.println("MH");
//		case "bhopal":
//			System.out.println("MP");
//		case "jaipur":
//			System.out.println("RJ");
//		case "kanpur":
//			System.out.println("UP");
//		default:
//			System.out.println("In correct city name");
//
//		}

//		switch (city) {
//		case "pune":
//			System.out.println("MH");
//			break;
//		case "bhopal":
//			System.out.println("MP");
//			break;
//			
//		case "jaipur":
//			System.out.println("RJ");
//			break;
//		case "kanpur":
//			System.out.println("UP");
//			break;
//		default:
//			System.out.println("In correct city name");
//
//		}

//		
//		switch (city) {
//		case "pune":
//		case "nagpur":
//			System.out.println("MH");
//			break;
//		case "bhopal":
//		case "indore":
//			System.out.println("MP");
//			break;
//			
//		case "jaipur":
//		case "udaipur":
//			System.out.println("RJ");
//			break;
//		case "kanpur":
//		case "varanasi":
//			System.out.println("UP");
//			break;
//		default:
//			System.out.println("In correct city name");
//
//		}

		// for
//		
//		for(initialization ; conditionCheck ; increment/ decrement) {
//			// statements 
//		}

		
		for(int i = 0 ; i <= 5 ; i++) {
			System.out.println("hello");
		}
		
		for(int i = 1 ; i <= 3 ; i++) { //2 // 3 // 4
			System.out.println(i); // 1 // 2 // 3
		}
		 
		for(int i = 3 ; i >= 1 ; i--) { // 2 //1 // 0
			System.out.println(i); // 3 // 2 // 1
		}
		
		for(int i = 5 ; i >= 1 ; i--) { 
			if(i == 3) {
				break;
			}
			System.out.println(i); 
		}
		
		for(int i = 5 ; i >= 1 ; i--) { 
			System.out.println(i); 
			if(i == 3) {
				break;
			}
			
		}
		
		for(int i = 5 ; i >= 1 ; i--) { 
			if(i == 3) {
				continue;
			}
			System.out.println(i); 
			
		}
		
	  // while loop	
		
		int i1 = 2;
		while(i1 <= 20) {
			System.out.println(i1);
			i1 = i1 + 2;
		}
		
		int i2 = 20;
		while(i2 >= 2) {
			System.out.println(i2);
			i2 = i2 - 2;
		}
		
		int i3 = 20;
		while(i3 >= 2) {
			System.out.println(i3);
			if(i3 == 14) {
				break;
			}
			i3 = i3 - 2;
		}
		
		int i4 = 20;
		while(i4 >= 2) {
			
			if(i4 == 14) {
				break;
			}
			System.out.println(i4);
			i4 = i4 - 2;
		}
		
		
		int d = 1;
		while(d <= 5) {
			if(d == 3) {
				d ++; // 4
				continue;
			}
			System.out.println(d); // 1 // 2 // 4 // 5
			d ++; //2 // 3 // 5 // 6
		}
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
			
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	public static void Calculator(int x, int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
	}

	// function without parameter and without return type

	public static void Addition() {
		System.out.println(8 + 1);
	}

	// function with parameter and without return type

	public static void AdditionB(int x, int y) {
		System.out.println(x + y);

	}

	// function with parameter and with return type

	public static int AdditionC(int x, int y) {
		System.out.println(x + y);
		return x + y;
	}

}
