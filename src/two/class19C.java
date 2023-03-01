package two;

public class class19C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBIk nn = new SBIk("India","pune");
		System.out.println(nn.city);
		System.out.println(nn.country);
		
		nn.discount();
		nn.loan();
		nn.save();
		nn.repoRate();
		nn.ROI();
		nn.displayCountry();
		
	}

}

interface WorldBanlRule2 {
		
	public void save();
	public void loan();
	public void discount();
	
	
}

interface RBIrules2 {
	
	public void repoRate();
	public void ROI();
}

class SBIm  {
	String city ;
	String country ;
	
	public SBIm(String city , String country) {
		this.city = city;
		this.country = country;
	}
	
	public void displayCountry() {
		System.out.println(this.country);
	}
	
	
	
}

class SBIk extends SBIm  implements  RBIrules2 ,WorldBanlRule2{

	public SBIk(String city, String country) {
		super(city, country);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("SBIk save");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("SBIk loan");
		
	}

	@Override
	public void discount() {
		// TODO Auto-generated method stub
		System.out.println("SBIk discount");
	}

	@Override
	public void repoRate() {
		// TODO Auto-generated method stub
		System.out.println("SBIk discount");
	}

	@Override
	public void ROI() {
		// TODO Auto-generated method stub
		System.out.println("ROI discount");
	}
	
	
}






