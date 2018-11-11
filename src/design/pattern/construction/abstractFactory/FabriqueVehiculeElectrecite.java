package design.pattern.construction.abstractFactory;

public class FabriqueVehiculeElectrecite implements FabriqueVehicule {

	@Override
	public Automobile creerAutomobile(String modele, String couleur, int puissance, double espace) {
		return new AutomobileElectrecite(modele, couleur, puissance, espace);
	}

	@Override
	public Scooter creerScooter(String modele, String couleur, int puissance) {
		return new ScooterElectricite(modele, couleur, puissance);
	}

}
