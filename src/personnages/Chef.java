package personnages;

import villages.Village;

public class Chef {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private static Village village;
	public Chef(String nom, int force, int effetPotion, Village village) {
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
		this.village = village;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}
	private String prendreParole() {
		return "Le chef " + nom + " du village de " + village.getNom() + " : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " +
				romain.getNom());
		romain.recevoirCoup(force / 3);
	}

public static void main(String[] args) {
	Chef philippe;
	Village village;
	village = new Village();
	philippe = new Chef("Philippe", 10, 6, village);
	
	System.out.println(philippe.getNom());
	
	philippe.parler("Bonjour, je suis Philippe");	
}}