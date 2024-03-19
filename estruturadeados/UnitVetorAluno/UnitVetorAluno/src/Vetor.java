public class Vetor {

	// Declarando um vetor de Aluno com 100 posições
	private Aluno[] vetorDeAlunos = new Aluno[100];
	private int totalAlunos = 0;

	public void adiciona(Aluno aluno) {
		this.garantaEspaco();
		this.vetorDeAlunos[this.totalAlunos] = aluno;
		this.totalAlunos++;
	}

	public void adiciona(Aluno aluno, int posicao) {
		this.garantaEspaco();
		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		// deslocando elementos do final ate posicao desejada
		for (int x = this.totalAlunos - 1; x >= posicao; x--) {
			this.vetorDeAlunos[x + 1] = this.vetorDeAlunos[x];
		}
		this.vetorDeAlunos[posicao] = aluno;
		this.totalAlunos++;
	}

	private void garantaEspaco() {
		if (this.totalAlunos == vetorDeAlunos.length) {
			Aluno[] novoVetorDeAlunos = new Aluno[vetorDeAlunos.length * 2];
			for (int x = 0; x < this.vetorDeAlunos.length; x++) {
				novoVetorDeAlunos[x] = this.vetorDeAlunos[x];
			}
			this.vetorDeAlunos = novoVetorDeAlunos;
		}
	}

	public void remove(int posicao) {
		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		// deslocando elementos da posicao excluida até o final
		for (int x = posicao; x < this.totalAlunos; x++) {
			this.vetorDeAlunos[x] = this.vetorDeAlunos[x + 1];
		}
		this.totalAlunos--;
	}

	public boolean contem(Aluno aluno) {
		for (int x = 0; x < this.totalAlunos; x++) {
			if (aluno.equals(this.vetorDeAlunos[x])) {
				return true;
			}
		}
		return false;
	}

	public int tamanho() {
		return this.totalAlunos;
	}

	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao < this.totalAlunos;
	}

	public Aluno consulta(int posicao) {
		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return vetorDeAlunos[posicao];
	}

	public String toString() {
		if (this.totalAlunos == 0) {
			return "[ ]";
		}

		StringBuilder builder = new StringBuilder();
		builder.append("[");

		for (int i = 0; i < this.totalAlunos; i++) {
			builder.append(this.vetorDeAlunos[i].getNome());
			builder.append(", ");
		}

		builder.append("]");

		return builder.toString();
	}
}
