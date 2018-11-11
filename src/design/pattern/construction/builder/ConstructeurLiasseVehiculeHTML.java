package design.pattern.construction.builder;

public class ConstructeurLiasseVehiculeHTML extends ConstructeurLiasseVehicule {

	public ConstructeurLiasseVehiculeHTML() {
		this.liasse = new LiasseHTML();
	}

	@Override
	public void construitBondeCommande(String nomClient) {

		String document;
		document = "<HTML>Bon de commande Client : " + nomClient + "</HTML>";
		this.liasse.ajouterDocument(document);

	}

	@Override
	public void construitDemandeImmatriculation(String nomDemandeur) {
		
		String document;
		document = "<HTML>Demande d' immatriculation Demandeur : " + nomDemandeur + "</HTML>";
		this.liasse.ajouterDocument(document);

	}

}
