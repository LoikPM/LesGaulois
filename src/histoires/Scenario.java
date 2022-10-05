package histoires;
import personnages.Romain;
import personnages.Gaulois;
import personnages.Druide;

public class Scenario {

	public static void main(String[] args) {
		Romain minus;
		minus = new Romain ("Minus", 44);
		Gaulois asterix;
		asterix = new Gaulois ("Asterix", 8);
		Gaulois obelix;
		obelix = new Gaulois("Obélix", 10);
		Druide pano;
		pano = new Druide("Panoramix", 5, 10);
		
		pano.parler("Je vais aller préparer une petite potion");
		pano.preparerPotion();
		pano.booster(obelix);
		obelix.parler("Par bénélos, ce n'est pas juste !");
		pano.booster(asterix);
		
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU....");
		
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}
}