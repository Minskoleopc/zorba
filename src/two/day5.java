package two;

public class day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0 1 2 3 4 5
		// a p p l e p

		String fruit = "applep";
		int a = fruit.indexOf('p', 3);
		System.out.println(a);
		int count = 0;
		for (int i = 0; i < fruit.length(); i++) {

			if (fruit.charAt(i) == 'p') {
				System.out.println(i);
				count = count + 1;
			}
		}
		System.out.println(count);
		
		
		// array 
		
		int nums [] = new int[5];
		nums[0] = 99;
		nums[1] = 100;
		nums[2] = 101;
		nums[3] = 102;
		nums[4] = 103;
			
		//          0   1   2   3   4
		// nums => [99,100,101,102,103]
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		
		// 0   1  2  3   4
		// a   p  p  l   e
		
//		String j = "apple";
//		for(int i = 0 ; i < j.length() ; i++) {
//			//System.out.println(i);
//			System.out.println(j.charAt(i));
//		}
//		
		
		
		// program 3
		
		int numss [] = new int[5];
		numss[0] = 99;
		numss[1] = 100;
		numss[2] = 101;
		numss[3] = 102;
		numss[4] = 103;
		
		System.out.println(numss.length);
		for(int i = 0 ; i < numss.length;i++) {
			//System.out.println(i);
			System.out.println(numss[i]);
		}
		
		// program4
		
		String cities [] = new String[3];
		cities[0] = "pune";
		cities[1] = "bangalore";
		cities[2] = "nagpur";
		
		for(int i = 0 ; i < cities.length ; i++) {
			//System.out.println(i);
			System.out.println(cities[i]);
		}
		
		// program 5
		//                 0  1  2   3 4  5  6
		int numbersb [] = {11,22,33,44,55,66,77}; 
		
		for(int i = 0 ; i < numbersb.length ; i++) {
			//System.out.println(i);
			System.out.println(numbersb[i]);
		}
		
		// program 6 
		
		String fruits [] = {"apple","mango","banana","grapes"};
		for(int i = 0 ; i < fruits.length ; i++) {
			System.out.println(fruits[i]);
		}
		
		
		
		char aa [] = {'a','p','p','l','e'};
		for(int i = 0 ; i < aa.length ; i++) {
			System.out.println(i);
			System.out.println(aa[i]);
		}
		
		// program 7
		
		String  firstName = "chinmay";
		char [] ra = firstName.toCharArray(); //{'c','h','i','n','m','a','y'}
		for(int i = 0 ; i < ra.length ; i++) {
			System.out.println(i);
			System.out.println(ra[i]);
		}
		
		// program 8
		
		String e = "I am learning java";
		String ra2 [] = e.split(" ");
		String ra3 [] = e.split("a");
		
		//{"I","am","learning","java"}
		//{"I ","m le","rning ","j","va"}
	
		for(int i = 0 ; i < ra2.length ; i++) {
			//System.out.println(i);
			System.out.println(ra2[i]);
		}
		
		for(int i = 0 ; i < ra3.length ; i++) {
			//System.out.println(i);
			System.out.println(ra3[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
