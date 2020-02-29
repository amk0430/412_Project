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
 * @author Amber Krik
 */
public class MedicalRecordUI extends JFrame{


    private final MedicalRecordsCntl medicalRecordCntl;

    //Search
    private final JTextField prescriptionSearch = new JTextField();
    private final JTextField generalRecordSearch = new JTextField();
    private final JTextField immunizationSearch = new JTextField();
    private final JTextField testResultSearch = new JTextField();

    //Info
    private final JTextField precriptionInfo = new JTextField();
    private final JTextField generalRecordsInfo = new JTextField();
    private final JTextField immunizationInfo = new JTextField();
    private final JTextField testResultInfo = new JTextField();

    private int recordIndex;

    private JPanel selectorPanel;
    private JPanel buttonPanel;


    public MedicalRecordUI(MedicalRecordsCntl medicalRecordCntl, int startIndex)
    {
        this.medicalRecordCntl = medicalRecordCntl;
        recordIndex = startIndex;
        display();
        setFieldView();
    }

    private void display()
    {
        setTitle("View Medical Records");
        setSize(1000, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        selectorPanel = new JPanel(new GridLayout(5, 5));

        selectorPanel.add(new JLabel("Prescriptions"));
        selectorPanel.add(prescriptionSearch);

        selectorPanel.add(new JLabel("General Records"));
        selectorPanel.add(generalRecordSearch);

        selectorPanel.add(new JLabel("Immunizations"));
        selectorPanel.add(immunizationSearch);

        selectorPanel.add(new JLabel("Test Results"));
        selectorPanel.add(testResultSearch);

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));


        JButton prescriptionButton = new JButton("Prescriptions");
        prescriptionButton.addActionListener(event -> medicalRecordCntl.getPrescriptionList());
        buttonPanel.add(prescriptionButton);

        JButton generalRecordButton = new JButton("General Records");
        generalRecordButton.addActionListener(event -> medicalRecordCntl.getGeneralRecordList());
        buttonPanel.add(generalRecordButton);

        JButton immunizationButton = new JButton("Immunizations");
        immunizationButton.addActionListener(event -> medicalRecordCntl.getPrescriptionList());
        buttonPanel.add(immunizationButton);

        JButton testResultsButton = new JButton("Test Results");
        testResultsButton.addActionListener(event -> medicalRecordCntl.getTestResultList());
        buttonPanel.add(testResultsButton);

        setContentPane(new JPanel(new BorderLayout()));
        getContentPane().add(selectorPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    private void setFieldView() {
        prescriptionSearch.setText(medicalRecordCntl.getPrescriptionList().toString());
        generalRecordSearch.setText(medicalRecordCntl.getGeneralRecordList().toString());
        immunizationSearch.setText(medicalRecordCntl.getImmunizationList().toString());
        testResultSearch.setText(medicalRecordCntl.getTestResultList().toString());

        prescriptionSearch.setText(medicalRecordCntl.getPrescription(recordIndex).toString());
        generalRecordSearch.setText(medicalRecordCntl.getGeneralRecord(recordIndex).toString());
        immunizationSearch.setText(medicalRecordCntl.getImmunization(recordIndex).toString());
        testResultSearch.setText(medicalRecordCntl.getTestResult(recordIndex).toString());

    }

}
