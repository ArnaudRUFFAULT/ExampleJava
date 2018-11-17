package design.pattern.comportement.mediator;

import java.util.ArrayList;
import java.util.List;

public class Formulaire {

	protected List<Controle> controles = new ArrayList<>();
	protected List<Controle> controlesCoemprunteur = new ArrayList<>();
	protected PopupMenu menuCoemprunteur;
	protected Bouton boutonOK;
	protected boolean enCours = true;

	public void controleModifie(Controle controle) {

		if (controle == this.menuCoemprunteur) {
			if(controle.getValeur().equals("avec coemprunteur")) {
				for (Controle elementCoemprunteur : this.controlesCoemprunteur) {
					elementCoemprunteur.saisie();
				}
			}
			
		}

		if (controle == boutonOK) {
			this.enCours = false;
		}
	}
	
	public void saisie() {
		
		while(true) {
			
			for(Controle controle : this.controles) {
				controle.saisie();
				if(!this.enCours) {
					return;
				}
			}
		}
	}

	public void ajouteControle(Controle controle) {
		this.controles.add(controle);
		controle.setDirecteur(this);
	}

	public void ajouteControleCoemprunteur(Controle controle) {
		this.controlesCoemprunteur.add(controle);
		controle.setDirecteur(this);
	}

	public void setMenuCoemprunteur(PopupMenu menuCoemprunteur) {
		this.menuCoemprunteur = menuCoemprunteur;
	}

	public void setBoutonOK(Bouton boutonOK) {
		this.boutonOK = boutonOK;
	}
}
