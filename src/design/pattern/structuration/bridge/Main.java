package design.pattern.structuration.bridge;

public class Main {

	public static void main(String[] args) {
		FormulaireImmatriculation form1 = new FormImmatriculationLuxembourg(new FormHTMLImpl());
		form1.affiche();
		String plaque = form1.implantation.gereZoneSaisie();
		if(form1.controleSaisie(plaque)){
			form1.setContenu(plaque);
			form1.genereDocument();
		}
		
		System.out.println();
		
		FormulaireImmatriculation form2 = new FormImmatriculationFrance(new FormAppletImpl());
		form2.affiche();
		String plaque2 = form1.implantation.gereZoneSaisie();
		if(form2.controleSaisie(plaque2)){
			form2.setContenu(plaque2);
			form2.genereDocument();
		}

	}

}
