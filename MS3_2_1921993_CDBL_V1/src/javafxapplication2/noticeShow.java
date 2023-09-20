
package javafxapplication2;

import javafx.beans.property.SimpleStringProperty;

public class noticeShow {
    SimpleStringProperty notice;
    public noticeShow(String notice){
        this.notice = new SimpleStringProperty(notice);
    }

    public void setNotice(String notice) {
        this.notice = new SimpleStringProperty(notice);
    }
    public String getNotice() {
        return notice.get();
    }
    
    
}
