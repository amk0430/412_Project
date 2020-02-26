import java.util.ArrayList;

public class UserList {

    private ArrayList<User> userList;

    /**
     * This is the default constructor for UserList class
     */
    public UserList(){

    }

    /**
     * Verifies that username and password pair is in user list
     * @param unameInput Sets the username to current user
     * @param pwordInput Sets the password to current user
     * @return A boolean if username and password match a user in the list
     */
    public boolean verifyLogin(String unameInput, String pwordInput){
        for(User theUser : userList){
            if( (theUser.getUsername().equals(unameInput)) &&
                (theUser.getPassword().equals(pwordInput)) )
            {
                return true;
            }
        }
        return false;
    }

    /**
     * Confirms we can add user to user list - If no duplication, add new user.
     * @param newUser Used to compare if user is already in user list
     * @return A boolean if we added user to the list or not
     */
    public boolean addUser(User newUser){
        for(User theUser : userList){
            if(theUser.getUsername().equals(newUser.getUsername())){
                return false;
            }
        }
        userList.add(newUser);
        return true;
    }

    /**
     * Returns a user object based on username
     * @param uname Finds the user associated with this username
     * @return A user associated with the username
     */
    public User getUser(String uname){
        for(User currentUser : userList){
            if(currentUser.getUsername().equals(uname))
            {
                return currentUser;
            }
        }
        return null;
    }

}
