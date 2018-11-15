package design.pattern.comportement.iterator;

import java.util.List;

/**
 * <TElement extends Element> Veut dire que la classe Iterateur va manipuler des objets de type inconnu, 
 * la seule chose que l'on sait c'est que ces objets héritent de la classe Element,
 * Ce qui nous permet tout de meme d'acceder aux attributs et méthodes de la classe Element sur les TElement
 */
public abstract class Iterateur <TElement extends Element> {
	
	protected String motCleRequete;
	
	protected int index;
	
	protected List<TElement> contenu;
	
	public void setMotRequete(String motCleRequete, List<TElement> contenu) {
		this.motCleRequete = motCleRequete;
		this.contenu = contenu;
	}
	
	public void debut() {
		
		this.index = 0;
		int taille = this.contenu.size();
		
		while(index < taille && !this.contenu.get(index).motCleValide(this.motCleRequete)) {
			this.index++;
		}
	}
	
	public void suivant() {
		int taille = this.contenu.size();
		this.index++;
		while(index < taille && !this.contenu.get(index).motCleValide(this.motCleRequete)) {
			this.index++;
		}
	}
	
	public TElement item() {
		if(this.index < this.contenu.size()) {
			return this.contenu.get(this.index);
		}
		return null;
	}
	

}
