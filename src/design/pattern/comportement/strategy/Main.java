package design.pattern.comportement.strategy;

public class Main {

	public static void main(String[] args) {
		
		Personnage perso1 = new Guerrier();
		perso1.description();
		perso1.attaquer();
		
		System.out.println();
		
		Personnage perso2 = new Mage();
		perso2.description();
		perso2.attaquer();
		
		System.out.println();
		
		perso1.setCombat(new BatonMagique());
		perso1.attaquer();

	}

}
