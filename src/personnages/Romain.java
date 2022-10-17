package personnages;
import personnages.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	
	private int nbEquipements = 0;
	
	public Romain(String nom, int force) {
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
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aie !");
		} else {
			parler("J'abandonne...");
		}
		
	}
	public void sEquiper(Equipement equipement){
		String romainNom=nom;
		
		switch (nbEquipements){
		
		case 0 : equipements[nbEquipements]=equipement;
			nbEquipements++;
			if(equipement==Equipement.CASQUE) {
				System.out.println("Le soldat "+romainNom +" s'équipe d'un casque.");
			}
			else {
				System.out.println("Le soldat "+romainNom +" s'équipe d'un bouclier.");

			}
			break;
			
		case 1 :
			if(equipements[0].equals(Equipement.CASQUE)){
				if (equipement.equals(equipements[0])){
					System.out.println("Le soldat"+ romainNom +"possède déjà un casque !");
				}
				else {
				equipements[nbEquipements]=equipement;
				nbEquipements++;
				System.out.println("Le soldat "+ romainNom +" s'équipe d'un bouclier.");
				break;
				}
				
			}else{
				if (equipement.equals(equipements[0])){
					System.out.println("Le soldat"+ romainNom +"possède déjà un bouclier !");}
				else {
				equipements[nbEquipements]=equipement;
				nbEquipements++;
				System.out.println("Le soldat "+ romainNom +" s'équipe d'un bouclier.");
				break;
			}
			}
			
		case 2:
			System.out.println("Le soldat "+ romainNom +" est déjà bien protégé.");
			break;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Romain minus;
		minus = new Romain ("Minus", 6);
		
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
}