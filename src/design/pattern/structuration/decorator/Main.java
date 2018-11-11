package design.pattern.structuration.decorator;

public class Main {

	public static void main(String[] args) {
		
		Patisserie gateau = new Gateau("gateau au yahourt", 5.0);
		
		System.out.println(gateau + " : " + gateau.calculerPrix());
		System.out.println();
		
		Patisserie gateau2 = new SucreGlaceDecorator(
								new Gateau("Ile flottante", 6.5));
		
		System.out.println(gateau2 + " : " + gateau2.calculerPrix());
		System.out.println();
		
		Patisserie gateau3 = new SucreGlaceDecorator(
								new BougiesDecorator(
									new Gateau("Baba au rhum", 7.6)));
		
		System.out.println(gateau3 + " : " + gateau3.calculerPrix());
		System.out.println();
		
		Patisserie gateau4 = new SucreGlaceDecorator(
								new CafeDecorator(
									new BougiesDecorator(
										new Gateau("Paris-Brest", 4.31))));
		
		System.out.println(gateau4 + " : " + gateau4.calculerPrix());
		System.out.println();
	}

}
