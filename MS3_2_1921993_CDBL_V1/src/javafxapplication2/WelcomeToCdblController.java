package javafxapplication2;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class WelcomeToCdblController implements Initializable {

    @FXML
    private BorderPane HomePage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
   
    }    
    @FXML
    private void NoticeBoardButton(ActionEvent event) throws IOException {
         Parent NotieBoardHome = FXMLLoader.load(getClass().getResource("NotieBoardHome.fxml"));
        Scene scene2 = new Scene(NotieBoardHome);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();        
        window.setScene(scene2);
        window.show();
        
        //BorderPane NoticeButton = FXMLLoader.load(getClass().getResource("NotieBoardHome.fxml"));
        //HomePage.getChildren().setAll(NoticeButton);
    }

    @FXML
    private void ExistingUserButton(ActionEvent event) throws IOException {
       
        Parent ExistingUser = FXMLLoader.load(getClass().getResource("ExistingUserPage.fxml"));
        Scene scene2 = new Scene(ExistingUser);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();        
        window.setScene(scene2);
        window.show();
        // BorderPane ExistingUserButton = FXMLLoader.load(getClass().getResource("ExistingUserPage.fxml"));
        //HomePage.getChildren().setAll(ExistingUserButton);
    }

    @FXML
    private void NewUserButton(ActionEvent event) throws IOException {
      
        Parent NewUserPage = FXMLLoader.load(getClass().getResource("NewUserPage.fxml"));
        Scene scene2 = new Scene(NewUserPage);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();        
        window.setScene(scene2);
        window.show();
        
      //  BorderPane NewUserButton = FXMLLoader.load(getClass().getResource("NewUserPage.fxml"));
      //HomePage.getChildren().setAll(NewUserButton);
    }

    @FXML
    private void QueriesButton(ActionEvent event) throws IOException {
       
        Parent QueriesButton = FXMLLoader.load(getClass().getResource("QueriesPage.fxml"));
        Scene scene2 = new Scene(QueriesButton);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();        
        window.setScene(scene2);
        window.show();
        // BorderPane QueriesButton = FXMLLoader.load(getClass().getResource("QueriesPage.fxml"));
       //HomePage.getChildren().setAll(QueriesButton);
    }

    @FXML
    private void JobCirculationButton(ActionEvent event) throws IOException {
        
        Parent JobCirculationButton = FXMLLoader.load(getClass().getResource("JobCirculationPage.fxml"));
        Scene scene2 = new Scene(JobCirculationButton);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();        
        window.setScene(scene2);
        window.show();
         //BorderPane JobCirculationButton = FXMLLoader.load(getClass().getResource("JobCirculationPage.fxml"));
        //HomePage.getChildren().setAll(JobCirculationButton);
    }
    
}
