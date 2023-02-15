package two;

public class day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// conditional statement
		// one input multiple outcome

//		if(condition) {
//			// statements
//		}

		// program 1
		// check whether given number is positive

		int number = 90;

		if (number > 0) {
			System.out.println("positive");
		} else {
			System.out.println("negative");
		}

		// program 2
		// greatest of 2 given number

		int a = 1000;
		int b = 500;

		if (a > b) {
			System.out.println("a is greater");
		} else {
			System.out.println("b is greater");

		}
		// program 3
		int numT = 11;

		if (numT > 0 && numT <= 5) {
			System.out.println("5 % discount");
		}
		if (numT > 5 && numT <= 10) {
			System.out.println("10 % discount");
		}
		if (numT > 10) {
			System.out.println("30 % discount");
		}
		
		
		if (numT > 0 && numT <= 5) {
			System.out.println("5 % discount");
		}
		else if (numT > 5 && numT <= 10) {
			System.out.println("10 % discount");
		}
		else if (numT > 10) {
			System.out.println("30 % discount");
		}
		
		
		int marks = 92;
		
		if(marks > 90) {
			System.out.println("Grade A");
		}
		if(marks > 75) {
			System.out.println("Grade B");
		}
		if(marks > 60) {
			System.out.println("Grade C");
		}
		
		if(marks > 90) {
			System.out.println("Grade A");
		}
		else if(marks > 75) {
			System.out.println("Grade B");
		}
		else if(marks > 60) {
			System.out.println("Grade C");
		}
		
		else {
			System.out.println("Fail , please try again");
			

			
		}
		
		int a1 = 10000;
		int b1 = 600;
		int c1 = 70;
		
		
		if(a1 > b1) {
			if(a1 > c1) {
				System.out.println("a1 is greater");
			}
		}
		else if(b1 > a1) {
			if(b1 > c1) {
				System.out.println("b1 is greater");
			}
			else {
				System.out.println("c1 is greater");
			}
		}
		
		
		if(a1 > b1 && a1 > c1) {
			System.out.println("a1 is greater");
		}
		else if(b1 > a1 && b1 > c1) {
			System.out.println("b1 is greater");
		}
		else {
			System.out.println("c1 is greater");
		}
		
		
		// switch case 
		
		int size = 24;
		
//		
//		switch(size) {
//			case 29:
//				System.out.println("small");
//			case 42:
//				System.out.println("medium");
//			case 49:
//				System.out.println("xl");
//			default:
//				System.out.println("please enter correct values");
//		}
//		

//		switch(size) {
//			case 29:
//				System.out.println("small");
//				break;
//			case 42:
//				System.out.println("medium");
//				break;
//			case 49:
//				System.out.println("xl");
//				break;
//			default:
//				System.out.println("please enter correct values");
//		}

		switch(size) {
		case 29:
		case 24:
			System.out.println("small");
			break;
		case 42:
		case 44:
			System.out.println("medium");
			break;
		case 49:
		case 50:
			System.out.println("xl");
			break;
		default:
			System.out.println("please enter correct values");
	}
		
		
	// for loop
		
		
//		for(intialzation ; conditionCheck , increment/decrement) {
//			// statements
//		}
//		
		
		// print 1 to 5
		
		for(int i = 1 ; i <= 5 ; i++) { //2 // 3 // 4 // 5 // 6
			System.out.println(i); // 1 // 2 // 3 // 4 // 5
		}
		
		// print 5 to 1
		for(int i = 5 ; i >= 1;i--) {
			System.out.println(i);
		}
		
		// table of 2
		for(int i = 2 ; i <= 20 ; i = i + 2) {
			System.out.println(i);
		}
		
		// even number between 1 to 50
		for(int i = 1 ; i<= 50 ; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		// break 
		
		for(int i = 100 ; i >= 1 ; i--) {
			System.out.println(i);
			if(i == 96) {
				break;
			}
		}
		
		
		for(int i = 100 ; i >= 1 ; i--) {
			if(i == 96) {
				break;
			}
			System.out.println(i);
		}
		
		
		for(int i = 100 ; i >= 1 ; i--) {
			if(i == 96) {
				continue;
			}
			System.out.println(i);
		}
		
		
		// print 1 to 5
		
		
		
		
		int y1 = 1;
		
		while(y1 <= 5) {
			System.out.println(y1);
			y1 ++;
		}
		
		int y2 = 5;
		while(y2 >= 1) {
			System.out.println(y2);
			y2 --;
		}
		
		int y3 = 3;
		while(y3 <= 30) {
			System.out.println(y3);
			y3 = y3 + 3;
		}
		
		int y4 = 40;
		while(y4 >= 4) {
			System.out.println(y4);
			y4 = y4 - 4;
		}
		
		
		int y5 = 8;
		
		while(y5 >= 1) {
			System.out.println(y5);
			if(y5 == 4) {
				break;
			}
			y5 --;
		}
		
		int y6 = 8;
		while(y6 >= 1) {
			if(y6 == 4) {
				break;
			}
			System.out.println(y6);
			y6 --;
		}
		
		int y7 = 8;
		while(y7 >= 1) {
			
			if(y7 == 4) {
				y7 --; // 3
				continue;
			}
			System.out.println(y7); // 8 // 7 // 6 // 5 // 3 // 2 // 1
			y7 --; // 7 // 6 // 5 // 4 // 2 // 1 // 0
		}
		
		
		String k = "i am learning javascript";
		for(int i = 0 ; i < k.length() ; i++) {
			if(k.charAt(i)=='a') {
				System.out.println(i);
			}
			
		}
		
		int [] numbers = {11,22,33,44};
		int sum = 0;
		
		for(int i = 0 ; i < numbers.length ; i++) {
				sum = sum + numbers[i];
		}
		System.out.println(sum);
		

		for(int i:numbers) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		
		int d = 90;
		int h = 45;
		
		
		String hi  =d > h ? "d is greater":"h is greater";
		System.out.println(hi);
		
		
		String name = "chinmay";
		int count = 0;
		
		for(int i = 0 ; i < name.length() ; i++) {
			if(name.charAt(i) == 'a' || name.charAt(i) == 'e' ) {
				count = count + 1;
			}
		}
		System.out.println(count);
		
		
		
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
