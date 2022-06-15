package Format;
import Utils.*;

public class Multimedia extends Support {
    //classe enfant de Support et Parent de Cd et Dvd
    protected String duree;

    public Multimedia() {
        //constructeur appellant le constructeur parent et rajoutant la durée du média
        super();
        duree = Scan.scanString("Entrer la duree : ");

    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "Multimedia [duree=" + duree + "]";
    }

}
