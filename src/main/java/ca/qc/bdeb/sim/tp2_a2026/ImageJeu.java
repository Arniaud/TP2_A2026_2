package ca.qc.bdeb.sim.tp2_a2026;


import javafx.scene.image.Image;
import java.util.HashMap;
import java.util.Map;


public class ImageJeu {

    private static final Map<String, Image> cache = new HashMap<>();
    private ImageJeu(){}
    static Image chargement(String nom){
        if (cache.containsKey(nom)){
            return cache.get(nom);
        }

        var url = ImageJeu.class.getResource("/images/"+ nom);
        // ajout du code pour eviter les exception

        Image imageLocal = new Image(url.toString());
        cache.put(nom, imageLocal);
        return imageLocal;
    }

}
