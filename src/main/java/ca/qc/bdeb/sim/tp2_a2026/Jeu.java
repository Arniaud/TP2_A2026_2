package ca.qc.bdeb.sim.tp2_a2026;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
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
private Decor decor;
private Color fond = Color.DARKBLUE;
private final Random hasard = new Random();
private final ArrayList<Poisson> poissons = new ArrayList<>();
private final ArrayList<ObjetProjectile> projectiles = new ArrayList<>();
private  boolean pause;
private boolean debugProg;
private boolean debugChamp;

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
     decor = new Decor();
     baril = new Baril(900+hasard.nextDouble()*(Largeur-1800),Hauteur);
     //je ne savais pas comment faire mais tu px changer au pire
     fond = Color.hsb(190+hasard.nextDouble()*80, .84, 1.0);
 }

 private void touchePressee(KeyCode code) {
     if (code == KeyCode.ESCAPE) {
         arreter();
         retourAcceuil.run();
         return;
     }
     if (code == KeyCode.P) {
         if (!touches.contains(KeyCode.P)) {
             pause = !pause;
         }
         if (code == KeyCode.D) {
             debugProg = !debugProg;
         }
         if (code == KeyCode.F) {
             debugChamp = !debugChamp;
         }
         if (code == KeyCode.Q) {
             typeProjectile = "Etoile";
         }
         if (code == KeyCode.W) {
             typeProjectile = "Hippo";
         }
         if (code == KeyCode.E) {
             typeProjectile = "Sardine";
         }
         if (code == KeyCode.R) {
             // g besoin de la classe gontrand completer svp
         }
         if (code == KeyCode.T) {
             niveau++;
             nouveauNiveau(false);

         }
     }
     touches.add(code);
 }





   public void arreter(){
       if (timer !=null) {
           timer.stop();
       }
   }

}
