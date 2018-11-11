package design.pattern.structuration.bridge;

public class FormImmatriculationLuxembourg extends FormulaireImmatriculation {

	public FormImmatriculationLuxembourg(FormulaireImpl implantation) {
		super(implantation);
	}

	@Override
	protected boolean controleSaisie(String plaque) {
		return plaque.length() == 5;
	}

}
