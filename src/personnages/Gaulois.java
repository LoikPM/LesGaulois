package personnages;

import personnages.Romain;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de "
				+ romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	
	
	public void boirePotion(int forcePotion) {
		this.parler("Merci Druide, je sens que ma force est " + forcePotion + " décuplée !");
		force = force * forcePotion;
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force
				+ ", effetPotion=" + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		
		Gaulois asterix;
		asterix = new Gaulois ("Asterix", 8);
		Romain minus;
		minus = new Romain ("Minus", 4);
		
		System.out.println(asterix);
		
		asterix.parler("Bonjour, je suis Asterix, et je vais frapper Minus");
		
		asterix.frapper(minus);
		
		asterix.boirePotion(3);
		
		System.out.println(asterix);


	}
}