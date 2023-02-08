package two;

public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String city = "pune";
			//String city2 = new String("nagpur");
			System.out.println(city);
			
			// 0  1   2   3
			// p  u   n   e
			// program 1
			for(int i = 0 ; i < 4; i++ ) { //1 // 2 // 3 // 4
				//System.out.println(i); // 0 , 1 // 2 // 3
				// i ----0
				// i ----1
				// i ----2
				// i ----3
				System.out.println(city.charAt(i));
				
			}
	
			// 0   1  2  3
			// p   u  n  e 
			// program 2
			for(int i = city.length()-1 ;  i>=0 ; i--) {
				//System.out.println(i);
				System.out.println(city.charAt(i));
			}
			//program 3
			// chinmay  ======> yamnihc
			// pune ====> enup
			
			String country = "nepal"; 
			String rev  = "";
			
			for(int i = 0 ; i < country.length() ; i++) {
				//System.out.println(i);
				//System.out.println(country.charAt(i));
				
				rev = country.charAt(i) + rev;
				System.out.println(rev);
				//	        "n"         + ""     =====> n
				//          "e"         + "en"   =====> en
				//          "p"         + "pen"   =====> pen
				//          "a"         + "apen"  ======> apen
				//          "l"         + "lapen"  ======>lapen
			}
			
			
			System.out.println(rev);
			
			
			String city3 = "wardha";
			String rev2 = "";
			
			// 0   1  2   3   4   5
			// w   a  r   d   h   a
			
			for(int i =  city3.length()-1 ; i >= 0 ; i--) {
				//System.out.println(i);
				//System.out.println(city3.charAt(i));
				rev2 = rev2 + city3.charAt(i);
				
				//      ""  +  a   ======> a
				//       a  +   h  ======> ah
				//       ah +   d  =====> ahd
				//      ahd +   r  =====> ahdr
				//     ahdr  +  a  ======> ahdra
				//     ahdra +  w =======> ahdraw
				
			}
			System.out.println(rev2);
			
			
			// program 4
			String fruits = "apple mango banana grapes papaya";
			String userInput = "banana";
			if(fruits.contains(userInput)) {
				System.out.println("Fruit is available");
			}
			else {
				System.out.println("Fruit not available");
			}
			
			// program5
			// chinmay ----- vowels   "a" , "e" , "i" , "o" , "u"
			
			String firstName = "chinmay";
			int count = 0;
			
			
			for(int i = 0  ; i < firstName.length() ; i++) {
				System.out.println(firstName.charAt(i));
				
				if(firstName.charAt(i) == 'a' || firstName.charAt(i) == 'e' || firstName.charAt(i) == 'i' || firstName.charAt(i) == 'o' || firstName.charAt(i) == 'u') {
					count = count + 1;
				}
					
				
			}
			
			System.out.println(count);
			
			
			
		
	}

}
