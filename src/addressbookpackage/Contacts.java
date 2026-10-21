
package addressbookpackage;


public class Contacts {
    
    private String username, userSurname, userEmail, phoneNumber, physAddress;
    
    public Contacts(String username, String userSurname, String phoneNumber, String userEmail ,String physAddress) {
        this.username = username;
        this.userSurname = userSurname;
        this.phoneNumber = phoneNumber;
        this.userEmail = userEmail;
        this.physAddress = physAddress;
    }
    //Setting up Mutators
    
    //Getters
    public String getName() {  return username; }
    
    public String getSurname() {  return userSurname; }
    
    public String getPhone() { return phoneNumber; }

    public String getEmail() { return userEmail; }
    
    public String getAddress() {return physAddress;  }
    
    
    //Setters
    public void setName(String username) { this.username = username; }
    
    public void setSurname(String userSurname) { this.userSurname = userSurname; };
    
    public void setPhone(String phoneNumber) { this.phoneNumber = phoneNumber; }
    
    public void setEmail(String userEmail) { this.userEmail = userEmail; }
    
    public void getAddress(String physAddress) { this.physAddress = physAddress; }
    
    
}