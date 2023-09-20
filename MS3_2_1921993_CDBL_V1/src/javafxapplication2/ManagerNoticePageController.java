
package javafxapplication2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class ManagerNoticePageController implements Initializable {

    @FXML
    private TextField NoticeTextFld;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    
    }    

    @FXML
    private void SaveNoticeButton(ActionEvent event) throws IOException {
        if(NoticeTextFld.getText().isEmpty())
        {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please Enter a Notice");
            a.showAndWait();
        }
        else{
            String notice="";
            notice =NoticeTextFld.getText();
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("notice.txt"));
                writer.write(notice);
                  writer.close();
        
            }
            catch (IOException ex) {}
    }
    }
    

    @FXML
    private void CloseButton(ActionEvent event) throws IOException {
        Parent BackButton = FXMLLoader.load(getClass().getResource("ManagmentHomePage.fxml"));
        Scene scene2 = new Scene(BackButton);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();        
        window.setScene(scene2);
        window.show();
    }
private ArrayList<noticeShow> notice = new ArrayList<noticeShow>();
    @FXML
    private void PostButton(ActionEvent event) {
    try{
        File file = new File("C:\\Users\\tanmo\\Desktop\\java skd\\JavaCDBLProject\\notice.txt");
         BufferedReader br
            = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null){
        notice.add(
            new noticeShow(st) );
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
            a.setContentText("Form Submited");
            a.showAndWait();
        
        }
 
    
    
    }
    catch(Exception e){}
        
        
    }
    
}
