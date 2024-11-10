package aulaDia21;

public class ClasseFilho extends ClassePai {

	private String nome;
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



	public String Imprimir() {
		String saida = "Nome: " + nome;
		return saida;
	}
	
}
