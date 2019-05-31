import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HospitalTest {

	@Test
	public void Patient() {
		Hospital hospital = new Hospital();
		//Check for patient with an ID of 5
		Patient name = hospital.getPatientById(5);
		//Returns null
		//System.out.println(name);
		//Add patient with an id of 5 and patient name of "Ben"
		Patient p = new Patient(5, "Ben");
		hospital.addPatient(p);
		
		
		assertEquals("Add patient error", "Ben", hospital.getPatientById(5).getPName());
	}
	
	
	public void TreatmentPlan() {
		Hospital hospital = new Hospital();
		assertEquals("Treatment plan error", "Paracetomol, 5", hospital.getPatientById(0));
		
	}
	 
	
	
	
	
	
	
	
	
	
	
}
