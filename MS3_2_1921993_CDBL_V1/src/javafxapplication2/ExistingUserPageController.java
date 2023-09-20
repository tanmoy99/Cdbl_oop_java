package javafxapplication2;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ExistingUserPageController implements Initializable {

    @FXML
    private TextField emailFId;
    @FXML
    private PasswordField PasswordFId;
    @FXML
    private ChoiceBox<String> AccountTypeChoiceBox;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        AccountTypeChoiceBox.getItems().addAll("BO Account","Managment","It Deparment","Guest","Marchent Bank");
        AccountTypeChoiceBox.setValue("BO Account"); 
  
    }    

    @FXML
    private void LogInButton(ActionEvent event) throws IOException {
        if(emailFId.getText().isEmpty()||PasswordFId.getText().isEmpty()||AccountTypeChoiceBox.getValue().isEmpty()){
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please Fill Up All The Fields");
            a.showAndWait();
        }
        else{
        String email = emailFId.getText();
        String pass = PasswordFId.getText();
        String type = AccountTypeChoiceBox.getValue();
     
         String userName;
         String pas;
         String accTyp;
        Scanner x; 
        String s=null;
        if(type.equals("BO Account")){
        File f = null;
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        String str="";
        try {
            f = new File("boAccount.bin");
            if(!f.exists()){
                Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("OOPs userDetails File Dosen't exsist");
            a.showAndWait();
            }
        fis = new FileInputStream(f);
               
                dis = new DataInputStream(fis);
               
                while(true){
                    
                      String EMAIL=  dis.readUTF();
                       String PASS= dis.readUTF();
                      String TYPE=  dis.readUTF();
                 
                      if(EMAIL.equals(email) && PASS.equals(pass) )
                      {                   
            Alert a = new Alert(Alert.AlertType.CONFIRMATION);
            a.setContentText("LogIn Successful ");
            a.showAndWait();
            break;
                          }
                      else{
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("OOPs wrong Email ID or Password");
            a.showAndWait();    
            break;
                      
                      }
                          
                      }
                }
        catch(Exception e){}
       }
        else{
        try {
            x = new Scanner(new File("users.txt"));
            x.useDelimiter("[,\n]");
            while(x.hasNext()){
               userName= x.next();
               pas= x.next();
               accTyp= x.next();
  
               if(userName.trim().equals(email) && pas.trim().equals(pass) ){
                   if(accTyp.trim().equals("Managment")){
                   Parent scene2Parent = FXMLLoader.load(getClass().getResource("ManagmentHomePage.fxml"));
                   Scene scene2 = new Scene(scene2Parent);
                   Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
                   window.setScene(scene2);
                   window.show();
                   break;
               }
                   else if(accTyp.trim().equals("It Deparment")){
                   Parent scene2Parent = FXMLLoader.load(getClass().getResource("ItDeparmentHomePage.fxml"));
                   Scene scene2 = new Scene(scene2Parent);
                   Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
                   window.setScene(scene2);
                   window.show();
                   break;
                   
                   }
                   else if(accTyp.trim().equals("Guest")){
                   Parent scene2Parent = FXMLLoader.load(getClass().getResource("ManagmentHomePage.fxml"));
                   Scene scene2 = new Scene(scene2Parent);
                   Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
                   window.setScene(scene2);
                   window.show();
                   break;
                   }
                   else if(accTyp.trim().equals("Marchent Bank")){
                       Parent scene2Parent = FXMLLoader.load(getClass().getResource("ManagmentHomePage.fxml"));
                   Scene scene2 = new Scene(scene2Parent);
                   Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
                   window.setScene(scene2);
                   window.show();
                   break;
                   }
                   
               else{
                   Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("OOPs wrong Email ID or Password");
            a.showAndWait();    
            break;
                   
               }
            }
        }
        }
        catch (Exception e) { }   
         
        }
        }
    }
       

    @FXML
    private void BackButton(ActionEvent event) throws IOException {
        
        Parent BackButton = FXMLLoader.load(getClass().getResource("welcomeToCdbl.fxml"));
        Scene scene2 = new Scene(BackButton);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();        
        window.setScene(scene2);
        window.show();
    }
    
}
