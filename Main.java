import javax.swing.JOptionPane;

/**
 *
 * @author Taylor
 */
public class M02A03PT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            MessageGUI frame=new MessageGUI();
            frame.setVisible(true);
        }
        catch(Exception e)
            {JOptionPane.showMessageDialog(null, e.getMessage());}
    }
    }
