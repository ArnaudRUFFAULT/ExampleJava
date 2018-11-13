package design.pattern.structuration.proxy;

public class AnimationProxy implements Animation {
	
	protected Film film = null;
	
	protected String photo = "affichage de la photo";

	@Override
	public void dessine() {
		
		if( film != null ) {
			this.film.dessine();
		} else {
			this.dessine(this.photo);
		}

	}

	@Override
	public void clic() {
		
		if(film == null) {
			this.film = new Film();
			this.film.charge();
		}
		
		this.film.joue();

	}
	
	public void dessine(String photo) {
		System.out.println(photo);
	}

}
