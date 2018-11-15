package design.pattern.comportement.iterator;

public class CatalogueVehicule extends Catalogue<Vehicule, IterateurVehicule> {

	public CatalogueVehicule() {
		this.contenu.add(new Vehicule("vehicule bon marche"));
		this.contenu.add(new Vehicule("petit vehicule bon marche"));
		this.contenu.add(new Vehicule("vehicule grande qualité"));
	}
		
		
	@Override
	protected IterateurVehicule creeIterateur() {
		return new IterateurVehicule();
	}

}
