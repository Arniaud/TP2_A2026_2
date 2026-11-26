package ca.qc.bdeb.sim.tp2_a2026;

import java.util.Random;

public class Hippocampe extends ObjetProjectile{

    private double yInitial;
    private double xInitial;
    private double grandeurVague;
    private double tempsPhase;
    private double phase;


    public Hippocampe(double x, double y){
        super(x, y, 20, 36, "hippocampe.png");
        xInitial = x;
        yInitial = y;

        Random r = new Random();

        if (r.nextBoolean()) {
            grandeurVague = 30 + r.nextDouble() * 30;
        } else {
            grandeurVague = -(30 + r.nextDouble() * 30);
        }

        tempsPhase = 1 + r.nextDouble() * 2;
        phase = r.nextDouble() * Math.PI * 2;
        vx = 500;

    }

    @Override
    public void rafraichir(double dt, Jeu jeu) {
        tempsCreation = tempsCreation + dt;
        x = xInitial + vx*tempsCreation;
        y = yInitial + grandeurVague*Math.sin((2*Math.PI*tempsCreation/tempsPhase) + phase) - hauteur/2;
    }
}
