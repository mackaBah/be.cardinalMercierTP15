/**
 * 
 */
package be.cardinalmercier.tp15_Exo2;

/**
 * @author Macka
 *
 */
import javax.swing.JOptionPane;

import tp15_a.Etudiant;

public class TestEtu {
	
	public static String getMenu(){
		StringBuffer sb = new StringBuffer();
		sb.append("1. Ajouter un étudiant\n");
		sb.append("2. Ajouter un nouveau résultat à tous les étudiants\n");
		sb.append("3. Afficher les étudiants et leur moyenne.\n");
		sb.append("4. Supprimer un étudiant");
		sb.append("0. Quitter\n");
		sb.append("Votre choix : \n");
		String s = new String(sb);
		return s;
	}
	public static void main(String[] args) {

//		 setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);

		char choix;
		do{
			choix = (JOptionPane.showInputDialog(getMenu())).charAt(0);// change str en char
			switch (choix){
			case '0'  :
				System.exit(0);
			case '1'  :
				String nom = JOptionPane. showInputDialog("Nom de l'étudiant : ");
				Etudiant etu = new Etudiant(nom);
			    Etudiant.listeEtu.add(etu);
				break;
			case '2'  :
				for (Etudiant etud : Etudiant.listeEtu) {
					int points = Integer.parseInt(JOptionPane.showInputDialog(
						 etud.toString()+"\nNouveaux points de cet étudiant : "));
					
					etud.ajoutePoint(points);
				}
				break;
			case '3'  :
				JOptionPane.showMessageDialog(null, Etudiant.toStringAll());
				break;
			case '4'  :
			    Etudiant.listeEtu.remove(0);
				break;
			
			}
		} while (choix!='0' );
	}
}