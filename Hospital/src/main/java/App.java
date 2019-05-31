import java.util.ArrayList;

public class App {

	public static void main( String [] args) {

		Hospital hospital = new Hospital();
		String value = hospital.input();
		
		boolean contin = true;
		while(contin){
			System.out.println("1) Add patient");
			System.out.println("2) Add patient");
			System.out.println("3) Add patient");
//			System.out.println("4) Add patient");
//			System.out.println("5) Add patient");
			
			//Add patient
			if(value.equals("1")) {
				//String vId = value();
				PatientBuilder pb = new PatientBuilder();
//				System.out.println("Enter user id of patient");
//				pb.setPId(value);
//				
				System.out.println("Enter user name of patient");
				pb.setPName(value);
				//hospital.addPatient(patient);
			}
			
			
		}
	}
	 
	
}
