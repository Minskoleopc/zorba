package two;

public class day15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Student amol = new Student("amol rao",23,"pune");
//		amol.displayName();
//		
//		Teacher amolT = new Teacher("amol T",23,"pune",100000);
//		amolT.displayBonus();
//		//amolT.displayName();
		
	
		// Multilevel
//		ProfessorB sarika = new ProfessorB("sarika pansare",23,10000,"hindi");
//		
//		System.out.println(sarika.fullName);
//		System.out.println(sarika.age);
//		System.out.println(sarika.salary);
//		System.out.println(sarika.spec);
//		
//		sarika.displayName();
//		sarika.displayAge();
//		sarika.displaySalary();
//		sarika.displaySpec();
//		
		
		
		//Hierarchical
		
		Mother kanchan = new Mother("kanchan","deshpande");
		Son chinmay = new Son("kanchan","deshpande","chinmay");
		Daughter gauri = new Daughter("kanchan","deshpande","gauri");
		
		
		kanchan.displayName();
		chinmay.displaySName();
		gauri.displayDName();
		
		

		
	}
	
	

}

// Single  Inheritance

//class Student {
//	
//	String fullName;
//	int age;
//	String city;
//	
//	
//	public Student(String fn, int ag, String cy) {
//		this.fullName = fn;
//		this.age = ag;
//		this.city = cy;
//	}
//	
//	public void  displayName() {
//		System.out.println(this.fullName);
//	}
//	
//}
//
//// payment() ---- 100
//// discount()  ---- 100 * 0.10
//
//class Teacher extends Student {
//	int salary ;
//	public Teacher(String fn, int ag, String cy,int salary) {
//		super(fn, ag, cy);
//		this.salary = salary;	
//	}
//	
//	public void displayBonus() {
//		this.displayName();
//		System.out.println(100);
//	}
//		
//}
//

class StudentB {
	
	protected String fullName;
	protected int age;
	
	
	public StudentB(String fullName,int age) {
		this.fullName = fullName;
		this.age = age;
	}
	
	public void displayName() {
		System.out.println(this.fullName);
	}	
}

class TeacherB extends  StudentB{
	int salary;
	
	public TeacherB(String fullName, int age,int salary) {
		super(fullName, age);
		this.salary = salary;
	}
	
	public void displayAge() {
		System.out.println(this.age);
	}
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
	
}


class ProfessorB extends TeacherB {
	String spec;
	public ProfessorB(String fullName, int age, int salary,String spec) {
		super(fullName, age, salary);
		this.spec = spec;
	}
	
	void displaySpec(){
		System.out.println(this.spec);
	}
}


class Mother {
	
	String firstName;
	String lastName;
	
	
	public Mother(String fn , String ln) {
		this.firstName = fn;
		this.lastName = ln;
		
	}
	
	void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
	
}

class Son extends Mother{

	String sname;
	public Son(String fn, String ln,String sn) {
		super(fn, ln);
		this.sname = sn;
		// TODO Auto-generated constructor stub
	}
	
	void displaySName(){
		System.out.println(this.sname+ this.firstName+this.lastName);
	}
	
	
	
}


class Daughter extends Mother{

	String dname;
	public Daughter(String fn, String ln,String dn) {
		super(fn, ln);
		this.dname = dn;
		// TODO Auto-generated constructor stub
	}
	
	void displayDName(){
		System.out.println(this.dname+ this.firstName+this.lastName);
	}
	
}


