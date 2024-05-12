package org.example.yallaBena;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import java.io.IOException;
import java.util.Objects;

public class welcomeController {

    @FXML
    private javafx.scene.control.TextField txtUserName;
    @FXML
    private javafx.scene.control.PasswordField txtPassword;
    @FXML
    private Label lblError;


    @FXML
    public void onLoginClick() throws IOException {
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        lblError.setVisible(false);
        lblError.setText("");

        if (userName.trim().isEmpty() || password.trim().isEmpty()) {
            lblError.setText("You must enter user name & password");
            lblError.setVisible(true);
        } else {
            /*
            check in db return true or false

            */

            //Data.userId = CheckUserName(userName, password);
            // if (id != null) {
            //true go to profile page
            if (lblError.getText().isEmpty()) {//to be removed after db code
                navigate("profile.fxml");
            } else {
                //false show error message and empty the fields
                lblError.setVisible(true);
                txtUserName.setText("");
                txtPassword.setText("");
            }
        }
    }

    @FXML
    public void onRegisterClick() throws IOException {
       navigate("myregister.fxml");

    }

    private void navigate(String fxml) throws IOException {
        Parent fxmlFile = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxml)));
        Scene scene = new Scene(fxmlFile, 800, 500);
        YallaBena.stage.setTitle("Yalla Bena");
        YallaBena.stage.setScene(scene);
        YallaBena.stage.show();
    }
}