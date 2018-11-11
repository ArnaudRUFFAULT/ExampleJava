package design.pattern.structuration.composite;

public abstract class Societe {

	protected static double coutUnitVehicule = 5.0;
	protected int nbrVehicules;
	
	public void ajouteVehicule() {
		this.nbrVehicules++;
	}
	
	public abstract double calculeCoutEntretien();
	
	public abstract boolean ajouteFiliale(Societe filiale);
}
