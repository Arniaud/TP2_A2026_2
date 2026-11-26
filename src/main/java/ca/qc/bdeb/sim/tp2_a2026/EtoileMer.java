package ca.qc.bdeb.sim.tp2_a2026;

public class EtoileMer extends ObjetProjectile{
    public EtoileMer(double x , double y){
        super(x-18, y-18, 36, 35, "etoile.png");
        vx = 800;
    }

    @Override
    public void rafraichir(double dt, Jeu jeu) {
        tempsCreation = tempsCreation + dt;
        deplacer(dt);
    }
}
