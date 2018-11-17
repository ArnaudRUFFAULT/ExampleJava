package design.pattern.comportement.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PopupMenu extends Controle {

	Scanner reader = new Scanner(System.in);

	protected List<String> options = new ArrayList<>();

	public PopupMenu(String nom) {
		super(nom);
	}

	@Override
	public void saisie() {

		System.out.println("Saisie de : " + this.nom);
		System.out.println("Valeur actuelle : " + this.getValeur());

		for (int index = 0; index < this.options.size(); index++) {
			System.out.println("-" + index + ")" + this.options.get(index));
		}
		int choix = this.reader.nextInt();
		System.out.println(choix);
		if (choix >= 0 && choix < this.options.size()) {
			System.out.println("hehe");
			boolean change = !(this.getValeur().equals(options.get(choix)));

			if (change) {
				System.out.println(change);
				this.setValeur(this.options.get(choix));
				this.modifie();
			}
		}
	}
	
	public void ajouteOption(String option) {
		this.options.add(option);
	}

}
