package design.pattern.construction.builder;

public abstract class ConstructeurLiasseVehicule {

	protected Liasse liasse;
	
	public abstract void construitBondeCommande(String nomClient);
	
	public abstract void  construitDemandeImmatriculation(String nomDemandeur);
	
	public Liasse getLiasse() {
		return this.liasse;
	}
}
