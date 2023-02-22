package two;

public class day14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		GrandFather manohar = new GrandFather();
//		manohar.displayGName();
		
		
//		Father shirish = new Father();
//		
//		System.out.println(shirish.fatherFName);
//		System.out.println(shirish.firstName);
//		System.out.println(shirish.lastName);
//		
//		shirish.displayFName();
//		shirish.displayGName();
//		
		
		
		//	Son chinmay  = new Son();
		
//		System.out.println(chinmay.fatherFName);
//		System.out.println(chinmay.firstName);
//		System.out.println(chinmay.lastName);
//		System.out.println(chinmay.sonName);
//		chinmay.displayFName();
//		chinmay.displayGName();
//		chinmay.displaySName();
//		
		
		// with constructor
		
		GrandFatherA  manohara = new GrandFatherA("manohar","deshpande");
		System.out.println(manohara.firstName);
		System.out.println(manohara.lastName);
		manohara.displayGName();
		
		

		FatherA shrish = new FatherA("manohar","deshpande","shirish");
		
		System.out.println(shrish.ffirstName);
		System.out.println(shrish.lastName);
		System.out.println(shrish.firstName);
		
		shrish.displayGName();
		shrish.displayFName();
		
		
		SonA chinmaya = new SonA("manohar","deshpande","shirish","chinmay"); 
		
		System.out.println(chinmaya.ffirstName);
		System.out.println(chinmaya.lastName);
		System.out.println(chinmaya.firstName);
		System.out.println(chinmaya.sName);
		
		chinmaya.displayFName();
		chinmaya.displayGName();
		chinmaya.displaySName();
		
	}
	
	

}

//class GrandFather {
//	
//	String firstName = "manohar";
//	String lastName = "deshpande";
//	
//	public void displayGName() {
//		System.out.println(this.firstName + this.lastName);
//	}
//	
//}
//
//class Father extends GrandFather {
//	
//	String fatherFName = "shirish";
//	
//	public void displayFName() {
//		System.out.println(this.fatherFName + this.lastName);
//	}
//}
//
//
//class Son extends Father {
//	
//	String sonName = "chinmay";
//	
//	public void displaySName() {
//		System.out.println(this.sonName + this.lastName);
//	}
//	
//}


class GrandFatherA {
	
	String firstName ;
	String lastName;
	
	public GrandFatherA(String fn , String ln) {
		this.firstName = fn;
		this.lastName = ln;		
	}
	
	public void displayGName() {
		System.out.println(this.firstName + this.lastName);
	}
	
	
}


// Parent having constructor and child is not having constructor

class FatherA extends GrandFatherA {
	String ffirstName;
	public FatherA(String fn,String ln,String ffn) {
		
		// fn -- manohar
		// ln -- deshpande
		// ffn = shirish
		super(fn,ln);
		this.ffirstName = ffn;
	}
	
	public void displayFName() {
		System.out.println(this.ffirstName + this.lastName);
	}
		
}

class SonA extends FatherA {
	String sName;
	public SonA(String fn, String ln, String ffn, String sName) {
		super(fn, ln, ffn);
		this.sName = sName;
	}

	public void displaySName() {
		System.out.println(this.sName + this.lastName);
	}
	

}

















