package design.pattern.structuration.facade;

public class ComposantGestionDocument implements GestionDocument {

	@Override
	public String document(int index) {
		return "Document numéro " + index;
	}

}
