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
import javafx.stage.Stage;

public class ManagmentHomePageController implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void PostNoticeButton(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("ManagerNoticePage.fxml"));
                   Scene scene2 = new Scene(scene2Parent);
                   Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                   window.setScene(scene2);
                   window.show();
    }

    @FXML
    private void CheckCvsButton(ActionEvent event) {
    }

    @FXML
    private void SuspendBoAccountButton(ActionEvent event) {
    }

    @FXML
    private void backButton(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("welcomeToCdbl.fxml"));
                   Scene scene2 = new Scene(scene2Parent);
                   Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                   window.setScene(scene2);
                   window.show();
    }
    
}
