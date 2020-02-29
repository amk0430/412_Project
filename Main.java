import javax.swing.JOptionPane;

/**
 * @author Amber
 * @author Taylor
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MedicalRecordsCntl medicalRecordcntl = new  MedicalRecordsCntl();
          
       MedicalRecordsList prescriptionList = new MedicalRecordsList();
       MedicalRecordsList generalRecordList = new MedicalRecordsList();
       MedicalRecordsList immunizationList = new MedicalRecordsList();
       MedicalRecordsList testResultList = new MedicalRecordsList();

       System.out.println("Prescriptions" + prescriptionList.getPrescriptionfromList());
       System.out.println("General Records" + generalRecordList.getGeneralRecordsfromList());
       System.out.println("Immunizations" + immunizationList.getImmunizationsfromList());
       System.out.println("Test Results" + testResultList.getTestResultsfromList());

        try {
            MessageGUI frame=new MessageGUI();
            frame.setVisible(true);
        }
        catch(Exception e)
            {JOptionPane.showMessageDialog(null, e.getMessage());}



    }
  }
