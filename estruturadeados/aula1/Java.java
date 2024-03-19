public class Java {
    public static void main(String[] args) {
        // Teste das funções
        // Teste da potência
        int resultadoPotencia = calcularPotencia(2, 5);
        System.out.println("2^5 = " + resultadoPotencia);

        // Teste da contagem de dígitos
        int numero = 250;
        int quantidadeDigitos = contarDigitos(numero);
        System.out.println("O número " + numero + " tem " + quantidadeDigitos + " dígitos.");

        
        int[] vetor = {1, 2, 3, 4, 5};
        int soma = somarElementosVetor(vetor, vetor.length);
        System.out.println("A soma dos elementos do vetor é: " + soma);

        
        int n = 9;
        int termoFibonacci = calcularFibonacci(n);
        System.out.println("O " + n + "º termo da sequência Fibonacci é: " + termoFibonacci);
    }

   
    public static int calcularPotencia(int k, int n) {
        if (n == 0) {
            return 1;
        } else {
            return k * calcularPotencia(k, n - 1);
        }
    }

    
    public static int contarDigitos(int numero) {
        if (numero < 10) {
            return 1;
        } else {
            return 1 + contarDigitos(numero / 10);
        }
    }


    public static int somarElementosVetor(int[] vetor, int tamanho) {
        if (tamanho == 0) {
            return 0;
        } else {
            return vetor[tamanho - 1] + somarElementosVetor(vetor, tamanho - 1);
        }
    }

    // 
    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
