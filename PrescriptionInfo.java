package pkg412_alphacare;

public class PrescriptionInfo {
    private String patientName;
    private String date;
    private String prescriptionName;
    private String description;
    private String physicianName;


    public PrescriptionInfo(String[] prescriptionInfo)
    {
        patientName = prescriptionInfo[0];
        date = prescriptionInfo[1];
        prescriptionName = prescriptionInfo[2];
        description = prescriptionInfo[3];
        physicianName = prescriptionInfo[4];
    }

    public String getPatientName()
    {
        return patientName;
    }

    public String getDate()
    {
        return date;
    }

    public String getInfoName()
    {
        return prescriptionName;
    }

    public String getDescription()
    {
        return description;
    }

    public String getPhysicianName()
    {
        return physicianName;
    }

    @Override
    public String toString() {
        return "Prescription{" + "patientName=" + patientName + ", date=" + date + ", precriptionName=" + prescriptionName + ", description=" + description + ", physicianName=" + physicianName +'}';
    }
}
