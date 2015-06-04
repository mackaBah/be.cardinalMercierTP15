package be.cardinalmercier.tp15;

public class MesConteurs implements Runnable{
	protected String nom;
	protected int max;
	public MesConteurs(String nom, int max) {
		this.nom = nom;
		this.max = max;
	}
	public MesConteurs(String nom) {
		this(nom, 10);
	}
	public void run() {
		for (int i = 1; i <= max; i++) {
			System.out.println(nom + " : " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("*** " + nom + " a fini de compter jusqu'à " + max);
	}
}

