import java.util.ArrayList;
/**
 *
 * @author Amber Kirk
 */
public class MedicalRecordsList {

    private ArrayList<PrescriptionInfo> prescriptionList;
    private ArrayList<GeneralRecordInfo> generalRecordList;
    private ArrayList<ImmunizationInfo> immunizationList;
    private ArrayList<TestResultInfo> testResultList;

    public MedicalRecordsList(){
        prescriptionList = new ArrayList();
        generalRecordList = new ArrayList();
        immunizationList = new ArrayList();
        testResultList = new ArrayList();
        addPrescriptionToList();
        addGeneralRecordToList();
        addImmunizationsToList();
        addTestResultsToList();

    }

    //Prescription
    public void addPrescriptionToList()
    {
        getPrescriptionfromList().add(new PrescriptionInfo(new String[] {"Jane Doe", "May 2", "Pepcid", "For an upset stomach", "Dr. Smith"}));
    }

    public ArrayList<PrescriptionInfo> getPrescriptionfromList()
    {
        return prescriptionList;
    }

    //General Record
    public void addGeneralRecordToList()
    {
         getGeneralRecordsfromList().add(new GeneralRecordInfo(new String[] {"Jane Doe", "May 2", "Appointment", "Appointment Summary for May 2: ...", "Dr.Smith"}));

    }

    public ArrayList<GeneralRecordInfo> getGeneralRecordsfromList()
    {
        return generalRecordList;
    }

    //Immunization
    public void addImmunizationsToList()
    {
        getImmunizationsfromList().add(new ImmunizationInfo(new String[] {"Jane Doe", "May 2", "Flu Shot", "Influenza","Dr. Smith"}));
    }

    public ArrayList<ImmunizationInfo> getImmunizationsfromList()
    {
        return immunizationList;
    }

    //Test Results
    public void addTestResultsToList()
    {
       getTestResultsfromList().add(new TestResultInfo(new String[] {"Jane Doe", "May 2", "XRAY ABDOMEN", "No significant bone lesions are seen", "Dr. Smith"}));
    }

    public ArrayList<TestResultInfo> getTestResultsfromList()
    {
        return testResultList;
    }
}
