package design.pattern.comportement.visitor;

public class Main {

	public static void main(String[] args) {
		
		Societe societe1 = new SocieteSansFiliale("Sony", "sony@mail.com", "95 rue des lilas");
		Societe societe2 = new SocieteSansFiliale("Nintendo", "contact@nintendo.ja", "23 rue des samurai");
		
		Societe groupe1 = new SocieteMere("GameVid", "gamevid@hotmail.fr", "101 avenue du piree");
		groupe1.ajouteFiliale(societe1);
		groupe1.ajouteFiliale(societe2);
		
		Societe societe3 = new SocieteSansFiliale("Decathlon", "dec@thlon", "98 avenue charles");
		
		Societe groupe2 = new SocieteMere("JeuVideo&Sport", "jvs@gmail.com", "563 avenue des apothicaires");
		groupe2.ajouteFiliale(groupe1);
		groupe2.ajouteFiliale(societe3);

		groupe2.accepteVisiteur(new VisiteurMailingCommercial());
	}

}
