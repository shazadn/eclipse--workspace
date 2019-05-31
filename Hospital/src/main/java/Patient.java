
public class Patient extends TreatmentPlan {
 private int patientId;
 private String patientName;
 
 public Patient(int patientId, String patientName, String medicine, int dosage) {
	 super(medicine, dosage);
	 this.patientId = patientId;
	 this.patientName = patientName;
 }
 
 public Patient(int patientId, String patientName) {
	 this(patientId, patientName, null, 0);
 }
 
 public int getPId() {
	 return patientId;
 }
 public String getPName() {
	 return patientName;
 }
}
