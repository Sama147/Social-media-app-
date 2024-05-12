package org.example.yallaBena;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.Objects;

public class createPostController {

    @FXML
    private javafx.scene.control.TextArea txtComment;
    @FXML
    private javafx.scene.control.Label lblError;


    @FXML
    public void btnCancelOnClick() throws IOException {
        txtComment.setText("");
    }

    @FXML
    public void btnRegisterOnClick() throws IOException {
        String comment = txtComment.getText();
        lblError.setVisible(false);

        if (!comment.trim().isEmpty()) {
             //insert comment in db
             lblError.setText("Your comment is saved successfully");
             lblError.setVisible(true);

        }
        else {
            lblError.setText("You should enter a comment");
            lblError.setVisible(true);
         }

    }



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
}
