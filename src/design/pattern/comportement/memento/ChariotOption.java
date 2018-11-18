package design.pattern.comportement.memento;

import java.util.ArrayList;
import java.util.List;

public class ChariotOption {

	protected List<OptionVehicule> options = new ArrayList<>();
	
	public Memento ajouteOption(OptionVehicule optionVehicule) {
		
		MementoImpl resultat = new MementoImpl();
		resultat.setEtat(this.options);
		this.options.removeAll(optionVehicule.getOptionsIncompatibles());
		this.options.add(optionVehicule);
		return resultat;
	}
	
	public void annule(Memento memento) {
		
		MementoImpl mementoImplInstance;
		
		try{
			mementoImplInstance = (MementoImpl) memento;
		} catch(ClassCastException e) {
			return;
		}
		
		this.options = mementoImplInstance.getEtat();
	}
	
	public void affiche() {
		System.out.println("Contenu du chariot des options");
		for(OptionVehicule option : this.options) {
			option.affiche();
		}
		System.out.println();
	}
}
