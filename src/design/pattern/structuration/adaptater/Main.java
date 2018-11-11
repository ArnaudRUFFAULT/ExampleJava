package design.pattern.structuration.adaptater;

public class Main {

	public static void main(String[] args) {
		
		Document doc1, doc2;
		doc1 = new DocumentHTML();
		doc1.setContenu("Hello");
		doc1.dessine();
		doc1.imprime();
		System.out.println();
		doc2 = new DocumentPDF();
		doc2.setContenu("Hello");
		doc2.dessine();
		doc2.imprime();

	}

}
