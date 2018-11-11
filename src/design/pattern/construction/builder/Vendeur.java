package design.pattern.construction.builder;

public class Vendeur {
	
	protected ConstructeurLiasseVehicule constructeur;
	
	public Vendeur(ConstructeurLiasseVehicule constructeur) {
		this.constructeur = constructeur;
	}
	
	public Liasse construit(String nomClient) {
		this.constructeur.construitBondeCommande(nomClient);
		this.constructeur.construitDemandeImmatriculation(nomClient);
		return this.constructeur.getLiasse();
	}
}
