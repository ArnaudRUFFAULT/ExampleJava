package design.pattern.construction.abstractFactory;

public class Main {

	public static void main(String[] args) {
		
		FabriqueVehicule fabrique = new FabriqueVehiculeElectrecite();
		Automobile auto = fabrique.creerAutomobile("peugeot", "bleu", 500, 85.36);
		auto.afficheCaracteristique();
		
		FabriqueVehicule fabrique2 = new FabriqueVehiculeEssence();
		Scooter scoot = fabrique2.creerScooter("renault", "rouge", 125);
		scoot.afficheCaracteristique();
	}

}
