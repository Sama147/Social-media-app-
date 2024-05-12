package org.example.yallaBena;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class ProfileController {

    @FXML
    private ImageView imgProfile;
    @FXML
    private Label lblUserName;
    @FXML
    private Label lblBio;

    //navigation
    @FXML
    private void showProfile() throws IOException {navigate("profile.fxml");}
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

    protected void navigate(String fxml) throws IOException {
        Parent fxmlFile = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxml)));
        Scene scene = new Scene(fxmlFile, 800, 500);
        YallaBena.stage.setTitle("Yalla Bena");
        YallaBena.stage.setScene(scene);
        YallaBena.stage.show();
    }

    // Logic
    @FXML
    private void initialize() {
        // Initialize user details
        String username;
        String bio;
        String image;

        // Check if user details are available, otherwise use default values
        if (Data.userName == null){
            System.out.println("Coming from login");
            username = "default User name";
            bio = "default Bio";
            image = "C:\\yallaBena\\src\\main\\resources\\images\\1.jpg"; // Provide a default image path
        } else {
            username = Data.userName;
            bio = Data.bio;
            image = Data.image;
        }

        // Set user details to labels
        lblUserName.setText(username);
        lblBio.setText(bio);

        // Load and set profile image if the image path is not null
        if (image != null && !image.trim().isEmpty()){
            // Try to load the image
            try {
                Image theImage = new Image(new File(image).toURI().toString());
                imgProfile.setImage(theImage);
            } catch (NullPointerException e) {
                System.err.println("Failed to load image: " + e.getMessage());
            }
        }

    }


}
