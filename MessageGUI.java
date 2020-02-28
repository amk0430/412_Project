import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Taylor
 */
public class MessageGUI extends JFrame{

    JFrame f = new JFrame("New");
    JPanel panel = new JPanel();
    JButton send = new JButton("SEND");
    JTextArea typeHere = new JTextArea("Type message here");
    JTextArea conversation = new JTextArea("Conversation will appear here");
    Font font1 = new Font("SansSerif",Font.BOLD, 20);

    public MessageGUI() {

    super("Messages");
        setSize(450,800);
        setLocation(500,100);
        panel.setLayout (null);
        getContentPane().add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setVisible(true);

        panel.add(send);
        panel.add(typeHere);
        panel.add(conversation);

        conversation.setBounds(15, 10, 400, 600);
        typeHere.setBounds(15, 650, 300, 50);
        send.setBounds(325, 650, 70, 50);

        typeHere.setFont(font1);
        conversation.setFont(font1);

}

}
