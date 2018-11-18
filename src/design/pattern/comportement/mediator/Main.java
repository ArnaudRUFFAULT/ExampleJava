package design.pattern.comportement.mediator;

public class Main {

	public static void main(String[] args) {
		
		//NE FONCTIONNE PAS...
		
		PopupMenu menu = new PopupMenu("Coemprunter");
		menu.ajouteOption("sans coemprunteur");
		menu.ajouteOption("avec coemprunteur");
		
		Bouton bouton = new Bouton("OK");
		
		Formulaire formulaire = new Formulaire();
		formulaire.ajouteControle(new ZoneSaisie("Nom"));
		formulaire.ajouteControle(new ZoneSaisie("Prénom"));
		formulaire.ajouteControle(menu);
		formulaire.ajouteControle(bouton);
		formulaire.ajouteControleCoemprunteur(new ZoneSaisie("Nom du coemprunteur"));
		formulaire.ajouteControleCoemprunteur(new ZoneSaisie("Prénom du coemprunteur"));
		
		formulaire.saisie();
		
		

	}

}
