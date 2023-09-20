
package javafxapplication2;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NotieBoardHomeController implements Initializable {

    @FXML
    private Label ShowNoticeTextFld;
    private ArrayList<noticeShow> notice = new ArrayList<noticeShow>();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      for(noticeShow s: notice)
      {
          String n;
          n=s.getNotice();
          ShowNoticeTextFld.setText(n.toString());
      
      }
    }    

    
}
