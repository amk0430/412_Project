package pkg412_alphacare;

public class Physician {

    private long physicianID;
    private String title;
    private String specialty;

    /**
     * This is the default constructor for Physician class
     */
    public Physician(){

    }

    /**
     * This is the constructor to create a new physician
     * @param physID Sets the physician's ID
     * @param pTitle Sets the physician's title
     * @param pSpecialty Sets the physician's specialty
     */
    public Physician(long physID, String pTitle, String pSpecialty){
        this.physicianID = physID;
        this.title       = pTitle;
        this.specialty   = pSpecialty;
    }

    /**
     * Returns the current physician's ID
     * @return A long that represents the physician's ID
     */
    public long getPhysicianID() {
        return physicianID;
    }

    /**
     * Sets the current physician's ID to new number
     * @param changePhysID Sets the physician's ID
     */
    public void setPhysicianID(long changePhysID) {
        this.physicianID = changePhysID;
    }

    /**
     * Returns the current physician's title
     * @return A string that represents the physician's title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the current physician's title to new title
     * @param changeTitle Sets the physician's title
     */
    public void setTitle(String changeTitle) {
        this.title = changeTitle;
    }

    /**
     * Returns the current physician's specialty
     * @return the specialty
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * Sets the current physician's specialty to new specialty
     * @param changeSpecialty Sets the physician's specialty
     */
    public void setSpecialty(String changeSpecialty) {
        this.specialty = changeSpecialty;
    }
}
