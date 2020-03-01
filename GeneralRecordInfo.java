package pkg412_alphacare;

public class GeneralRecordInfo {
    private String patientName;
    private String date;
    private String recordName;
    private String description;
    private String physicianName;

    public GeneralRecordInfo(String[] generalRecordInfo)
    {
        patientName = generalRecordInfo[0];
        date = generalRecordInfo[1];
        recordName = generalRecordInfo[2];
        description = generalRecordInfo[3];
        physicianName = generalRecordInfo[4];
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDate() {
        return date;
    }

    public String getInfoName() {
        return recordName;
    }

    public String getDescription() {
        return description;
    }

    public String getPhysicianName() {
        return physicianName;
    }

    @Override
    public String toString() {
        return "General Record{" + "patientName=" + patientName + ", date=" + date + ", recordName=" + recordName + ", description=" + description + ", physicianName=" + physicianName +'}';
    }
}
