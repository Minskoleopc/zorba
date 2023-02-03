package two;

public class day1String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// creating a String
		// Program 1
		String subject = "I am learning selenium";
		String subject2 = "I am learning python";
		String subject3 = "I am learning java";
		System.out.println(subject);
		System.out.println(subject2);
		System.out.println(subject3);
		
		// String  + Integer  ===>  String
		// Integer + Integer  ===>  Integer
		// Integer + String   ===>  String
		// String  + String   ====> String
		
		// Program 2
		System.out.println("hello"+2); // "22"
		System.out.println(3+2); // 5
		System.out.println(3+"3"); // "33"
		System.out.println("3"+"3"); // "33"
		
		//Program 3
		//Length() of string
		
		String greet = "I am learning java";
		int a1 = greet.length();
		System.out.println(a1);
		System.out.println(greet.length());
		
		int x1 = 90;
		System.out.println(x1); // 90
		System.out.println("x1"); // x1
		
		// Program 4
		String first = "Python";
		String second = " Learning";
		System.out.println(first+second);
		
		//Program 5
		
		String three = "I am learning ";
		String four = "java !";
		String five = three.concat(four);
		System.out.println(five);
		
		// Program 6
		String city = new String("pune");
		System.out.println(city);
		
		//Programs7
		
		// Form ---->  Mumbai  MumBai MUMBAI ====> mumbai
		
		String city1 = "Nagpur";
		String cityU = city1.toUpperCase();
		System.out.println(cityU);
		
		String city2 = "Mumbai";
		String cityL = city2.toLowerCase();
		System.out.println(cityL);
		
		String city3 = "goa"; //"Goa"	
		System.out.println(city3.length());
		
		String country = "Nepal";
		int q2 = country.toUpperCase().toLowerCase().length();
		System.out.println(q2);
		//"nepal".length() 
		//"5".toUpperCase()
		System.out.println("5".toUpperCase());
			
	}
		
	
}
