package ca.qc.bdeb.sim.tp2_a2026;

public abstract class Projectile  extends Entite {
    protected double vx, vy;
    protected double age;
    protected Projectile(double x, double y, double w, double h, String image) {
        super(x, y, w, h, image);
    }
    //a completer
}
