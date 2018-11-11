package design.pattern.structuration.bridge;

import java.util.Scanner;

public class FormHTMLImpl implements FormulaireImpl {
	
	Scanner reader = new Scanner(System.in);

	@Override
	public void dessineTexte(String texte) {
		System.out.println("HTML : " + texte);

	}

	@Override
	public String gereZoneSaisie() {
		return this.reader.next();
	}

}
