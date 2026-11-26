package ca.qc.bdeb.sim.tp2_a2026;

public class BoiteDeSardines extends ObjetProjectile{

    private double charge = 500;

    public BoiteDeSardines(double x , double y){
        super(x-18, y-15, 35, 30, "sardines.png");
    }

    @Override
    public void rafraichir(double dt, Jeu jeu) {
        tempsCreation = tempsCreation + dt;

        // gestion fleches et attraction a faire




    }
}
