
import javax.swing.JOptionPane;

public class Main
{
      public static void main(String[] args)
      {
       //Medical Records
       MedicalRecordsCntl medicalRecordcntl = new  MedicalRecordsCntl();

       MedicalRecordsList prescriptionList = new MedicalRecordsList();
       MedicalRecordsList generalRecordList = new MedicalRecordsList();
       MedicalRecordsList immunizationList = new MedicalRecordsList();
       MedicalRecordsList testResultList = new MedicalRecordsList();

       System.out.println("Prescriptions" + prescriptionList.getPrescriptionfromList());
       System.out.println("General Records" + generalRecordList.getGeneralRecordsfromList());
       System.out.println("Immunizations" + immunizationList.getImmunizationsfromList());
       System.out.println("Test Results" + testResultList.getTestResultsfromList());

       //Appointments
       AppointmentCntl appointmentcntl = new  AppointmentCntl();
       AppointmentList appointmentList = new AppointmentList();
       System.out.println("Appointments" + appointmentList.getAppointmentfromList());

       //Message
        try {
            MessageGUI frame=new MessageGUI();
            frame.setVisible(true);
        }
        catch(Exception e)
            {JOptionPane.showMessageDialog(null, e.getMessage());}

       }

}
