package org.example.yallaBena;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.Objects;

public class ManageFriendsController {

    @FXML
    private javafx.scene.control.TextField txtFriend;
    @FXML
    private javafx.scene.control.Label lblError;

    @FXML
    private void ShowProfile() throws IOException {navigate("profile.fxml");}
    @FXML
    private void showViewPosts() throws IOException {navigate("viewposts.fxml");}
    @FXML
    private void showCreatePost() throws IOException {navigate("createpost.fxml");}
    @FXML
    private void showManageFriends() throws IOException {navigate("managefriends.fxml");}
    @FXML
    private void logout() throws IOException {
        Data.userId = "-1";
        navigate("welcome.fxml");
    }

    private void navigate(String fxml) throws IOException {
        Parent fxmlFile = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxml)));
        Scene scene = new Scene(fxmlFile, 800, 500);
        YallaBena.stage.setTitle("Yalla Bena");
        YallaBena.stage.setScene(scene);
        YallaBena.stage.show();
    }


    public void btnCancelOnClick(ActionEvent actionEvent) {
        txtFriend.setText("");
        lblError.setVisible(false);
        lblError.setText("");
    }

    public void btnAddFriend(ActionEvent actionEvent) {

        lblError.setVisible(false);
        if (txtFriend.getText().trim().isEmpty() ) {
            lblError.setText("You must enter user name & password");
            lblError.setVisible(true);
        }
        //else{
            //add to db txtFriend.getText().trim()
            //if found
            /*
            lblError.setText("User is added to your friend list");
            lblError.setVisible(true);
             */
            //else
            /*
            lblError.setText("User does not exist");
            lblError.setVisible(true);
             */
       // }
    }
}
