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


}
