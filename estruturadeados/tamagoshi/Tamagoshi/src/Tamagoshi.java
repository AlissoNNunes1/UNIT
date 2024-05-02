public class Tamagoshi {
    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public Tamagoshi(String nome, int fome, int saude, int idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }

    
    public void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    public void alterarFome(int novaFome) {
        this.fome = novaFome;
    }

    public void alterarSaude(int novaSaude) {
        this.saude = novaSaude;
    }

    public void alterarIdade(int novaIdade) {
        this.idade = novaIdade;
    }


    public String retornarNome() {
        return this.nome;
    }

    public int retornarFome() {
        return this.fome;
    }

    public int retornarSaude() {
        return this.saude;
    }

    public int retornarIdade() {
        return this.idade;
    }

    
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Fome: " + this.fome);
        System.out.println("Saúde: " + this.saude);
        System.out.println("Idade: " + this.idade);
    }
}
