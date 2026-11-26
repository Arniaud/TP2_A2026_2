package ca.qc.bdeb.sim.tp2_a2026;

import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;
import java.util.Random;

public class Decor {
    private final ArrayList<Entite> chose = new ArrayList<>();

    public Decor() {
        Random random = new Random();
        double x = 0;
        while (x < Jeu.Largeur + 100) {
            String nomDecor = "decor" + (1 + random.nextInt(6)) + ".png";
            chose.add(new EntiteDecor(x, Jeu.Hauteur - 109, nomDecor));
            x += 130 + random.nextInt(51);
        }
    }
public void Dessin(GraphicsContext gc, double xCamera){
        for (Entite e : chose){
            e.redessiner(gc,xCamera);
        }
}
    private static class EntiteDecor extends Entite {
        EntiteDecor(double x, double y, String img) {
            super(x, y, 80, 119, img);

        }
    }

}