package design.pattern.construction.prototype;

public class Main {

	public static void main(String[] args) {
		
		//Initialisation de la liasse vierge
		LiasseVierge liasseVierge = LiasseVierge.Instance();
		liasseVierge.ajoute(new BonDeCommande());
		liasseVierge.ajoute(new CertificatCession());
		liasseVierge.ajoute(new DemandeImmatriculation());
		
		//Création d'une nouvelle liasse pour 2 clients
		LiasseClient liasseClient1 = new LiasseClient("Arnaud");
		LiasseClient liasseClient2 = new LiasseClient("Ronan");
		
		liasseClient1.affiche();
		liasseClient2.affiche();
		

	}

}
