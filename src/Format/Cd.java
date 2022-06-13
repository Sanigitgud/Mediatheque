package Format;
import Utils.Scan;

public class Cd extends Multimedia{
    //Classe enfant de Multimedia
    protected int nbPlage;
    
    public Cd() {
        super();
        nbPlage = Scan.scanInteger("Entrer le nombre de plage : ");
    }
    public int getNbPlage() {
        return nbPlage;
    }
    public void setNbPlage(int nbPlage) {
        this.nbPlage = nbPlage;
    }
    @Override
    public String toString() {
        return  titre + " fait par " + auteur +" duree : "+ duree +" nombre de plage : "+ nbPlage +" reference : " + reference;
    }

}
