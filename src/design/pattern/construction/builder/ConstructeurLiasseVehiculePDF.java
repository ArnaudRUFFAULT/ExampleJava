package design.pattern.construction.builder;

public class ConstructeurLiasseVehiculePDF extends ConstructeurLiasseVehicule {
	
	public ConstructeurLiasseVehiculePDF() {
		this.liasse = new LiassePDF();
	}

	@Override
	public void construitBondeCommande(String nomClient) {
		
		String document;
		document = "<PDF>Bon de commande Client : " + nomClient + "</PDF>";
		this.liasse.ajouterDocument(document);

	}

	@Override
	public void construitDemandeImmatriculation(String nomDemandeur) {
		
		String document;
		document = "<PDF>Demande d' immatriculation Demandeur : " + nomDemandeur + "</PDF>";
		this.liasse.ajouterDocument(document);

	}

}
