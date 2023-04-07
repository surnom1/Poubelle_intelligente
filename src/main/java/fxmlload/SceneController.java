package fxmlload;

import java.io.IOException;
import java.nio.file.Paths;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToScene1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Paths.get("C:\\Users\\CYTech Student\\IdeaProjects\\Poubelle_intelligente\\src\\main\\resources\\com\\example\\poubelle_intelligente\\scene1.fxml").toUri().toURL());
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Paths.get("C:\\Users\\CYTech Student\\IdeaProjects\\Poubelle_intelligente\\src\\main\\resources\\com\\example\\poubelle_intelligente\\scene2.fxml").toUri().toURL());
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}