package org.example.yallaBena;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.Objects;


public class ViewPostsController {
    public void btnCancelOnClick( ){
    }

    public void btnAddComment() {

    }


    /*
    TableView tableView = new TableView();

    TableColumn<Person, String> column1 =
    new TableColumn<>("First Name");

    column1.setCellValueFactory(
        new PropertyValueFactory<>("firstName"));


    TableColumn<Person, String> column2 =
    new TableColumn<>("Last Name");

    column2.setCellValueFactory(
        new PropertyValueFactory<>("lastName"));


    tableView.getColumns().add(column1);
    tableView.getColumns().add(column2);

    tableView.getItems().add(
      new Person("John", "Doe"));
    tableView.getItems().add(
      new Person("Jane", "Deer"));

    VBox vbox = new VBox(tableView);

    Scene scene = new Scene(vbox);
     */
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
