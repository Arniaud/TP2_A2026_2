package ca.qc.bdeb.sim.tp2_a2026;

import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;


public class Entite {

    protected double x, y, largeur, hauteur;
    protected Image imageActuelle;


    // ajouter le chemin fichier quand on va s'en occuper
    // création squelette classe pour avancer
    protected Entite(double x, double y, double largeur, double hauteur, String cheminFichier){
        this.x=x;
        this.y=y;
        this.largeur=largeur;
        this.hauteur=hauteur;
        this.imageActuelle = ImageJeu.chargement(cheminFichier);
    }



}
