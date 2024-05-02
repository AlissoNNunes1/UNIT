public class Pilha<T> {

	private Celula topo;
	private int tamanho;

	public Pilha() {
		this.topo = null;
		this.tamanho = 0;
	}

	public Pilha(T elemento) {
		this.topo = null;
		this.tamanho = 0;
		this.push(elemento);

	}

	public void push(T elemento) {
		Celula nova = new Celula(elemento);
		if (this.tamanho == 0) {
			topo = nova;
			this.tamanho += 1;
		} else {
			nova.setProximo(topo);
			topo = nova;
			this.tamanho += 1;
		}
	}

	public T recuperaTopo() {
		if (this.tamanho == 0) {
			System.out.println("A lista está vazia!!");
			return null;
		}
		return (T) topo.getElemento();
	}

	public void pop() {
		if (this.tamanho == 0) {
			System.out.println("A lista está vazia!");
		} else {
			topo = topo.getProximo();
			this.tamanho -= 1;
		}
	}

	public boolean pull(T elemento, int posicao) {
		if (this.tamanho == 0) {
			System.out.println("A pilha está vazia!!");
			return false;
		} else if (posicao < 0 | posicao > tamanho) {
			System.out.println("Posição inválida");
			return false;
		} else {
			Iterador it = new Iterador(this.topo);
			int i = 0;
			while (it.hasNext()) {
				if (posicao == i) {
					it.getAtual().setElemento(elemento);
				}
				i++;
			}
			return false;
		}
	}

	public boolean existeDado(T elemento) {
		if (this.tamanho == 0) {
			System.out.println("A pilha está vazia!!");
			return false;
		} else {

			Iterador it = new Iterador(this.topo);
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
		this.topo = null;
	}

	public Celula getTopo() {
		return topo;
	}
	
}
