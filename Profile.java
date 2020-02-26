
public class Profile {

    private String firstName;
    private String lastName;
    private String email;

    /**
     * This is the default constructor for the Profile class
     */
    public Profile(){

    }

    /**
     * This is the constructor for new Profile object for user
     * @param fName Sets the first name for profile
     * @param lName Sets the last name for profile
     * @param mail Sets the email for profile
     */
    public Profile(String fName, String lName, String mail){
        this.firstName = fName;
        this.lastName  = lName;
        this.email     = mail;
    }

    /**
     * Returns the first name of current user
     * @return A string representing the profile first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of current user
     * @param changeFirstName Sets the first name of the profile
     */
    public void setFirstName(String changeFirstName) {
        this.firstName = changeFirstName;
    }

    /**
     * Returns the last name of current user
     * @return A string representing the profile last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of current user
     * @param changeLastName Sets the last name of the profile
     */
    public void setLastName(String changeLastName) {
        this.lastName = changeLastName;
    }

    /**
     * Returns the email of current user
     * @return A string representing the profile email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of current user
     * @param changeEmail Sets the email for the profile
     */
    public void setEmail(String changeEmail) {
        this.email = changeEmail;
    }

}
