

public class ViewMedicalRecords()
{
    private long pID;
    private String precriptions;
    private String generalRecords;
    private String immunizations;
    private String testResults;

    /**
     * This is the default constructor for ViewMedicalRecords class
     */
  public ViewMedicalRecords()
  {

  }

  /**
   * returns the patient's id, so they can access their information
   * @return a long that represents the patient's ID
   */
  public long getPatientID()
  {
    return pID;
  }

  /**
   * returns the patient's precriptions, if the patient's info matches the ID
   * @return String that represents a list of the patient's precriptions
   */
  public MedicalRecords viewPrescriptions()
  {
    if (pID == pID)
       {
         //show prescriptions
       }
       else
       {
         //"Patient ID does not match, unauthorized access"
       }
        return precriptions;
  }

  /**
   * returns the patient's general records, if the patient's info matches the ID
   * @return String that represents a list of the patient's general medical records
   */
  public MedicalRecords viewGeneral()
  {
    if (pID == pID)
        {
          //show general records
        }
        else
        {
          //"Patient ID does not match, unauthorized access"
        }
         return generalRecords;
  }

  /**
   * returns the patient's immunizations, if the patient's info matches the ID
   * @return String that represents a list of the patient's immunizations
   */
  public MedicalRecords viewImmunizations()
  {
    if (pID == pID)
        {
          //show immunizations
        }
        else
        {
          //"Patient ID does not match, unauthorized access"
        }
         return immunizations;
  }

  /**
   * returns the patient's test results, if the patient's info matches the ID
   * @return String that represents a list of the patient's test results
   */
  public MedicalRecords viewTests()
  {
    if (pID == pID)
        {
          //show test results
        }
        else
        {
          //"Patient number does not match, unauthorized access"
        }
         return testResults;
  }
)
