package two;

public class day20C{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E e = new E();
		e.one();
		e.nine();
	}
}
	
class E implements C {

	@Override
	public void one() {
		// TODO Auto-generated method stub
		System.out.println("One");
	}

	@Override
	public void two() {
		// TODO Auto-generated method stub
		System.out.println("two");
	}

	@Override
	public void three() {
		// TODO Auto-generated method stub
		System.out.println("three");
	}

	@Override
	public void four() {
		// TODO Auto-generated method stub
		System.out.println("four");
	}

	@Override
	public void five() {
		// TODO Auto-generated method stub
		System.out.println("five");
	}

	@Override
	public void six() {
		// TODO Auto-generated method stub
		System.out.println("six");
	}

	@Override
	public void seven() {
		// TODO Auto-generated method stub
		System.out.println("seven");
	}

	@Override
	public void eight() {
		// TODO Auto-generated method stub
		System.out.println("eight");
	}

	@Override
	public void nine() {
		// TODO Auto-generated method stub
		System.out.println("nine");
	}
	
}


interface A {
	public void one();
	public void two();
	public void three();
}

interface B {
	public void four();
	public void five();
	public void six();
}

interface C extends A , B {
	
	public void seven();
	public void eight();
	public void nine();
	
}


