package design.pattern.structuration.proxy;

public class Main {

	public static void main(String[] args) {
		
		Animation animation = new AnimationProxy();
		animation.dessine();
		animation.clic();
		animation.dessine();

	}

}
