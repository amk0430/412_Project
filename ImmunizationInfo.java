/**
 *
 * @author Amber Kirk
 */
public class ImmunizationInfo {
    private String patientName;
    private String date;
    private String immunizationName;
    private String description;
    private String physicianName;

    public ImmunizationInfo(String[] immunizationInfo)
    {
        patientName = immunizationInfo[0];
        date = immunizationInfo[1];
        immunizationName = immunizationInfo[2];
        description = immunizationInfo[3];
        physicianName = immunizationInfo[4];
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDate() {
        return date;
    }

    public String getInfoName() {
        return immunizationName;
    }

    public String getDescription() {
        return description;
    }

    public String getPhysicianName() {
        return physicianName;
    }

    @Override
    public String toString() {
        return "Immunization{" + "patientName=" + patientName + ", date=" + date + ", immunizationName=" + immunizationName + ", description=" + description + ", physicianName=" + physicianName +'}';
    }
}
