package one;

public class realationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// < , > , <= , >= , != ,==
		// ! negate

		int a = 900;

		System.out.println(a > 2); // boolean value type (true and false)
		System.out.println(22 == 22);
		System.out.println(7 >= 7);
		System.out.println(7 <= 7);
		System.out.println(8 >= 7);
		System.out.println(7 <= 6);
		System.out.println(7 != 6);
		System.out.println(7 < 6);

		int a1 = 100;
		int a2 = 100;

		System.out.println(a1 == a2);

		// Logical operators

		// AND &&

		// true && true ====> true
		// true && false ====> false
		// false && true ====> false
		// false && false ====> false
		
		System.out.println(2 == 2 && 4 != 3);
		System.out.println(2 != 5 && 4 == 4);
		System.out.println(2 == 2 && 4 != 4);
		System.out.println(2 > 2 && 4 != 3);
		System.out.println(2 > 2 && 4 == 3);
		


		// OR &&
		
		// cntrl + shift + F
		// true || true ====> true
		// true || false ====> true
		// false || true ====> true
		// false || false ====> false
		
		
		System.out.println(2 == 2 || 4 != 3); // true
		System.out.println(2 != 5 || 4 == 4); // true
		System.out.println(2 == 2 || 4 != 4); // true
		System.out.println(2 > 2 || 4 != 3); // true
		System.out.println(2 > 2 || 4 == 3); // false
		

		// NOT !
		
		// false --- true
		// true  --- false
		
		System.out.println(!(2==2));
		System.out.println(!(2!=2));

	}

}
