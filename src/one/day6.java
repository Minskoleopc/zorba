package one;

public class day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ticket 
		
		// numT > 0 && numT <=5  // 1-5  // 10 percent
		// numT > 5 && numT <= 10 // 6-10 // 20 percent 
		// numT > 10 // 30 percent
		
		// Truth Table
		// &&  AND operator 
		// true      true  ====> true
		// false     true  ====> false
		// true      false ====> false
		// false     false ====> false
		
		
		int numT = 12;
		
		// true && false ====> false
//		if(numT > 0 && numT <= 5){
//			System.out.println("10 percent discount");
//		}
//		if(numT > 5 && numT <= 10){
//			System.out.println("20 percent discount");
//		}
//		if(numT > 10){
//			System.out.println("30 percent discount");
//		}
//		
//		if(numT > 0 && numT <= 5){
//			System.out.println("10 percent discount");
//		}
//		else if(numT > 5 && numT <= 10){
//			System.out.println("20 percent discount");
//		}
//		else if(numT > 10){
//			System.out.println("30 percent discount");
//		}
//		
		
		
		int marks = 92;
		
//		if(marks > 90) {
//			System.out.println("Grade A");
//		}
//		if(marks > 70) {
//			System.out.println("Grade B");
//		}
//		
//		if(marks > 65) {
//			System.out.println("Grade C");
//		}
		
//		if (marks > 90) {
//			System.out.println("Grade A");
//		}
//		else if (marks > 70) {
//			System.out.println("Grade B");
//		}
//
//		else if (marks > 65) {
//			System.out.println("Grade C");
//		}
//		else {
//			System.out.println("Fail");
//		}
		
		
		int a = 90;
		int b = 45 ;
		if(a > b) {
			System.out.println("A is greater");
		}
		else {
			System.out.println("B is greater");
		}
		
		
		int x = 10000;
		int y = 1500;
		int z = 200;
		
		// largest of 3 numbers
		
		if(x > y && x > z) {
			System.out.println("X is greater");
		}
		else if(y > x && y > z) {
			System.out.println("Y is greater");
		}
		else {
			System.out.println("Z is greater");
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
