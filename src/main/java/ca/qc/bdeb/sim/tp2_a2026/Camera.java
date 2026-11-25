package ca.qc.bdeb.sim.tp2_a2026;

public class Camera {
    private double x;
    public double getX(){
        return x;
}
public void reinitialiser(){
        x=0;
}
public void mettreAjour(double Xgontrand, double largeurFenetre, double largeurNiveau){
        double ex = largeurFenetre*0.20;
        if(Xgontrand > x + ex) {
            x = Xgontrand - ex;
        }
        x = Math.max(0,Math.min(x,largeurNiveau-largeurFenetre));
}
public double gaucheLimite(double Xmonde){
        return Math.max(x,Xmonde);
}
}
