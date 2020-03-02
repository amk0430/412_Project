package pkg412_alphacare;

import java.util.ArrayList;

public class UserList {

    private ArrayList<User> userList = new ArrayList<User>();
    
    /**
     * This is the default constructor for UserList class
     */
    public UserList(){

    }

    /**
     * Confirms we can add user to user list - If no duplication, add new user.
     * @param newUser Used to compare if user is already in user list
     * @return A boolean if we added user to the list or not
     */
    public ArrayList<User> addUser(User newUser){
        for(User theUser : getUserList()){
            if(theUser.getUsername().equals(newUser.getUsername())){
                return getUserList();
            }
            else {
                getUserList().add(newUser);
            }
        }
        getUserList().add(newUser);
        return getUserList();
    }
    
    /**
     * Returns a user object based on username
     * @param uname Finds the user associated with this username
     * @return A user associated with the username
     */
    public User getUser(String uname){
        for(User currentUser : getUserList()){
            if(currentUser.getUsername().equals(uname))
            {
                return currentUser;
            }
        }
        return null;
    }

    /**
     * @return the userList
     */
    public ArrayList<User> getUserList() {
        return userList;
    }

    /**
     * @param userList the userList to set
     */
    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
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
