package design.pattern.construction.abstractFactory;

public interface FabriqueVehicule {
	
	Automobile creerAutomobile(String modele, String couleur, int puissance, double espace);
	
	Scooter creerScooter(String modele, String couleur, int puissance);

}
