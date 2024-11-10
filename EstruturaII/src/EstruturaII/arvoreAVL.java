package EstruturaII;

public class arvoreAVL {

	private class Nodo{
		private int valor;
		private Nodo esquerdo, direito;
		private int alturaEsq, alturaDir;

		public Nodo(int valor) {
			this.valor=valor;
			esquerdo = direito = null;
			alturaEsq=alturaDir=0;
		}
	}
	//Raiz da árvore AVL
	private Nodo raiz;

	//Construtor: Inicializa uma árvore vazia
	public arvoreAVL() {
		raiz=null;
	}

	public void inserir(int valor) {
		raiz = inserirNodo(raiz,valor);
	}

	private Nodo inserirNodo(Nodo atual, int valor) {
		if(atual == null) {
			return new Nodo(valor);
		}
		//inserção na subÁrvore esquerda(valores menores)
		if(valor < atual.valor) {
			atual.esquerdo = inserirNodo(atual.esquerdo, valor);
			atual.alturaEsq = Math.max(atual.esquerdo.alturaEsq, atual.esquerdo.alturaDir)+1;
		}
		//Inserção na subÁrvore direita(valores maiores)
		else if(valor>atual.valor) {
			atual.direito = inserirNodo(atual.direito, valor);
			atual.alturaDir = Math.max(atual.direito.alturaEsq, atual.direito.alturaDir)+1;
		}
		//Após a inserção, verifica se a árvore precisa de balanceamento
		return balancear(atual);
	}

	private Nodo balancear(Nodo atual) {
		int fatorBalanceamento = atual.alturaDir - atual.alturaEsq;
		//Caso de desbalanceamento à direita
		if(fatorBalanceamento == 2) {
			//Se o filho à direita também está desbalanceado para a direita
			//(Rotação simples)
			if(atual.direito.alturaDir >= atual.direito.alturaEsq) {
				return rotacaoEsquerda(atual);
			}else {
				//caso contrário, rotação dupla diretia-esquerda
				atual.direito = rotacaoDireita(atual.direito);
				return rotacaoEsquerda(atual);
			}
		}else if(fatorBalanceamento == -2) {
			//Se o filho à esquerda está desbalanceado a esquerda(rotação simples)
			if(atual.esquerdo.alturaEsq >= atual.esquerdo.alturaDir) {
				return rotacaoDireita(atual);
			}else {
				//caso contrário, rotação dupla esquerda-direita
				atual.esquerdo = rotacaoEsquerda(atual.esquerdo);
				return rotacaoDireita(atual);
			}
		}
		//Retorna o nó atual, balanceando se necessário
		return atual;
	}

	private Nodo rotacaoEsquerda(Nodo raiz) {
		Nodo novaRaiz = raiz.direito; //filho direito se torna a nova raiz
		raiz.direito = novaRaiz.esquerdo;
		novaRaiz.esquerdo = raiz;

		//atualizar alturas
		atualizarAlturas(raiz);
		atualizarAlturas(novaRaiz);

		return novaRaiz;
	}

	private Nodo rotacaoDireita(Nodo raiz) {
		Nodo novaRaiz = raiz.esquerdo; //filho esquerdo se torna a nova raiz
		raiz.esquerdo = novaRaiz.direito;
		novaRaiz.direito=raiz;

		//atualizar alturas
		atualizarAlturas(raiz);
		atualizarAlturas(novaRaiz);

		return novaRaiz;
	}

	private void atualizarAlturas(Nodo nodo) {
		if(nodo != null) {
			nodo.alturaEsq = (nodo.esquerdo == null)? 0: Math.max(nodo.esquerdo.alturaEsq, nodo.esquerdo.alturaDir)+1;
			nodo.alturaDir = (nodo.direito == null)? 0: Math.max(nodo.direito.alturaEsq, nodo.direito.alturaDir)+1;
		}
	}

	public void mostrar() {
		mostrar(raiz);
	}
	public void mostrar(Nodo raiz) {
		if(raiz != null) {
			mostrar(raiz.esquerdo);
			System.out.println(raiz.valor);
			mostrar(raiz.direito);
		}
	}

	public Nodo buscarChaveNodo(Nodo atual,int valor) {
		boolean existe = false;
		if(valor == atual.valor) {
			existe = true;
		}else if(valor > atual.valor) {
			atual.direito = buscarChaveNodo(atual.direito, valor);
		}else if(valor < atual.valor) {
			atual.esquerdo = buscarChaveNodo(atual.esquerdo, valor);
		}else {
			if(atual.esquerdo == null) {
				existe = false;
				return raiz;
			}else if (atual.direito == null){
				return raiz;
			}
		}
		return raiz;
	}


	/*public void buscarChave(int valor) {
		boolean verificacao = buscarChaveNodo(raiz,valor);
		System.out.println(verificacao);
	}
	*/
	
}

