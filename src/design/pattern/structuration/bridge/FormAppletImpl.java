package design.pattern.structuration.bridge;

import java.util.Scanner;

public class FormAppletImpl implements FormulaireImpl {
	
	Scanner reader = new Scanner(System.in);

	@Override
	public void dessineTexte(String texte) {
		System.out.println("Applet : " + texte);

	}

	@Override
	public String gereZoneSaisie() {
		return this.reader.next();
	}

}
