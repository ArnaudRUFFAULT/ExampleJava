package design.pattern.comportement.visitor;

public class VisiteurMailingCommercial implements Visiteur {

	@Override
	public void visite(SocieteSansFiliale societe) {
		System.out.println("Envoi d'un mail à " + societe.getNom() + " ,adresse : " + societe.getEmail() + " : Proposition commerciale pour votre Société");

	}

	@Override
	public void visite(SocieteMere societe) {
		System.out.println("Envoi d'un mail à " + societe.getNom() + " ,adresse : " + societe.getEmail() + " : Proposition commerciale pour votre Groupe");
		System.out.println("Envoi d'un courrier à " + societe.getNom() + " ,adresse : " + societe.getAdresse() + " : Proposition commerciale pour votre Groupe");

	}

}
