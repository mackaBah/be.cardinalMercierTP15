package be.cardinalmercier.tp15;

public class TestCompteurs{
	public static void main(String[] args) {
		MesConteurs[] compteurs = {
				new MesConteurs("cpt1"),
				new MesConteurs("cpt2"),
				new MesConteurs("cpt3"),
				new MesConteurs("cpt4")
		};
		for (int i = 0; i < compteurs.length; i++) {
			(new Thread(compteurs[i])).start();
		}
	}
}