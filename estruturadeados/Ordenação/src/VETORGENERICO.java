

 	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;

	public class BubbleSortGenerico {

	    public static void main(String[] args) {
	        List<Senha> senhas = lerSenhasDoArquivo("senhas.txt");

	        long startTime = System.currentTimeMillis();
	        bubbleSort(senhas);
	        long endTime = System.currentTimeMillis();

	        for (Senha senha : senhas) {
	            System.out.println(senha);
	        }

	        System.out.println("Tempo de execução (ms): " + (endTime - startTime));
	    }

	    static void bubbleSort(List<Senha> senhas) {
	        int n = senhas.size();
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (senhas.get(j).compareTo(senhas.get(j + 1)) > 0) {
	                    Senha temp = senhas.get(j);
	                    senhas.set(j, senhas.get(j + 1));
	                    senhas.set(j + 1, temp);
	                }
	            }
	        }
	    }

	    static List<Senha> lerSenhasDoArquivo(String nomeArquivo) {
	        List<Senha> senhas = new ArrayList<>();
	        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
	            String linha;
	            while ((linha = br.readLine()) != null) {
	                String[] partes = linha.split(" ");
	                int tamanho = Integer.parseInt(partes[0]);
	                int frequencia = Integer.parseInt(partes[1]);
	                String senha = partes[2];
	                senhas.add(new Senha(tamanho, frequencia, senha));
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return senhas;
	    }

	    static class Senha implements Comparable<Senha> {
	        int tamanho;
	        int frequencia;
	        String senha;

	        public Senha(int tamanho, int frequencia, String senha) {
	            this.tamanho = tamanho;
	            this.frequencia = frequencia;
	            this.senha = senha;
	        }

	        @Override
	        public int compareTo(Senha outraSenha) {
	            return this.senha.compareTo(outraSenha.senha);
	        }

	        @Override
	        public String toString() {
	            return tamanho + " " + frequencia + " " + senha;
	        }
	    }
}
