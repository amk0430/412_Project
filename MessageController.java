import javax.swing.JOptionPane;

/**
 *
 * @author Taylor
 */
public class MessageController {

    private boolean medicalPersonnel;
    private boolean patient;
    private String chat;
    private String previousConversations;
    private String status;
    private boolean online;
    private boolean offline;

    //Constructor for the Message class
    public MessageController(boolean a, boolean b, String c, String d, String e, boolean f, boolean g){
        medicalPersonnel = a;
        patient = b;
        chat = c;
        previousConversations = d;
        status = e;
        online = f;
        offline = g;
    }

    //returns a medical personnel to chat with the user
    public boolean getMedicalPersonnel(){
        if(online){
            try{
                getMedicalPersonnel();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "No current medical personnel to message");
            }
        }
        return medicalPersonnel;
    }

    //returns a patient to chat with the user
    public boolean getPatient(){
        if(online){
            try{
                getPatient();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "No current patients to message");
            }
        }
        return patient;
    }

    //shows chat window
    public String getChat(){
        if(online){
            try{
                getChat();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Not Online");
            }
        }
        return chat;
    }

    //shows previous conversations
    public String getPreviousConversation(){
        if (medicalPersonnel){
            getPreviousConversation();
        }
        else {
            getPatient();
        }
        return previousConversations;
    }

    //shows status of user
    public String getStatus(){
        if (online){
            getChat();
        }
        else {
            getStatus();
        }
        return status;
    }
}
