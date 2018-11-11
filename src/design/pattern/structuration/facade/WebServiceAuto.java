package design.pattern.structuration.facade;

import java.util.List;

public interface WebServiceAuto {

	String document(int index);
	List<String> chercheVehicules( int prixMin, int prixMax);
}
