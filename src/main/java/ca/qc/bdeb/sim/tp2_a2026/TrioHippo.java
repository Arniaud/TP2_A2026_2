package ca.qc.bdeb.sim.tp2_a2026;

import java.util.List;

public class TrioHippo {
    public static void ajouter(List<ObjetProjectile> list, double x,double y){
        list.add(new Hippocampe(x, y-45));
        list.add(new Hippocampe(x, y));
        list.add(new Hippocampe(x, y +45));
    }
}
