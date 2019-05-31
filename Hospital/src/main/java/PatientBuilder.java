
public class PatientBuilder {
private int patientId;
private String patientName;

public Patient createPatient() {
	return new Patient(patientId, patientName);
}

public PatientBuilder setPId(int value) {
	this.patientId = value;
	return this;
}

public PatientBuilder setPName(String patientName) {
	this.patientName = patientName;
	return this;
}
}
