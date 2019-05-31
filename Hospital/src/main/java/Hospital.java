import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {

	 private ArrayList<Patient> patients = new ArrayList<Patient>();
	 
		public String input() {
			Scanner s = new Scanner(System.in);
			String input = s.nextLine();
			return input;
		}
		
		public void addPatient(Patient p) {	
			patients.add(p);
		}
		

		public Patient getPatientById(int id) {
			
			for(Patient patient : patients) {
				if(patient.getPId() == id) {
				
					return patient;
				}
			}
			return null;
		}
		
		public String getTreatmentPlan(Patient p1) {
			 String medicine = p1.getMedicine();		
			 int dosage = p1.getDosage();
			 System.out.println(medicine + dosage);
			 return medicine + dosage;
		}
		
	
}
