
public class ProfileCntl {

  private User currentUser = "";

  public ProfileCntl(){

  }

  public void setProfileDetails(String firstName, String lastName, String email){
    this.currentUser.getProfile().setFirstName(firstName);
    this.currentUser.getProfile().setLastName(lastName);
    this.currentUser.getProfile().setEmail(email);
  }
}
