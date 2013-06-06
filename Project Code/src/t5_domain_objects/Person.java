package t5_domain_objects;

/**
 * Created with IntelliJ IDEA.
 * User: james
 * Date: 6/4/13
 * Time: 9:24 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Person {

    public String getFirstName();
    public void setFirstName(String firstName);

    public String getLastName();
    public void setLastName(String lastName);

    public String getMiddleName();
    public void setMiddleName(String middleName);

    public String getDateOfBirth();
    public void setDateOfBirth(String dateOfBirth);

    public String getSex();
    public void setSex(String sex);

    public String getSocialSecurity();
    public void setSocialSecurity(String socialSecurity);

    public String getEmailAddress();
    public void setEmailAddress(String emailAddress);

    public String getPassword();
    public void setPassword(String password);

    public String getUserName();
    public void setUserName(String userName);

    public String getHomePhone();
    public void setHomePhone(String homePhone);

    public String getMobilePhone();
    public void setMobilePhone(String mobilePhone);

    public int getType();
    public void setType(int type);

}
