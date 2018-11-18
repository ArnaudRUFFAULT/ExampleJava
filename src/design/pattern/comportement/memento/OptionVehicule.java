package design.pattern.comportement.memento;

import java.util.ArrayList;
import java.util.List;

public class OptionVehicule {

	protected String nom;
	
	protected List<OptionVehicule> optionsCompatibles = new ArrayList<>();

	public OptionVehicule(String nom) {
		this.nom = nom;
	}
	
	public void ajouteOptionIncompatible(OptionVehicule optionIncompatible) {
		
		if(!this.optionsCompatibles.contains(optionIncompatible)) {
			this.optionsCompatibles.add(optionIncompatible);
			optionIncompatible.ajouteOptionIncompatible(this);
		}
	}
	
	public List<OptionVehicule> getOptionsIncompatibles(){
		return this.optionsCompatibles;
	}
	
	public void affiche() {
		System.out.println("option : " + this.nom);
	}
}
