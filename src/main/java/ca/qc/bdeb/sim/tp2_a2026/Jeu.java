package ca.qc.bdeb.sim.tp2_a2026;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Jeu {
public static final int Largeur = 900;
public static final int Hauteur = 520;
private AnimationTimer timer;
private long dernierTemps;
private final Set<KeyCode> touches = new HashSet<>();
private  Baril baril;
private final Runnable retourAcceuil;
private Canvas canvas;
private GraphicsContext graph;
private int niveau =1;
private String typeProjectile = "Etoile";
private  Gontrand gontrand;
private final Camera camera = new Camera();
private double niveauTemps;
private double poissonTemps;
private double tirTemps;
private double debutNiveauTemps = 4;
/// commentaire prof rtest commit ...
/// test 2232hfliquwfuioewf
///test pour assurer
/// ///fergergeg

   public Jeu(Runnable retourAcceuil) {
       this.retourAcceuil = retourAcceuil;
   }
   public void setCanvas (Canvas canvas){
       this.canvas = canvas;
       this.graph = canvas.getGraphicsContext2D();
   }
 private void nouveauNiveau(boolean nouvellePartie) {
     if (nouvellePartie) {
         niveau = 1;
         typeProjectile = "Etoile";
     }
     gontrand = new Gontrand();
     camera.reinitialiser();
     niveauTemps = 0;
     poissonTemps =0;
     tirTemps = 0;
     debutNiveauTemps = 4;
//je vais le faire arn
 }
}
