import Format.*;
import Utils.Scan;

public class MainMediatheque {
    public static void main(String[] args) {
        //Question pour le choix de l'objet a créer 
        String question = "Que voulez créer ?\n1- Livre\n2- DVD\n3- CD\n0- STOP";
        Integer userChoice = Scan.scanInteger(question);
        //tant que la réponse n'est pas 0 (STOP) on continue la création d'objet 
        while (userChoice != 0) {
            Support s;
            switch (userChoice) {
                case 1:
                    s = new Livre();  //choix 1 crée un livre
                    break;
                case 2:
                    s = new Dvd();   //choix 2 crée un Dvd
                    break;
                case 3:
                    s = new Cd();    //choix 3 crée un Cd
                    break;
                case 4:
                	System.out.println("Option à venir .....");
                    s = new Multimedia();    //choix 4 crée un Magazine
                    break;
                case 5:
                	System.out.println("Option à venir .....");
                    s = new Multimedia();    //choix 5 crée Carte Michelin
                    break;
                default:
                    s = new Multimedia();  //le choix défautls crée un multimedia non précisé (pas 0 ,1 ,2 ou 3)
                    break;

            }
            System.out.println(s);     //print l'object créé
            userChoice = Scan.scanInteger(question);

           
        }
    }
}
