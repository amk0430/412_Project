
import java.util.ArrayList;

/**
 *
 * @author Amber Kirk
 */
public class AppointmentList {
    private ArrayList<AppointmentInfo> appointmentList;

    public AppointmentList()
    {
        appointmentList = new ArrayList();
        addAppointmentToList();
    }

    public void addAppointmentToList()
    {
        getAppointmentfromList().add(new AppointmentInfo(new String[] {"May 3", "12:00pm - 1:00pm", "Dr. Smith"}));
    }

    public ArrayList<AppointmentInfo> getAppointmentfromList()
    {
        return appointmentList;
    }
}
