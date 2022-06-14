package Utils;
import Utils.Scan;
import java.util.Scanner;

public class Scan {
    
	/**
	 * fonction qui demande l'entrée d'une chaîne de caractères à l'utilisateur
	 * puis, à l'aide d'un Scanner, récupère la chaîne entrée
	 * 
	 * @return la chaîne obtenue
	 * @param la question posée à l'utilisateur
	 */
	public static String scanString(String question) {
		System.out.println(question);
		Scanner scan = new Scanner(System.in);
		String ret = scan.nextLine();
		// scan.close();
		return ret;
	}

	public static Integer scanInteger(String question) {
		System.out.println(question);
		Integer ret;
		try {
			Scanner scan = new Scanner(System.in);
			ret = scan.nextInt();
		} catch (Exception exception) {
			return scanInteger("Entrer un nombre entier ! : ");
		}

		// scan.close();
		return ret;
	}
}
