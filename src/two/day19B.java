package two;

public class day19B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BOI h= new BOI();
		h.discount();
		h.homeLoanRepo();
		h.plotLoanRepo();
		h.save();
		h.loan();

	}

}


interface WBrulues {
	
	public void loan();
	public void save();
	public void discount();
}

interface RBI {
	public void homeLoanRepo();
	public void plotLoanRepo();
}

class BOI implements WBrulues,RBI {

	@Override
	public void homeLoanRepo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void plotLoanRepo() {
		// TODO Auto-generated method stub
		System.out.println("BOI plotLoanRepo");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("BOI loan");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("BOI save");
	}

	@Override
	public void discount() {
		// TODO Auto-generated method stub
		System.out.println("BOI discount");
		
	}
	
	
	
}
