package design.pattern.structuration.facade;

import java.util.List;

public interface Catalogue {

	List<String> retrouveVehicules( int prixMin, int prixMax);
}
