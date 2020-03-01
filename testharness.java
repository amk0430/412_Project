
package pkg412_alphacare;

public class testharness {
    
    UserList userData = new UserList();
    
    public void test() {
        
        /**
         * Test if we can add user to user list.
         */
        userData.addUser(new User("123", "123"));
        
        /**
         * Test if we can return a user object based on username.
         */
        String testUsername = "123";
        
        if ("123".equals(userData.getUser(testUsername).getUsername())) {
            System.out.println("There is a user with username of " + testUsername);
        }
        
        else {
            System.out.println("Error. No matching user with username.");
        }
        
        /**
         * Test Login function.
         */
        
        /**
         * Test if the data format is correct in
         * PrescriptionInfo
         * GeneralRecordInfo
         * ImmunizationInfo
         * TestResultInfo
         * classes.
         */
        PrescriptionInfo prescriptioninfo = new PrescriptionInfo();
        if (prescriptioninfo.toString() != null) {
            System.out.println("Data format correct.");
        }
        else {
            System.out.println("Error. No default data format.");
        }
        GeneralRecordInfo generalrecordinfo = new GeneralRecordInfo();
        if (generalrecordinfo.toString() != null) {
            System.out.println("Data format correct.");
        }
        else {
            System.out.println("Error. No default data format.");
        }
        ImmunizationInfo immunizationinfo = new ImmunizationInfo();
        if (immunizationinfo.toString() != null) {
            System.out.println("Data format correct.");
        }
        else {
            System.out.println("Error. No default data format.");
        }
        TestResultInfo testresultinfo = new TestResultInfo();
        if (testresultinfo.toString() != null) {
            System.out.println("Data format correct.");
        }
        else {
            System.out.println("Error. No default data format.");
        }
        
        /**
         * Then test if the MedicalRecordsList object in MedicalRecordsList class
         * can add data from above classes to itself.
         */
        MedicalRecordsList medicalrecordslist = new MedicalRecordsList();
        medicalrecordslist.addPrescriptionToList();
        medicalrecordslist.addGeneralRecordToList();
        medicalrecordslist.addImmunizationsToList();
        medicalrecordslist.addTestResultsToList();
        
        /**
         * 
         */
    }
    
}
