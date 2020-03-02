package pkg412_alphacare;

import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MedicalRecordsCntl medicalrecordcntl = new  MedicalRecordsCntl();
          
       MedicalRecordsList prescriptionList = new MedicalRecordsList();
       MedicalRecordsList generalRecordList = new MedicalRecordsList();
       MedicalRecordsList immunizationList = new MedicalRecordsList();
       MedicalRecordsList testResultList = new MedicalRecordsList();

       System.out.println("Prescriptions" + prescriptionList.getPrescriptionfromList());
       System.out.println("General Records" + generalRecordList.getGeneralRecordsfromList());
       System.out.println("Immunizations" + immunizationList.getImmunizationsfromList());
       System.out.println("Test Results" + testResultList.getTestResultsfromList());
       
       /**
        * testharness class.
        */
       testharness test = new testharness();
       test.test();
       
        try {
            MessageGUI frame=new MessageGUI();
            frame.setVisible(true);
        }
        catch(Exception e)
            {JOptionPane.showMessageDialog(null, e.getMessage());}

    }
    
  }
