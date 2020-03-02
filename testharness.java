
package pkg412_alphacare;

import pkg412_alphacare.test.Patient;
import pkg412_alphacare.test.Physician;
import pkg412_alphacare.test.MedicalRecordsList;
import pkg412_alphacare.test.LoginCntl;
import pkg412_alphacare.test.PrescriptionInfo;
import pkg412_alphacare.test.TestResultInfo;
import pkg412_alphacare.test.ImmunizationInfo;
import pkg412_alphacare.test.GeneralRecordInfo;
import pkg412_alphacare.test.UserList;
import pkg412_alphacare.test.User;

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
        LoginCntl logincntl = new LoginCntl();
        String testPassword = "123";
        // testUsername and testPassword were added to user priviously.
        
        if (logincntl.verifyLogin(testUsername, testPassword) != true) {
            System.out.println("Error. User should be authticated.");
        }
        
        User theUser = new User();
        String usernameInput = "";
        String passwordInput = "";
        // usernameInput and passwordInput are user inputs.
        
        if (!(theUser.getUsername().equals(usernameInput)) && (theUser.getPassword().equals(testPassword))) {
            if (logincntl.verifyLogin(usernameInput, passwordInput) == true) {
                System.out.println("Error. User should not be authenticated.");
            }
        }
        
        else {
            System.out.println("Login test successful.");
        }
        
        /**
         * Test if the data format is correct in
         * PrescriptionInfo
         * GeneralRecordInfo
         * ImmunizationInfo
         * TestResultInfo
         * classes.
         */
        PrescriptionInfo prescriptioninfo = new PrescriptionInfo();
        if (prescriptioninfo.toString().matches(
"Prescription{" + "patientName=" + prescriptioninfo.getPatientName() + ", date=" + prescriptioninfo.getDate() + ", precriptionName=" + prescriptioninfo.getInfoName()
+ ", description=" + prescriptioninfo.getDescription() + ", physicianName=" + prescriptioninfo.getPhysicianName() +'}')) {
            System.out.println("Data format correct.");
        }
        else {
            System.out.println("Data format not correct.");
        }
        
        GeneralRecordInfo generalrecordinfo = new GeneralRecordInfo();
        if (generalrecordinfo.toString().matches(
"General Record{" + "patientName=" + generalrecordinfo.getPatientName() + ", date=" + generalrecordinfo.getDate() + ", recordName=" + generalrecordinfo.getInfoName()
+ ", description=" + generalrecordinfo.getDescription() + ", physicianName=" + generalrecordinfo.getPhysicianName() +'}')) {
            System.out.println("Data format correct.");
        }
        else {
            System.out.println("Data format not correct.");
        }
        
        ImmunizationInfo immunizationinfo = new ImmunizationInfo();
        if (immunizationinfo.toString().matches(
"Immunization{" + "patientName=" + immunizationinfo.getPatientName() + ", date=" + immunizationinfo.getDate() + ", immunizationName=" + immunizationinfo.getInfoName()
        + ", description=" + immunizationinfo.getDescription() + ", physicianName=" + immunizationinfo.getPhysicianName() +'}')) {
            System.out.println("Data format correct.");
        }
        else {
            System.out.println("Data format not correct.");
        }
        
        TestResultInfo testresultinfo = new TestResultInfo();
        if (testresultinfo.toString().matches(
"General Record{" + "patientName=" + testresultinfo.getPatientName() + ", date=" + testresultinfo.getDate() + ", testName=" + testresultinfo.getInfoName()
        + ", description=" + testresultinfo.getDescription() + ", physicianName=" + testresultinfo.getPhysicianName() +'}')) {
            System.out.println("Data format correct.");
        }
        else {
            System.out.println("Data format not correct.");
        }
        
        /**
         * Test if default data can be added and retrieved
         * and check their values in MedicalRecordsList class.
         */
        MedicalRecordsList medicalrecordslist = new MedicalRecordsList();
        medicalrecordslist.addPrescriptionToList();
        if (medicalrecordslist.getPrescriptionfromList().toString().matches(
"[Prescription{patientName=Jane Doe, date=May 2, precriptionName=Pepcid, description=For an upset stomach, physicianName=Dr. Smith}]")) {
            System.out.println("Correct data.");
        }
        else {
            System.out.println("Incorrect data.");
        }
        
        medicalrecordslist.addGeneralRecordToList();
        if (medicalrecordslist.getGeneralRecordsfromList().toString().matches(
"[General Record{patientName=Jane Doe, date=May 2, recordName=Appointment, description=Appointment Summary for May 2: ..., physicianName=Dr.Smith}]")) {
            System.out.println("Correct data.");
        }
        else {
            System.out.println("Incorrect data.");
        }
        
        medicalrecordslist.addImmunizationsToList();
        if(medicalrecordslist.getImmunizationsfromList().toString().matches(
"[Immunization{patientName=Jane Doe, date=May 2, immunizationName=Flu Shot, description=Influenza, physicianName=Dr. Smith}]")) {
            System.out.println("Correct data.");
        }
        else {
            System.out.println("Incorrect data.");
        }
        
        medicalrecordslist.addTestResultsToList();
        if (medicalrecordslist.getTestResultsfromList().toString().matches(
"[General Record{patientName=Jane Doe, date=May 2, testName=XRAY ABDOMEN, description=No significant bone lesions are seen, physicianName=Dr. Smith}]")) {
            System.out.println("Correct data.");
        }
        else {
            System.out.println("Incorrect data.");
        }
        
        /**
         * Test functionality of
         * Physician
         * Patient
         * Profile
         * classes.
         */
        Physician physician = new Physician();
        physician.setPhysicianID(123456);
        physician.setTitle("testtitle");
        physician.setSpecialty("testspeciality");
        
        if (physician.getPhysicianID() == 123456) {
            System.out.println("Test successful.");
        }
        else {
            System.out.println("Error in Physician class.");
        }
        
        if ("testtitle".equals(physician.getTitle())) {
            System.out.println("Test successful.");
        }
        else {
            System.out.println("Error in Physician class.");
        }
        
        if ("testspeciality".equals(physician.getSpecialty())) {
            System.out.println("Test successful.");
        }
        else {
            System.out.println("Error in Physician class.");
        }
        
        Patient patient = new Patient();
        patient.setPatientID(123456);
        patient.setPatientPhysician("testpatientphysician");
        patient.setMedRecords(medicalrecordslist);  // Default data in MedicalRecordsList.
        
        if (patient.getPatientID() == 123456) {
            System.out.println("Test successful.");
        }
        else {
            System.out.println("Error in Patient class.");
        }
        
        if ("testpatientphysician".equals(patient.getPatientPhysician())) {
            System.out.println("Test successful.");
        }
        else {
            System.out.println("Error in Patient class.");
        }
        
        if (medicalrecordslist.equals(patient.getMedRecords())) {
            System.out.println("Test successful.");
        }
        else {
            System.out.println("Error in Patient class.");
        }
        
        
    }
    
}
