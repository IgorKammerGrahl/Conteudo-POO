package AulaAssociacoes;

public class Main {

	public static void main(String[] args) {
		Documento doc = new Documento();
		doc.setTexto("IFC POO1");
		System.out.println(doc);
		
		Impressora imp = new Impressora();
		imp.imprimir(doc);

	}

}
