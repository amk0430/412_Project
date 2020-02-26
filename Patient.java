
public class Patient {

    private long patientID;
    private String patientPhysician;
    private MedicalRecords medRecords;

    /**
     * This is the default constructor for Patient class
     */
    public Patient(){

    }

    /**
     * This is the constructor to create a new patient
     * @param pID Sets the patient's ID
     * @param pPhysician Sets the patient's physician
     * @param theRecords Sets the patient's medical records
     */
    public Patient(long pID, String pPhysician, MedicalRecords theRecords){
        this.patientID        = pID;
        this.patientPhysician = pPhysician;
        this.medRecords       = theRecords;
    }

    /**
     * Returns the current patient's ID
     * @return A long that represents the patient ID
     */
    public long getPatientID() {
        return patientID;
    }

    /**
     * Sets the current patient's ID
     * @param changePID Sets the current patient's ID to new number
     */
    public void setPatientID(long changePID) {
        this.patientID = changePID;
    }

    /**
     * Returns the current patient's physician
     * @return A string that represents the patient physician
     */
    public String getPatientPhysician() {
        return patientPhysician;
    }

    /**
     * Sets the current patient's physician
     * @param changePhysician Sets the current patient's physician to new physician
     */
    public void setPatientPhysician(String changePhysician) {
        this.patientPhysician = changePhysician;
    }

    /**
     * Returns the current patient's medical records
     * @return A medical record object that represents the patient's medical records
     */
    public MedicalRecords getMedRecords() {
        return medRecords;
    }

    /**
     * Sets attributes of the current patient's medical records
     * @param changeRecords Sets medical record attributes for current patient
     */
    public void setMedRecords(MedicalRecords changeRecords) {
        this.medRecords = changeRecords;
    }

}
