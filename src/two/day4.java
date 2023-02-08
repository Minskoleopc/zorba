package two;

public class day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 012345678910
		// java is fun
		String str2 = "java is fun";
		String q1 = str2.substring(0, 4); // End value is not included
		System.out.println(q1);

		// 0 1 2 3 4 5 6
		// p r o g r a m

		String str3 = "program"; // end index is optional
		String q2 = str3.substring(2);
		System.out.println(q2);
		// 0 1 2 3
		// p u n e
		String str4 = "pune";
		String q4 = str4.substring(1, 3);
		System.out.println(q4);

		// Join

		String str = "Hi";
		String str5 = "I am learning";
		String str6 = "java";

		String h = String.join(" ", str, str5, str6);
		System.out.println(h);

		String str7 = "chinmaydeshpande";
		String str8 = "gmail.com";
		String str9 = String.join("@", str7, str8);
		System.out.println(str9);

		String str10 = "chinmay";
		String str11 = "shirish";
		String str12 = "deshpande";
		// chinmay-shirish-deshpande
		String q3 = String.join("-", str10, str11, str12);
		System.out.println(q3);

		// progra3

		String city6 = "Nagpur"; //
		// 012345
		// Nagpur

		int q5 = city6.indexOf('a');
		System.out.println(q5);
		String city7 = "samay";
		// 0 1 2 3 4 5
		// s a m a y a
		int q6 = city7.indexOf("a", 4);
		System.out.println(q6);

		String city8 = "samaya dani";

		for (int i = 1; i < city8.length(); i++) {
			if (city8.charAt(i) == 'a') {
				System.out.println(i);
			}
		}

		// chinmay deshpande

		String city9 = " Learning java is fun ";
		String city10 = city9.trim();
		System.out.println(city10.length());
		System.out.println(city9.length());

		// If want to remove spaces in between
		String q11 = city10.replace(" ", "");
		System.out.println(q11);

		// Program4

		String q12 = "I am learning css";
		// ["I","am","learning","css"];
		String[] q13 = q12.split(" ");
		System.out.println(q13);
//		String result = "";
//
//		for (String strs : q13) {
//			System.out.println(strs);
//		}
		
		//program5 
		
		String firstName1 = "I am learning java";
		String firstName2 = "";
		
		boolean q111 = firstName1.isEmpty();
		System.out.println(q111);
		
		boolean q112 = firstName2.isEmpty();
		System.out.println(q112);
		
	
	}

}
