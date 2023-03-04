package two;

public class day21B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Studentss aa = new Studentss("chinmay deshpande");
		Studentss bb = new Studentss("chinmay deshpande");
		Studentss cc = new Studentss("chinmay deshpande");
		Studentss dd = new Studentss("chinmay deshpande");
		Studentss ee = new Studentss("chinmay deshpande");
		
		
		System.out.println(Studentss.count);
		//Studentss.objeCount();
		//Studentss.increaseCount();
		

	}

}

class Studentss {
	
	static int count = 0;
	
	String fullName;
	public Studentss(String fullName) {
		this.fullName = fullName;
		//Studentss.count = Studentss.count+ 1;
		Studentss.increaseCount();
	}
	
//	public static void objeCount() {
//		System.out.println(Studentss.count);
//	}
//	
	public static void increaseCount() {
		Studentss.count = Studentss.count+ 1;
	}
	
	
	
	
	
	
	
	
	
} 