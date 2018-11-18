package design.pattern.comportement.state;

import java.util.ArrayList;
import java.util.List;

public class Commande {

	protected List<Produit> produits = new ArrayList<>();
	
	protected EtatCommande etatCommande;
	
	public Commande() {
		this.etatCommande = new CommandeEnCours(this);
	}
	
	public void ajouteProduit(Produit produit) {
		this.etatCommande.ajouteProduit(produit);
	}
	
	public void retireProduit(Produit produit) {
		this.etatCommande.retireProduit(produit);
	}
	
	public void efface() {
		this.etatCommande.efface();
	}
	
	public void etatSuivant() {
		this.etatCommande = this.etatCommande.etatSuivant();
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public EtatCommande getEtatCommande() {
		return etatCommande;
	}
	
	public void affiche() {
		System.out.println("Contenu de la commande :");
		for(Produit produit : this.produits) {
			produit.affiche();
		}
		System.out.println();
	}
}
