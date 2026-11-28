package ca.qc.bdeb.sim.tp2_a2026;


import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

import java.util.Random;

// on pourra changer le nom de cette classe apres car c melangeant ngl, on le change a enemi non?
public class Poisson extends Entite{
    private double vx;
    private double vy;
    private double ax = -100;

    private final Random R = new Random();


    public Poisson(double x, double y, int niveau){
        // code pour choisir au hasard un des 5 fichiers de poissons
        super(x,y,120, 80, "poisson1");
        hauteur = 50+ R.nextDouble()*70;
        largeur = 120/104*hauteur;
        vx = -(100*Math.pow(niveau, 0.5)+ 100);
        if (R.nextBoolean()) {
            vy = R.nextDouble() * 100;
        } else {
            vy = -R.nextDouble() * 100;
        }
    }


    public void rafraichir(double dt, double hauteurFrame){
        vx = vx + ax*dt;
        x = x+ vx*dt;
        y = y+ vy*dt;

        // conditions pour si le poisson quitte la frame
    }








}
