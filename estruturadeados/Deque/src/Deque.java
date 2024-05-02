public class Deque<T> {

	private Celula inicio, fim;
	private int tamanho;

	public Deque() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}

	public Deque(T elemento) {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
		this.adicionaInicio(elemento);

	}

	public void adicionaInicio(T elemento) {
		Celula nova = new Celula(elemento);
		if (this.tamanho == 0) {
			inicio = fim = nova;
			this.tamanho += 1;
		} else {
			nova.setProximo(inicio);
			nova.setAnterior(null);
			inicio.setAnterior(nova);
			inicio = nova;
			this.tamanho += 1;
		}
	}

	public void adicionaFim(T elemento) {
		Celula nova = new Celula(elemento);
		if (this.tamanho == 0) {
			this.adicionaInicio(elemento);
		} else {
			nova.setAnterior(fim);
			nova.setProximo(null);
			fim.setProximo(nova);
			fim = nova;
			this.tamanho += 1;
		}
	}

	public Object removeInicio() {
		Object auxiliar = inicio.getElemento();
		if (this.tamanho == 0) {
			System.out.println("O Deque está vazio!");
		} else if (inicio == fim) {
			inicio = fim = null;
			this.tamanho -= 1;
		} else {
			inicio = inicio.getProximo();
			inicio.setAnterior(null);
			this.tamanho -= 1;
		}
		return auxiliar;
	}

	public Object removeFim() {
		Object auxiliar = fim.getElemento();
		if (this.tamanho == 0) {
			System.out.println("O Deque está vazio!");
		} else if (inicio == fim) {
			inicio = fim = null;
			this.tamanho -= 1;
		} else {
			fim = fim.getAnterior();
			fim.setProximo(null);
			this.tamanho -= 1;
		}
		return auxiliar;
	}

	public boolean existeDado(T elemento) {
		if (this.tamanho == 0) {
			System.out.println("O deque está vazio!!");
			return false;
		} else {

			Iterador it = new Iterador(this.inicio);

			while (it.hasNext()) {
				if (elemento.equals(it.next())) {
					return true;
				}
			}
			return false;
		}
	}

	public int tamanho() {
		return this.tamanho;
	}

	public void imprimeDeque() {
		Iterador it = new Iterador(this.inicio);
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

	public void limpa() {
		this.inicio = null;
		this.fim = null;
	}

}
