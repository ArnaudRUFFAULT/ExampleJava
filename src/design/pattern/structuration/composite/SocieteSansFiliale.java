package design.pattern.structuration.composite;

public class SocieteSansFiliale extends Societe {

	@Override
	public double calculeCoutEntretien() {
		return this.nbrVehicules * SocieteSansFiliale.coutUnitVehicule;
	}

	@Override
	public boolean ajouteFiliale(Societe filiale) {
		return false;
	}

}
