package Format;
import Utils.Scan;

public class Dvd extends Multimedia{

    protected String bonus;

    public Dvd() {
        super();
        bonus = Scan.scanString("Entrer le nom du bonus : ");
    }
    public String getBonus() {
        return bonus;
    }
    public void setBonus(String bonus) {
        this.bonus = bonus;
    }
    @Override
    public String toString() {
        return  titre + " fait par " + auteur +" duree : "+ duree + " bonus : " + bonus + " reference : " + reference;
    }
}
