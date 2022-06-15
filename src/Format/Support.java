package Format;
import java.io.Serializable;

import Utils.*;
public abstract class Support implements Serializable {  
    //support en classe abstraite car ne sert pas a créer d'objet mais est utile pour donner le format des autres objets 
    protected String auteur;
    protected String titre;
    protected String reference;

    public Support() {
        //on utilise le scan pour faire le constructeur directement
        auteur = Scan.scanString("Entrer le nom de l'auteur : ");
        titre = Scan.scanString("Entrer le titre : ");
        reference = Scan.scanString("Entrer la reference : ");
    }
    //Getter & Setter pas encore utilisé dans le code
    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

}
