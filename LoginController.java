package pkg412_alphacare;

import java.util.ArrayList;

public class LoginCntl {

    private ArrayList<User> userList;

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

}
