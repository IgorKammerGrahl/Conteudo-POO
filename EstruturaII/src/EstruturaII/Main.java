package EstruturaII;

public class Main {

	public static void main(String[] args) {
		ArvoreRubroNegra arvore = new ArvoreRubroNegra();
		arvore.inserir(3);
		arvore.inserir(4);
		arvore.inserir(7);
		arvore.inserir(9);
		arvore.inserir(10);

		System.out.println("------------------");
		arvore.mostrarVermelhosEPretos();
	}
}
