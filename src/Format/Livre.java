package Format;
import Utils.Scan;

public class Livre extends Support {
//class enfant de Support
    protected int nbPage;

    public Livre() {
        //constructeur appellant le constructeur parent et rajoutant le nombre de page
        super();
        nbPage = Scan.scanInteger("Entrer le nombre de page : ");
    }
    //Getter & Setter
    public int getNbPage() {
        return nbPage;
    }

    public void setNbPage(int nbPage) {
        this.nbPage = nbPage;
    }
    //toString pour retourné l'objet en String et non un emplacement mémoire
    @Override //réécriture
    public String toString() {
        return titre + " fait par " + auteur + " nombre de page : " + nbPage + " reference : " + reference;
    }
}
