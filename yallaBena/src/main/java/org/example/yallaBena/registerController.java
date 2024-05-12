package org.example.yallaBena;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import static org.example.yallaBena.YallaBena.stage;

public class registerController {

   String filename="";
   String unformattedFilename="";

    @FXML
    private javafx.scene.control.TextField txtUserName;
    @FXML
    private javafx.scene.control.PasswordField txtPassword;
    @FXML
    private javafx.scene.control.TextArea txtBio;
    @FXML
    private javafx.scene.control.PasswordField txtRePassword;
    @FXML
    private javafx.scene.control.Label lblError;
    @FXML
    private ImageView profileImage1;

    @FXML
    private void btnCancelOnClick(){
        txtUserName.setText("");
        txtBio.setText("");
        txtPassword.setText("");
        txtRePassword.setText("");
        lblError.setVisible(false);
    }
    @FXML
    public void btnPictureOnCLick(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select File");

        // Set the initial directory (optional)
        File initialDirectory = new File(System.getProperty("user.home"));
        fileChooser.setInitialDirectory(initialDirectory);

        // Add file filters (optional)
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );

        // Show the file chooser dialog
        File selectedFile = fileChooser.showOpenDialog(stage);

        if (selectedFile != null) {
            unformattedFilename = selectedFile.getAbsolutePath();
            filename = unformattedFilename.replace("\\", "\\\\");
            System.out.println("Selected File: " + filename);

            Image theImage;
            if (!filename.isEmpty()) {
                theImage = new Image(new File(filename).toURI().toString());
            } else {
                // Provide a default image path or handle the case when filename is empty
                theImage = new Image("C:\\yallaBena\\src\\main\\resources\\images\\1.jpg");
            }
            profileImage1.setImage(theImage);
            Data.image = filename;
        } else {
            System.out.println("No file selected.");
        }
    }

    @FXML
    private void btnRegisterOnClick() throws IOException {
        String userName  = txtUserName.getText();
        String bio  = txtBio.getText();
        String password  = txtPassword.getText();
        String rePassword  = txtRePassword.getText();

        lblError.setText("");// clear previous errors

        //check for empty fields
        if (userName.trim().isEmpty()) {
            lblError.setText("You must enter a user name");
            lblError.setVisible(true);
        }
        else if (password.trim().isEmpty()) {
            lblError.setText("You must enter a password");
            lblError.setVisible(true);
        }
        else if (rePassword.trim().isEmpty()){
            lblError.setText("You must enter a reenter password");
            lblError.setVisible(true);
        }
        //check passwords are matched
        else if (!password.equals(rePassword)) {
            lblError.setText("Passwords are not matched");
            lblError.setVisible(true);
        }
        else {
            /*
            *******
            check that the same username and password is not used before
            and show an error
            and stop here
            */

            /*
            *************
            add this user to db and get his id
            */
            String dbId = "1";

            //create the user
            User user = new User(userName, password, bio , filename, dbId);

            // add this user to the list of users
            UserManager userManager = new UserManager();
            userManager.addUser(user);

            // save the details of this user to be used in the profile
            Data.userId = dbId;
            Data.userName = userName;
            Data.password = password;
            Data.bio = bio;



            //redirect to profile page
            if (lblError.getText().isEmpty()) {
                navigate("profile.fxml");
            }

        }
    }

    private void navigate(String fxml) throws IOException {
        Parent fxmlFile = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxml)));
        Scene scene = new Scene(fxmlFile, 800, 500);
        stage.setTitle("Yalla Bena");
        stage.setScene(scene);
        stage.show();
    }



}
