package design.pattern.structuration.composite;

import java.util.ArrayList;
import java.util.List;

public class SocieteMere extends Societe {
	
	protected List<Societe> filiales = new ArrayList<>();

	@Override
	public double calculeCoutEntretien() {
		double cout = 0.0;
		for(Societe filiale : this.filiales) {
			cout += filiale.calculeCoutEntretien();
		}
		return cout + this.nbrVehicules * SocieteMere.coutUnitVehicule;
	}

	@Override
	public boolean ajouteFiliale(Societe filiale) {
		return this.filiales.add(filiale);
	}

}
