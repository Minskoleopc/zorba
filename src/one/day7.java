package one;

public class day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// switch without break
		
		int day = 3;
		
//		switch(day) {
//			case 1:
//				System.out.println("Sunday");
//			case 2:
//				System.out.println("Monday");
//			case 3:
//				System.out.println("Tuesday");
//			case 4:
//				System.out.println("Wednesday");
//			case 5:
//				System.out.println("Thursday");
//			case 6:
//				System.out.println("Friday");
//			case 7:
//				System.out.println("Saturday");
//			default:
//				System.out.println("please input correct day");
//			
// 		}
	
		
	// with break statement	
		
	
		switch(day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("please input correct day");
		
		}
		
//		String city = "indore";
//		
//		switch(city) {
//			case "pune":
//				System.out.println("MH");
//				break;
//			case "indore":
//				System.out.println("MP");
//				break;
//			case "banglore":
//				System.out.println("Karnataka");
//				break;
//			default:
//				System.out.println("Incorrect city name");
//				
//			
//		}
		
		
		// 8pm IST sat sun
		
		String city = "pune";
		
		switch(city) {
			case "pune":
			case "mumbai":
				System.out.println("Texas");
				break;
			case "indore":
			case "bhopal":
				System.out.println("MP");
				break;
			case "banglore":
			case "manglore":
				System.out.println("Karnataka");
				break;
			default:
				System.out.println("Incorrect city name");
				
		}
		
		
	
	}

}
