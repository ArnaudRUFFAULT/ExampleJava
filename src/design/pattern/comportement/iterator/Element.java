package design.pattern.comportement.iterator;

public abstract class Element {

	protected String description;

	public Element(String description) {
		this.description = description;
	}
	
	public boolean motCleValide(String motCle) {
		return this.description.indexOf(motCle) != -1;
	}
}
