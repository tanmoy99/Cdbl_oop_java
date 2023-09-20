package javafxapplication2;
import java.io.Serializable;
import javafx.beans.property.SimpleStringProperty;

public class UserDetails implements Serializable {

    private SimpleStringProperty firstName, lastName,email,address,number,occupation,gender,password,accountTyep;
    
    public UserDetails(String firstName, String lastName,String email,String password,String address,String number,String occupation,String gender, String accountTyep) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.email = new SimpleStringProperty(email);
        this.password = new SimpleStringProperty(password);
        this.address = new SimpleStringProperty(address);
        this.number = new SimpleStringProperty(number);
        this.occupation = new SimpleStringProperty(occupation);
        this.gender = new SimpleStringProperty(gender);
        this.accountTyep = new SimpleStringProperty(accountTyep);
        
    }
    public void setFirstName(String firstName) {
        this.firstName = new SimpleStringProperty(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = new SimpleStringProperty(lastName);
    }
    public void setEmail(String email) {
        this.email = new SimpleStringProperty(email);
    }
    public void setPassword(String password){
            this.password = new SimpleStringProperty(password);

    }
    public void setAddress(String address) {
        this.address = new SimpleStringProperty(address);
    }
    public void setNumber(String number) {
        this.number = new SimpleStringProperty(number);
    }
    public void setOccupation(String occupation) {
        this.occupation = new SimpleStringProperty(occupation);
    }
    public void setGender(String gender) {
        this.gender = new SimpleStringProperty(gender);
    }
    public void setAccountTyep(String accountTyep) {
        this.accountTyep = new SimpleStringProperty(accountTyep);
    }
    public String getFirstName() {
        //return firstName;
        return firstName.get();
    }

    public String getLastName() {
        return lastName.get();
    }
    public String getEmail() {
        return email.get();
    }
    public String getPassword(){
    return password.get();
    }
    public String getAddress(){
        return address.get();
    }
    public String getNumber() {
        return number.get();
    }
    public String getOccupation() {
        return occupation.get();
    }
    public String getGender() {
        return gender.get();
    }
    public String getAccountTyep() {
        return accountTyep.get();
    }
 
    
}
  