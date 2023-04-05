module com.example.poubelle_intelligente {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.poubelle_intelligente to javafx.fxml;
    exports com.example.poubelle_intelligente;



    opens application to javafx.fxml;
    exports application;
    exports fxmlload;
    opens fxmlload to javafx.fxml;
}

