/**
 *
 * @author Amber Kirk
 */
public class TestResultInfo {
    private String patientName;
    private String date;
    private String testName;
    private String result;
    private String physicianName;

    public TestResultInfo(String[] testResultInfo)
    {
        patientName = testResultInfo[0];
        date = testResultInfo[1];
        testName = testResultInfo[2];
        result = testResultInfo[3];
        physicianName = testResultInfo[4];
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDate() {
        return date;
    }

    public String getInfoName() {
        return testName;
    }

    public String getDescription() {
        return result;
    }

    public String getPhysicianName() {
        return physicianName;
    }

    @Override
    public String toString() {
        return "General Record{" + "patientName=" + patientName + ", date=" + date + ", testName=" + testName + ", description=" + result + ", physicianName=" + physicianName +'}';
    }
}
