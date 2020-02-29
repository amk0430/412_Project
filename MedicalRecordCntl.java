/**
 *
 * @author Amber Kirk
 */
 
public class MedicalRecordsCntl {

    private final MedicalRecordsList prescriptionList;
    private final MedicalRecordsList generalRecordList;
    private final MedicalRecordsList immunizationList;
    private final MedicalRecordsList testResultList;
    private final MedicalRecordUI medicalRecordUI;
    private final int startIndex = 0;



    //Constructor for the MedicalRecordsList class
    public MedicalRecordsCntl() {
        prescriptionList = new MedicalRecordsList();
        generalRecordList = new MedicalRecordsList();
        immunizationList = new MedicalRecordsList();
        testResultList = new MedicalRecordsList();
        medicalRecordUI = new MedicalRecordUI(this, startIndex);
        medicalRecordUI.setVisible(true);
    }


    public MedicalRecordsList getPrescriptionList()
    {
       return prescriptionList;
    }

    public PrescriptionInfo getPrescription(int index)
    {
        return prescriptionList.getPrescriptionfromList().get(index);
    }

    public MedicalRecordsList getGeneralRecordList()
    {
       return generalRecordList;
    }

    public GeneralRecordInfo getGeneralRecord(int index)
    {
        return generalRecordList.getGeneralRecordsfromList().get(index);
    }

    public MedicalRecordsList getImmunizationList()
    {
       return immunizationList;
    }

    public ImmunizationInfo getImmunization(int index)
    {
        return immunizationList.getImmunizationsfromList().get(index);
    }

    public MedicalRecordsList getTestResultList()
    {
       return testResultList;
    }

    public TestResultInfo getTestResult(int index)
    {
        return testResultList.getTestResultsfromList().get(index);
    }
}
