public class Fila<T> {

	private Celula primeiro, ultimo;
	private int tamanho;

	public Fila() {
		this.primeiro = null;
		this.ultimo = null;
		this.tamanho = 0;
	}

	public Fila(T elemento) {
		this.primeiro = null;
		this.ultimo = null;
		this.tamanho = 0;
		this.enfileirar(elemento);
	}

	public Object Recupera() {
		return primeiro.getElemento();
	}

	public void enfileirar(T elemento) {
		Celula nova = new Celula(elemento);
		if (this.tamanho == 0) {
			primeiro = ultimo = nova;
		} else {
			ultimo.setProximo(nova);
			ultimo = nova;
		}
		this.tamanho += 1;
	}

	public Object desenfileirar() {
		if (this.tamanho == 0) {
			System.out.println("A fila está vazia!");
			return null;
		} else if (primeiro == ultimo) {
			Object aux = primeiro.getElemento();
			primeiro = ultimo = null;
			this.tamanho -= 1;
			return aux;
		} else {
			Object aux = primeiro.getElemento();
			primeiro = primeiro.getProximo();
			this.tamanho -= 1;
			return aux;
		}
	}

	public boolean existeDado(T elemento) {
		if (this.tamanho == 0) {
			System.out.println("A fila está vazia!!");
			return false;
		} else {

			Iterador it = new Iterador(this.primeiro);
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
		this.primeiro = null;
		this.ultimo = null;
	}

}
