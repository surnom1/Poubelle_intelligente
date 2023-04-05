package com.example.poubelle_intelligente;

import application.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        Poubelle_intelligente poubelle_intelligente = new Poubelle_intelligente(24,"rue Charles De Gaulle",6000f,"bleu,vert,verre,metal",5500f);
        Bac bac = new Bac(Type_de_dechet.PLASTIQUE,200,poubelle_intelligente);
        Consommateur consommateur = new Consommateur(27,"adresse",72f,"User");

        Sac_poubelle sac_poubelle = new Sac_poubelle(Type_de_dechet.PLASTIQUE,"bac bleu",consommateur,bac);
        consommateur= new Consommateur(27,"adresse",8f,"User");
        System.out.println(consommateur.GetPoints());
    }
}