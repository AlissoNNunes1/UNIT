public class Somar {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int soma = somarElementos(vetor, 0);
        System.out.println("A soma dos elementos do vetor é: " + soma);
    }

    public static int somarElementos(int[] vetor, int indice) {
        
        if (indice >= vetor.length) {
            return 0;
        }

        
        return vetor[indice] + somarElementos(vetor, indice + 1);
    }
}
