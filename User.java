package pkg412_alphacare;

public class User {

    private String username;
    private String password;
    private Profile profile;

    /**
     * This is the default constructor for User class
     */
    public User(){

    }

    /**
     * This is the constructor for new User object.
     * Creates new profile for each new user
     * @param uname Sets the new user's username
     * @param pword Sets the new user's password
     */
    public User(String uname, String pword){
        this.username = uname;
        this.password = pword;
        this.profile  = new Profile();
    }

    /**
     * Returns the username of current user
     * @return A string representing the current username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username of current user
     * @param changeUsername Sets the current user username to a new username
     */
    public void setUsername(String changeUsername) {
        this.username = changeUsername;
    }

    /**
     * Returns the password of current user
     * @return A string representing the current password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password of current user
     * @param changePassword Sets the current user password to new password
     */
    public void setPassword(String changePassword) {
        this.password = changePassword;
    }

    /**
     * Returns the profile object for current user
     * @return A profile for the current user
     */
    public Profile getProfile() {
        return profile;
    }

    /**
     * Sets the profile object for current user
     * @param changeProfile Sets the current user profile to new profile attributes
     */
    public void setProfile(Profile changeProfile) {
        this.profile = changeProfile;
    }

}
