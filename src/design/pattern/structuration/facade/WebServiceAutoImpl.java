package design.pattern.structuration.facade;

import java.util.List;

public class WebServiceAutoImpl implements WebServiceAuto {
	
	protected Catalogue catalogue = new ComposantCatalogue();
	
	protected GestionDocument gestionDocument = new ComposantGestionDocument();

	@Override
	public String document(int index) {
		return this.gestionDocument.document(index);
	}

	@Override
	public List<String> retrouveVehicules(int prixMin, int prixMax) {
		return this.catalogue.retrouveVehicules(prixMin, prixMax);
	}

}
