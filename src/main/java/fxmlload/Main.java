package fxmlload;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.nio.file.Paths;


public class Main extends Application {

    @Override
    public void start(Stage stage) {
        try {

            Parent root = FXMLLoader.load(Paths.get("C:\\Users\\CYTech Student\\IdeaProjects\\Poubelle_intelligente\\src\\main\\java\\fxmlload\\scene1.fxml").toUri().toURL());
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}