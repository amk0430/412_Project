/**
 *
 * @author Amber Kirk
 */

public class MedicalRecordsCntl {

    private final MedicalRecordsList prescriptionList;
    private final MedicalRecordsList immunizationList;
    private final MedicalRecordsList testResultList;
    private final MedicalRecordUI medicalRecordUI;
    private final int startIndex = 0;



    //Constructor for the MedicalRecordsList class
    public MedicalRecordsCntl() {
        prescriptionList = new MedicalRecordsList();
        immunizationList = new MedicalRecordsList();
        testResultList = new MedicalRecordsList();
        medicalRecordUI = new MedicalRecordUI(this, startIndex);
        medicalRecordUI.setVisible(true);
    }

    //Prescription
    public MedicalRecordsList getPrescriptionList()
    {
       return prescriptionList;
    }

    public PrescriptionInfo getPrescription(int index)
    {
        return prescriptionList.getPrescriptionfromList().get(index);
    }

    //Immunization
    public MedicalRecordsList getImmunizationList()
    {
       return immunizationList;
    }

    public ImmunizationInfo getImmunization(int index)
    {
        return immunizationList.getImmunizationsfromList().get(index);
    }

    //Test Result
    public MedicalRecordsList getTestResultList()
    {
       return testResultList;
    }

    public TestResultInfo getTestResult(int index)
    {
        return testResultList.getTestResultsfromList().get(index);
    }
}
