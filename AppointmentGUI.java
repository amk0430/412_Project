
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Amber Kirk
 */
public class AppointmentGUI extends JFrame {
    private final AppointmentCntl appointmentCntl;

    private final JTextField appointmentSearch = new JTextField();
    private final JTextField appointmentInfo = new JTextField();

    private int recordIndex;

    private JPanel selectorPanel;
    private JPanel buttonPanel;

    public AppointmentGUI(AppointmentCntl appointmentCntl, int startIndex)
    {
        this.appointmentCntl = appointmentCntl;
        recordIndex = startIndex;
        display();
        setFieldView();
    }

    private void display()
    {
        setTitle("View Appointments");
        setSize(1000, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        selectorPanel = new JPanel(new GridLayout(5, 5));

        selectorPanel.add(new JLabel("Appointments"));
        selectorPanel.add(appointmentSearch);

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));


        JButton appointmentButton = new JButton("Appointment");
        appointmentButton.addActionListener(event -> appointmentCntl.getAppointmentList());
        buttonPanel.add(appointmentButton);

        setContentPane(new JPanel(new BorderLayout()));
        getContentPane().add(selectorPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    private void setFieldView() {

        appointmentSearch.setText(appointmentCntl.getAppointmentList().toString());
        appointmentSearch.setText(appointmentCntl.getAppointment(recordIndex).toString());

    }

}
