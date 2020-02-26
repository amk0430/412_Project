
public class CreateProfileController {

    private UserList theUserList;

    /**
     * This is the default constructor for the CreateProfileController class
     */
    public CreateProfileController(){

    }

    /**
     * Creating new profile for user. First checking if we can add them, then adding to list.
     * Return boolean if new profile creation is successful
     * @param username Sets the username for new user's profile
     * @param password Sets the password for new user's profile
     * @return A boolean if new profile is created successfully or not
     */
    public boolean createNewProfile(String username, String password){
        User newUser = new User(username, password);
        boolean newUserSuccess = theUserList.addUser(newUser);

        return newUserSuccess;
    }

}
