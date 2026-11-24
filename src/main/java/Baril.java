import ca.qc.bdeb.sim.tp2_a2026.Entite;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Baril extends Entite {
    private boolean utiliseBaril = false;
    private final double xFixe;
    public Baril(double x, double hauteurEcran){
        super (x, 0, 70, 83, "baril.png");
        xFixe = x;
    }
    public void update(double tempsNiveau, double hauteurEcran){
        y = (hauteurEcran-hauteur)/2*Math.sin(2*Math.PI*tempsNiveau/3)+(hauteurEcran-hauteur)/2;
    }
    public void utiliserBaril(){
        utiliseBaril = true;
        Image barilOuvert = new Image("baril-ouvert,png");
    }
    public boolean BarilestUiliser(){
        return utiliseBaril;
    }
    //a completer
}
