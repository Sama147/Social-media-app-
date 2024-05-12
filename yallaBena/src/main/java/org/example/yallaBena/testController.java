package org.example.yallaBena;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class testController {

    @FXML
    private TextField txtUserName;

    @FXML
    private Label lblError;

    String u="";

    public void hanafe(ActionEvent actionEvent) {
        u = txtUserName.getText(); //reading from GUI
        u = u + " lolo" ;

        lblError.setText(u);


    }
}
