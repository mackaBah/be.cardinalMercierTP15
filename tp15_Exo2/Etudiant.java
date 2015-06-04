/**
 * 
 */
package be.cardinalmercier.tp15_Exo2;

/**
 * @author Macka
 *
 */
import java.util.ArrayList;

public class Etudiant {
	private String nom;
	private static int dernierNumAttribue = 0;
	private int num;
	public ArrayList<Integer> listePoints = new ArrayList<Integer>();
	public static ArrayList<Etudiant> listeEtu = new ArrayList<Etudiant>();
	public Etudiant(String nom){
		this. nom = nom;
		this. num = ++ dernierNumAttribue; //pré-incrémentation
	}
	/**
	 * Methode double moyenne() permet de calculer la moyenne. 
	 * @return moyenne en double .
	 */
	public double moyenne(){
		double somme = 0;
		for (Integer points : listePoints) {
			somme += points;
		}
		if (listePoints.size() == 0) return 0;
		return somme / listePoints.size();
	}
	/**
	 * 
	 */
	public String toString() {
		StringBuffer s = new StringBuffer("Nom : " + nom + " num : "+num+"\nPoints : ");
		for (Integer points : listePoints) {
			s.append("\t" + points);
		}
		s.append("\n" + "moyenne = " + this.moyenne()+"\n");
		String s2 = new String(s);
		return s2;
	}
	/**
	 * Ajoute un Etudiant à la liste des Etudiants.
	 * @param newEtu
	 */
	public static void ajouteEtu(Etudiant newEtu){
		listeEtu.add(newEtu);
	}
	/**
	 * Methode qui permet l'ajoute d'un point à 
	 * la liste de point pour chaque etudiant
	 * @param newPoint
	 */
	public void ajoutePoint(int newPoint){
		listePoints.add(newPoint);
	}
	/**
	 * @return une chaine de caractères qui représentent tous les étudiants de la liste
	 */
	public static String toStringAll(){
		StringBuffer sb = new StringBuffer();
		for (Etudiant etudiant : Etudiant.listeEtu) {//attantion !!
			sb.append(etudiant.toString());
		}
		String s = new String(sb);
		return s;
	}
}

