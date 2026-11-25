package ca.qc.bdeb.sim.tp2_a2026;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;



public abstract class ObjetProjectile extends Entite {



    protected double vx;
    protected double vy;

    protected ObjetProjectile(double x, double y, double largeur, double hauteur, String cheminImage){
        super(x,y,largeur,hauteur, cheminImage);
    }


    // méthode mère vide
    public abstract void rafraichir(double dt, ImageJeu jeu);





}
