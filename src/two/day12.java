package two;

public class day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addition(12,3);
		addition(12,3,3);
		addition(12,3,3);
	}
	
	// same class , same method , different  signature --- overloading
	
	public static void addition(int x, int y) {
		System.out.println(x+y);
	}
	
	public static void addition(int x, int y , int z) {
		System.out.println(x+y+z);
	}

	public static void addition(int x, int y , int z , int a) {
		System.out.println(x+y+z+a);
	}

}


