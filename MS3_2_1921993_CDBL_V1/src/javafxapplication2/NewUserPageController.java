
package javafxapplication2;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


public class NewUserPageController implements Initializable {

    @FXML
    private TextField EmailAddressFld;
    @FXML
    private TextField MobleNumberFld;
    @FXML
    private TextField OccupationFld;
    @FXML
    private TextField GenderFld;
    @FXML
    private BorderPane HomePageNewUser;
    @FXML
    private AnchorPane HomePage;
    @FXML
    private TextField FirstNameFid;
    @FXML
    private TextField LastNameFid;

    private ArrayList<UserDetails> userArray = new ArrayList<UserDetails>();
    @FXML
    private TextField AddressFid1;
    @FXML
    private ChoiceBox<String> AccountTyepChoiceBox;
    private String [] accountTyep ={"Personal BO Account","Company Representative"};
    @FXML
    private TextField PasswordFId;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        AccountTyepChoiceBox.getItems().addAll(accountTyep);
    }   

    @FXML
    private void SubmitButton(ActionEvent event) throws IOException {
 
    if(EmailAddressFld.getText().isEmpty()|| AddressFid1.getText().isEmpty() || MobleNumberFld.getText().isEmpty()||OccupationFld.getText().isEmpty()||GenderFld.getText().isEmpty()||FirstNameFid.getText().isEmpty()||LastNameFid.getText().isEmpty()|| PasswordFId.getText().isEmpty()||AccountTyepChoiceBox.getValue().isEmpty())
        {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please Fill Up All The Fields");
            a.showAndWait();
        }
    else{
        userArray.add(
            new UserDetails(  
                    FirstNameFid.getText(),
                    LastNameFid.getText(),
                    EmailAddressFld.getText(),
                    PasswordFId.getText(),
                    AddressFid1.getText(),
                    MobleNumberFld.getText(),
                    OccupationFld.getText(),
                    GenderFld.getText(), 
                    AccountTyepChoiceBox.getValue()
                )
        );
        File f = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        DataOutputStream dos = null;
        
        try {
            f = new File("userDetails.bin");
            if(f.exists()) fos = new FileOutputStream(f,true);
            else fos = new FileOutputStream(f);
            
            bos = new BufferedOutputStream(fos);
            dos = new DataOutputStream(bos);
            //dos = new DataOutputStream(fos);
            
           for(UserDetails s: userArray){
                    dos.writeUTF(s.getEmail());
                    dos.writeUTF(s.getPassword());
                    dos.writeUTF(s.getAccountTyep());
                    dos.writeUTF(s.getFirstName());
                    dos.writeUTF(s.getLastName());
                    dos.writeUTF(s.getAddress());
                    dos.writeUTF(s.getGender());
                    dos.writeUTF(s.getNumber());
                    dos.writeUTF(s.getOccupation());
                    
            Alert a = new Alert(Alert.AlertType.CONFIRMATION);
            a.setContentText("Form Submited");
            a.showAndWait();
           }
        } catch (IOException ex) {
    
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {
                
            }
        }      
        /*try {
            FileOutputStream fos = new FileOutputStream("userDetails.bin");
            DataOutputStream dos = new DataOutputStream(fos);
                for(UserDetails s: userArray){
                    dos.writeUTF(EmailAddressFld.getText());
                    dos.writeUTF(PasswordFId.getText());
                    dos.writeUTF(AccountTyepChoiceBox.getValue());
                    dos.writeUTF(FirstNameFid.getText());
                    dos.writeUTF(LastNameFid.getText());
                    dos.writeUTF(MobleNumberFld.getText());
                    dos.writeUTF(OccupationFld.getText());
                    dos.writeUTF(GenderFld.getText());
                    Alert a = new Alert(Alert.AlertType.CONFIRMATION);
            a.setContentText("Form Submited");
            a.showAndWait();
                    
        }
                dos.close();
        }
        catch (IOException ex) {
        }       
    }

         FileOutputStream fos = new FileOutputStream("userDetails.bin");
                DataOutputStream dos = new DataOutputStream(fos);
                for(UserDetails s: userArray){
                    dos.writeUTF(EmailAddressFld.getText());
                    dos.writeUTF(PasswordFId.getText());
                    dos.writeUTF(AccountTyepChoiceBox.getValue());
                    dos.writeUTF(FirstNameFid.getText());
                    dos.writeUTF(LastNameFid.getText());
                    dos.writeUTF(MobleNumberFld.getText());
                    dos.writeUTF(OccupationFld.getText());
                    dos.writeUTF(GenderFld.getText());
         }
                dos.close();
                
                 try{
                FileOutputStream FOS = new FileOutputStream("userDetails2.bin");
                ObjectOutputStream oos = new ObjectOutputStream(FOS);
                for(UserDetails s: userArray)
                    oos.writeObject(s);
                oos.close();
            }
            catch(Exception e){}
*/
    }
}

    @FXML
    private void BaackButton(ActionEvent event) throws IOException {
        Parent BackButton = FXMLLoader.load(getClass().getResource("welcomeToCdbl.fxml"));
        Scene scene2 = new Scene(BackButton);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();        
        window.setScene(scene2);
        window.show();
    }
}
