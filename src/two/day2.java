package two;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Program1

		// "pune" == "pune"

		String city1 = "pune";
		String city2 = "pune";
		String city3 = "mumbai";
		

		boolean result = city1.equals(city2);
		System.out.println(result);
		if (result) {
			System.out.println("city 1 and city2  equal");
		}
		else {
			System.out.println("city 1 and city2 are not equal");
		}
		
		// compare city1 and city 3 with ternary operator
		
		String result2 = city1.equals(city3) ? "equal":"not equal";
		System.out.println(result2);

		// Program 2
		
		//String example = "Best quote "Try try but donot cry"";
		String example = "Best quote \"Try try but donot cry\""; 
		// Escaspe character
		
		
		// program2
		
		String city4 = "Nagpur";
		boolean result3 = city4.startsWith("Nag");
		boolean result4 = city4.startsWith("n");
		System.out.println(result3);
		System.out.println(result4);
		
		// Program3
		String city5 = "Wardha";
		boolean result5 = city5.endsWith("a");
		boolean result6 = city5.endsWith("dha");
		System.out.println(result5);
		System.out.println(result6);
		
		// Program4
		
		String sen1 = "I am learning javascript";
		boolean result7 = sen1.contains("learning");
		System.out.println(result7);
		
		// Program5
		String sen2 = "I am learning javascript and javascript is great";
		String result8 = sen2.replace("j", "K");
		System.out.println(result8);
		
		String result9 = sen2.replaceAll("javascript", "java");
		System.out.println(result9);
		
		
		String result10 = sen2.replaceFirst("javascript", "java");
		System.out.println(result10);
		
		//Program 6
		
		String city6 = "chandrapur";
		// index starts from zero
		// 0   1   2   3   4   5   6   7   8  9
		// c   h   a   n   d   r   a   p   u  r
		char a = city6.charAt(4);
		System.out.println(a);	 // d	
		System.out.println(city6.length());

		// length()-1 is always last index
		
		
		String city7 = "jaipura";
		//  0    1    2    3   4   5  6
		//  j    a    i    p   u   r  a
		int len = city7.length();
		System.out.println(len);
		
		for(int i = 0 ; i < len ; i++) { //1 // 2 // 3 // 4 // 5 // 6
			//System.out.println(i); 
			System.out.println(city7.charAt(i));
			
			// i ---- 0 
			// i ---- 1
			// i ---- 2
			// i ---- 3
			// i ---- 4
			// i ---- 5
			
		}
		
		// reverse the string
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
		
	
	
	

}
