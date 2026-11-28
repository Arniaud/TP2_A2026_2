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
private boolean fin;
private double tempsfin;
private double tempsNiveau;
private double tempsPoissons;
private double tempsTir;
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
public void letGoTouche (KeyCode code) {
       touches.remove(code);
}
   public void arreter(){
       if (timer !=null) {
           timer.stop();
       }
   }
private void miseAJour(double dt) {
    if (pause) return;
    if (fin) {
        tempsfin += dt;
        if (tempsfin >= 3) {
            arreter();
            retourAcceuil.run();
        }
        return;
    }
    tempsNiveau += dt;
    if (debutNiveauTemps > 0) tempsNiveau -= dt;
    else {
        tempsPoissons += dt;
        double intervalle = 0.75 + 1 / niveau;
        if (tempsPoissons >= intervalle){
            tempsPoissons -= intervalle;
            creerGroupe();
        }
    }
    boolean gauche = touches.contains(KeyCode.LEFT), droite = touches.contains(KeyCode.RIGHT);
    boolean haut = touches.contains(KeyCode.UP), bas = touches.contains(KeyCode.DOWN);







    /* appliquer a gontrand...... */
    baril.update(tempsNiveau,Hauteur);
    if(tempsTir >0 ){
        tempsTir =- dt;
    }
    if (touches.contains(KeyCode.SPACE)&& tempsTir<= 0 && debutNiveauTemps <= 0){
        tirer();
        tempsTir =0.5;
    }

    // je vais terminer  cette methode tqt mais fait champ elec si tu px et debug si tu px sinon on fait debug a la fin
}
private void creerGroupe(){
       int n=1+hasard.nextInt(5);
       for (int i = 0; i<n; i++){
           double y = 30+hasard.nextDouble()*(Hauteur-160);
           poissons.add(new Poisson(camera.getX()+Largeur+hasard.nextInt(100),y,niveau));
       }
}
private void tirer(){
       double x = gontrand.xcentre(), y =gontrand.ycentre();
       switch(typeProjectile) {
           case "Hipo" -> TrioHippo.ajouter(projectiles, x, y);
           case "Sardine" -> projectiles.add(new BoiteDeSardines(x, y));
           default -> projectiles.add(new EtoileMer(x, y));
       }
       }


// aussi on a tellemtn de warning faudrait regarder ca mais le code fonction ;)
}

