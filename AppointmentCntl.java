/**
 *
 * @author Amber Kirk
 */
public class AppointmentCntl {
     private final AppointmentList appointmentList;
     private final AppointmentGUI appointmentGUI;
     private final int startIndex = 0;

    public AppointmentCntl()
    {
        appointmentList = new AppointmentList();
        appointmentGUI = new AppointmentGUI(this, startIndex);
        appointmentGUI.setVisible(true);
    }

    public AppointmentList getAppointmentList()
    {
       return appointmentList;
    }

    public AppointmentInfo getAppointment(int index)
    {
        return appointmentList.getAppointmentfromList().get(index);
    }

    public void addNewAppointment() {
        String[] newAppointment = {"May 5", "12:00pm-1:00pm", "Dr.John"};
        appointmentList.getAppointmentfromList().add(new AppointmentInfo(newAppointment));
    }


    public void updateAppointment(String newDate, String newAppointment, String newPhysician, int startIndex)
    {
        AppointmentInfo appointement = appointmentList.getAppointmentfromList().get(startIndex);
        appointement.setDate(newDate);
        appointement.setAppointmentTime(newAppointment);
        appointement.setPhysician(newPhysician);
    }
             
}
