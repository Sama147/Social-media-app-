package org.example.yallaBena;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Objects;


public class YallaBena extends Application {

    public static Stage stage;


    @Override
    public void start(Stage stage) throws Exception {
        // Load the first FXML file
        this.stage = stage;
        Parent fxmlFile = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("welcome.fxml")));
        Scene scene = new Scene(fxmlFile, 800, 500);
        stage.setTitle("Yalla Bena");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}

