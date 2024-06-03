public class ListaSimples<T> {

	private Celula inicio, fim;
	private int tamanho;

	public ListaSimples() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}

	public ListaSimples(T elemento) {
		this();
		this.adicionaInicio(elemento);

	}

	public void adicionaInicio(T elemento) {
		Celula nova = new Celula(elemento);
		if (this.tamanho == 0) {
			inicio = fim = nova;
			this.tamanho += 1;
		} else {
			nova.setProximo(inicio);
			inicio = nova;
			this.tamanho += 1;
		}
	}

	public T Recupera(int posicao) {

		if (this.tamanho == 0) {

			System.out.println("A lista está vazia!!");
			return null;

		} else if (posicao < 0 || posicao >= this.tamanho) {

			System.out.println("A Posição " + posicao + " é Inválida!");
			return null;

		} else {

			Iterador it = new Iterador(this.inicio);
			int i = 0;
			while (it.hasNext()) {
				if (i != posicao) {
					it.next();
					i++;
				} else {
					break;
				}
			}

			return (T) it.getAtual().getElemento();
		}
	}

	public void adicionaPosicao(T elemento, int posicao) {
		if (posicao < 0 || posicao >= this.tamanho) {
			System.out.println("Posição Inválida!");
		} else if (posicao == 0) {
			this.adicionaInicio(elemento);
		} else if (posicao == this.tamanho) {
			this.adicionaFim(elemento);
		} else {
			Celula nova = new Celula(elemento);
			Iterador it = new Iterador(this.inicio);
			int i = 0;
			while (it.hasNext()) {
				if (i == posicao - 1) {
					nova.setProximo(it.getAtual().getProximo());
					it.getAtual().setProximo(nova);
					this.tamanho += 1;
					break;
				} else {
					it.next();
					i++;
				}
			}
		}}
		
	@SuppressWarnings("unchecked")
	public void trocaPosicao(int posicao1, int posicao2) {
		if (this.tamanho == 0) {
			System.out.println("A lista está vazia!!");
		} else if (posicao1 < 0 || posicao1 >= this.tamanho || posicao2 < 0 || posicao2 >= this.tamanho) {
			System.out.println("Posição Inválida!");
		} else {
			T elemento1 = this.Recupera(posicao1);
			T elemento2 = this.Recupera(posicao2);
			Iterador it = new Iterador(this.inicio);
			int i = 0;
			while (it.hasNext()) {
				if (i == posicao1) {
					it.getAtual().setElemento(elemento2);
				} else if (i == posicao2) {
					it.getAtual().setElemento(elemento1);
				}
				it.next();
				i++;
			}
		}
	}

	public void adicionaFim(T elemento) {
		Celula nova = new Celula(elemento);
		if (this.tamanho == 0) {
			this.adicionaInicio(elemento);
		} else {
			fim.setProximo(nova);
			fim = nova;
			this.tamanho += 1;
		}
	}

	public void removeInicio() {

		if (this.tamanho == 0) {
			System.out.println("A lista está vazia!");

		} else if (inicio == fim) {

			inicio = fim = null;
			this.tamanho -= 1;

		} else {

			inicio = inicio.getProximo();
			this.tamanho -= 1;
		}
	}

	public void removeFim() {
		if (this.tamanho == 0) {
			System.out.println("A lista está vazia!");

		} else if (inicio == fim) {
			inicio = fim = null;
			this.tamanho -= 1;
		} else {
			Iterador it = new Iterador(this.inicio);
			int i = 1;
			while (it.hasNext()) {
				if (i==tamanho-1) {
					this.fim = it.getAtual();
					it.getAtual().setProximo(null);
					break;
				} else {
					i++;
				}
			}
			this.tamanho -= 1;
		}
	}

	public void removePosicao(int posicao) {
		if (this.tamanho == 0) {
			System.out.println("A lista está vazia!");
		} else if (inicio == fim) {
			inicio = fim = null;
			this.tamanho -= 1;
		} else if(posicao== 0 && tamanho ==2){
			this.removeInicio();
		} else if(posicao == (tamanho-1)) {
			this.removeFim();
		}
			else {
			Iterador it = new Iterador(this.inicio);
			int i = 0;
			while (it.hasNext()) {
				if (i==posicao-2) {
					Celula atual = it.getAtual();
					it.next();
					atual.setProximo(it.getAtual().getProximo());
					break;
				} else {
					i++;
				}
			}
			this.tamanho -= 1;
		}
	}
	
	public boolean existeDado(T elemento) {
		if (this.tamanho == 0) {
			System.out.println("A lista está vazia!!");
			return false;
		} else {

			Iterador it = new Iterador(this.inicio);
			int i = 0;
			while (it.hasNext()) {
				if (elemento.equals(it.next())) {
					return true;
				} else {
					i++;
				}
			}
			return false;
		}
	}

	public int tamanho() {
		return this.tamanho;
	}

	public void limpa() {
		this.inicio = null;
		this.fim = null;
	}

	public void adiciona(int i, String recupera) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'adiciona'");
	}

}
