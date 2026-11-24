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
construireAcceuil();
construireInfos();
stage.setScene(acceuil);
stage.show();


    }

    private void construireAcceuil() {
        VBox racine = new VBox(22);
        racine.setAlignment(Pos.CENTER);
        racine.setBackground(Background.fill(Color.BLUE));
        Label titre = new Label("Gourmand e Flétan");
        titre.setTextFill(Color.WHITE);
        ImageView logo = new ImageView("logo.png" );
        logo.setFitWidth(400);
        logo.setFitHeight(245);
        Button jouer = new Button("Jouer");
        // a modifier quand prog terminer
        jouer.setOnAction(e ->System.out.println("demarrere jeu"));
        //
        Button boutonInfos = new Button("info");
        boutonInfos.setOnAction(e -> stage.setScene(infos));
racine.getChildren().addAll(logo,titre,jouer,boutonInfos);
acceuil = new Scene(racine,Largeur, hauteur);
    }



    private void construireInfos() {
        VBox racine = new VBox(18);
        racine.setAlignment(Pos.CENTER);
        racine.setBackground(Background.fill(Color.BLUE));
        Label titre = new Label("Gontrand le flétan");
        titre.setTextFill(Color.WHITE);
        ImageView poisson = new ImageView("poisson1.png");
        poisson.setFitHeight(110);
        poisson.setFitWidth(130);
        Label equipe = new Label("Équipe : Massimo et Arnaud ");
        equipe.setTextFill(Color.WHITE);
        Label description = new Label("Aidez Gontrand à remonter la rivière !");
        description.setTextFill(Color.WHITE);
        Button retour = new Button("Retour à l'acceuil");
        racine.getChildren().addAll(titre, poisson, equipe, description, retour);
        infos = new Scene(racine, Largeur, hauteur);
        infos.setOnKeyPressed(e -> {
            if (e.getCode().toString().equals("Escape")) stage.setScene(acceuil);});
    }



    }


