/**
 *
 * @author Amber Kirk
 */
public class AppointmentInfo {
    private String date;
    private String appointmentTime;
    private String physician;

    public AppointmentInfo(String[] appointmentInfo)
    {
        date = appointmentInfo[0];
        appointmentTime = appointmentInfo[1];
        physician = appointmentInfo[2];
    }

    //Date
    public String getDate()
    {
        return date;
    }

    public void setDate(String newDate)
    {
        this.date = newDate;
    }

    //Appointment Time
    public String getAppointmentTime()
    {
        return appointmentTime;
    }

    public void setAppointmentTime(String newAppointment)
    {
        this.appointmentTime = newAppointment;
    }

    //Physician
    public String getPhysician()
    {
        return physician;
    }

    public void setPhysician(String newPhysician)
    {
        this.physician = newPhysician;
    }

    @Override
    public String toString() {
        return "AppointmentInfo{" + "date = " + date + ", appointmentTime = " + appointmentTime + ", physician = " + physician + '}';
    }
}
