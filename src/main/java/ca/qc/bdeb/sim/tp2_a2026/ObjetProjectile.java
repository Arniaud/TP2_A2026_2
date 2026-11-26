package ca.qc.bdeb.sim.tp2_a2026;


public abstract class ObjetProjectile extends Entite {



    protected double vx;
    protected double vy;
    protected double tempsCreation;

    protected ObjetProjectile(double x, double y, double largeur, double hauteur, String cheminImage){
        super(x,y,largeur,hauteur, cheminImage);
    }


    // méthode mère vide
    public abstract void rafraichir(double dt, Jeu jeu);

    protected void deplacer(double dt){
        x = x + vx*dt;
        y = y + vy*dt;
    }


    public boolean dansFrame (){
        boolean visibilite;
        visibilite = x < Jeu.Largeur + 100 && x + largeur > -100 && y < Jeu.Hauteur + 100 && y + hauteur > -100;
        return visibilite;
    }

    // a faire: methode pour trouver si oui ou non le projectile est dans le frame


}
