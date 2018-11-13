package design.pattern.structuration.flyweight;

import java.util.Map;
import java.util.TreeMap;

public class FabriqueOption {

	protected Map<String, OptionVehicule> options = new TreeMap<>();
	
	public OptionVehicule getOption(String nom) {
		
		OptionVehicule resultat;
		
		if(this.options.containsKey(nom)) {
			
			return options.get(nom);
		} else {
			resultat = new OptionVehicule(nom);
			options.put(nom, resultat);
		}
		
		return resultat;
	}
}
