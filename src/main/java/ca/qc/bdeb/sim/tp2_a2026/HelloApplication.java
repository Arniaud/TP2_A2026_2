package ca.qc.bdeb.sim.tp2_a2026;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Stage stage;
    private Scene acceuil;
public static final int Largeur = 900;
public static final int hauteur = 520;

private Scene infos;
private Scene sceneJeu;



    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        stage.setTitle("Gontrand le Flétan");
        stage.setResizable(false);


        System.out.println("Test Massimo");
        System.out.println("Hello world");

    }

    private void construireAcceuil() {
        VBox racine = new VBox(22);
        racine.setAlignment(Pos.CENTER);
        racine.setBackground(Background.fill(Color.BLUE));
        Label titre = new Label("Gourmand e Flétan");
        titre.setTextFill(Color.WHITE);
        ImageView poisson = new ImageView("logo.png");
        Button jouer = new Button("Jouer");
        Button boutonInfos = new Button("info");
jouer.setOnAction(e -> stage.setScene(infos));
    }
}
