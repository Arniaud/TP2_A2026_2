package ca.qc.bdeb.sim.tp2_a2026;

import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;


public abstract class Entite {

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

    protected Entite() {
    }

    //ajouter une methoxe pour redessiner et pour les collisions
    public void redessiner(GraphicsContext context, double xCamera){
        if (imageActuelle != null){
            context.drawImage(imageActuelle, x-xCamera, y, largeur, hauteur);
        } else {
          context.setFill(Color.MAGENTA);
          context.fillRect(x-xCamera, y, largeur, hauteur);
        }
    }
public double xcentre(){
        return x+ largeur/2;
}
public double ycentre(){
        return y+ hauteur/2;
    }
public double getX(){
        return x;
}
public double getY(){
        return y;
}
    // methode pour trouver le centre si nécessaire



}
