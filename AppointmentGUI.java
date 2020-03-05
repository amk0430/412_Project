
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
    private int startIndex;
    private final AppointmentCntl appointmentCntl;

    private JTextField appointmentDateDisplay = new JTextField(115);
    private JTextField appointmentTimeDisplay = new JTextField(15);
    private JTextField appointmetPhysicianDisplay = new JTextField();

    private JPanel displayPanel;
    private JPanel buttonPanel;

    public AppointmentGUI(AppointmentCntl appointmentCntl, int recordIndex)
    {
        this.appointmentCntl = appointmentCntl;
        startIndex = recordIndex;
        display();
        setFieldView();
    }

    private void display()
    {
        setTitle("Appointment Viewer");
        setSize(1000, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayPanel = new JPanel(new GridLayout(5, 5));
        displayPanel.add(new JLabel("Date"));
        displayPanel.add(appointmentDateDisplay);
        displayPanel.add(new JLabel("Time"));
        displayPanel.add(appointmentTimeDisplay);
        displayPanel.add(new JLabel("Physician"));
        displayPanel.add(appointmetPhysicianDisplay);

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton nextButton = new JButton("Next");
        JButton newButton = new JButton("New");
        JButton previousButton = new JButton("Previous");
        JButton updateButton = new JButton("Update");
        JButton exitButton = new JButton("Exit");


        nextButton.addActionListener(event -> showNextAnimal());
        newButton.addActionListener(event -> appointmentCntl.addNewAppointment());
        previousButton.addActionListener(event -> showPreviousAppointment());
        updateButton.addActionListener(event -> updateAppointment());
        exitButton.addActionListener(event -> exitApp());

        buttonPanel.add(previousButton);
        buttonPanel.add(nextButton);
        buttonPanel.add(newButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(exitButton);

        setContentPane(new JPanel(new BorderLayout()));
        getContentPane().add(displayPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    private void showNextAnimal() {
        int listSize = appointmentCntl.getAppointmentList().getAppointmentfromList().size();
        startIndex++;

        if (listSize == startIndex)
        {
            startIndex = 0;
        }
        setFieldView();
    }

    private void showPreviousAppointment() {
        startIndex--;
        setFieldView();
    }

    private void setFieldView() {
        appointmentDateDisplay.setText(appointmentCntl.getAppointment(startIndex).getDate());
        appointmentTimeDisplay.setText(appointmentCntl.getAppointment(startIndex).getAppointmentTime());
        appointmetPhysicianDisplay.setText(appointmentCntl.getAppointment(startIndex).getPhysician());

    }

    private void refreshDisplay(int index) {
        startIndex = index--;
        setFieldView();
    }

    public void updateAppointment() {


        appointmentDateDisplay.getText();
        appointmentTimeDisplay.getText();
        appointmetPhysicianDisplay.getText();

        String newDate = appointmentDateDisplay.getText();
        String newAppointment = appointmentTimeDisplay.getText();
        String newPhysician = appointmetPhysicianDisplay.getText();


        appointmentCntl.updateAppointment(newDate, newAppointment, newPhysician, startIndex);

    }

    public void exitApp() {
        System.exit(0);
    }

}
