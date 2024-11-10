package EstruturaII;

public class arvoreBinaria {
	private class Nodo {
		private int chave;
		private Nodo dir, esq;

		public Nodo(int item) {
			this.chave = item;
			dir = esq = null;
		}
	}
	Nodo raiz;
	public arvoreBinaria() {
		raiz = null;
	}

	public void inserir(int chave){
		raiz = inserirDado(raiz, chave);
	}

	private Nodo inserirDado(Nodo raiz, int chave) {
		if(raiz == null) {
			raiz=new Nodo(chave);
			return raiz;
		}
		if(chave < raiz.chave)
			raiz.esq = inserirDado(raiz.esq, chave);
		else if(chave > raiz.chave)
			raiz.dir = inserirDado(raiz.dir, chave);

		return raiz;
	}

	public void mostrarEmOrdemCrescente() {
		mostrarCrescente(raiz);
	}

	private void mostrarCrescente(Nodo raiz) {
		if(raiz != null) {
			mostrarCrescente(raiz.dir);
			System.out.println(raiz.chave);
			mostrarCrescente(raiz.esq);
		}
	}

	public void remover(int chave) {
		raiz = removerNodo(raiz, chave);
	}

	private Nodo removerNodo(Nodo raiz, int chave) {
		if(raiz == null) {
			//Nó não encontrado, não precisa fazer nada
			return null;
		}
		if(chave < raiz.chave) {
			//Chave a ser removida está à esquerda
			raiz.esq = removerNodo(raiz.esq, chave);
		}else if(chave > raiz.chave) {
			//A chave a ser removida está à direita
			raiz.dir = removerNodo(raiz.dir, chave);
		}else {
			//encontramos o nó a ser removido
			if(raiz.esq == null) {
				//Caso em que o nó não possui filho à esquerda
				return raiz.dir;
			}else if (raiz.dir == null){
				//Caso em que o nó não possui filho à direita
				return raiz.esq;
			}else {
				//Caso em que o nó possui ambos os filhos
				//Encontramos o nó sucessor na subárvore direita
				Nodo sucessor = encontrarSucessor(raiz.dir);
				//substituimos o valor do nó a ser removido pelo valor do sucessor
				raiz.chave = sucessor.chave;
				//Remover o nó sucessor da subárvore da direita
				raiz.dir = removerNodo(raiz.dir, sucessor.chave);
			}
		}
		return raiz;
	}

	private Nodo encontrarSucessor(Nodo nodo) {
		while(nodo.esq != null) {
			nodo = nodo.esq;
		}
		return nodo;
	}

	public int maiorChave(Nodo nodo) {
		while(nodo.dir != null) {
			nodo = nodo.dir;
		}
		return nodo.chave;
	}
	


	public void mostrar(int chave) {
		raiz = mmostrarFolhas(raiz, chave);
	}
	
	private Nodo mmostrarFolhas(Nodo raiz, int chave) {
		if(raiz == null) {
			return null;
		}
		if(chave < raiz.chave) {
			raiz.esq = mmostrarFolhas(raiz.esq, chave);
		}else if(chave > raiz.chave) {
			raiz.dir = mmostrarFolhas(raiz.dir, chave);
		}else {
			if(raiz.esq == null) {
				return raiz;
			}else if (raiz.dir == null){
				return raiz;
			}
		}
		return raiz;
	}
	
	public void mostrarFolhas() {
		mostrarFolhas(raiz);
	}
	private void mostrarFolhas(Nodo raiz) {
		if(raiz != null) {
			mostrarFolhas(raiz.dir);
			if(raiz.esq == null && raiz.dir == null) {
				System.out.println(raiz.chave);
			}
			mostrarFolhas(raiz.esq);
		}
	}
	
	public void mostrarPares() {
		mostrarPares(raiz);
	}
	private void mostrarPares(Nodo raiz) {
		if(raiz != null) {
			mostrarPares(raiz.dir);
			if(raiz.chave%2 == 0) {
				System.out.println(raiz.chave);
			}
			mostrarPares(raiz.esq);
		}
	}
}