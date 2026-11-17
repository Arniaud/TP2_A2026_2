package ca.qc.bdeb.sim.tp2_a2026;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private  Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
       this.stage = stage;
        stage.setTitle("Gontrand le Flétan");
        stage.setResizable(false);









        System.out.println("Test Massimo");
        System.out.println("Hello world");

    }

    private void construireAcceuil(){
        VBox racine = new VBox(22);
    }
}
