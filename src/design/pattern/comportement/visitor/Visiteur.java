package design.pattern.comportement.visitor;

public interface Visiteur {

	void visite(SocieteSansFiliale societe);
	void visite(SocieteMere societe);
}
