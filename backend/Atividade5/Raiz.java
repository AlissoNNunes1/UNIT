import java.util.Scanner;

public class Raiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        double raizQuadrada = Math.sqrt(numero);

        System.out.println("A raiz quadrada de " + numero + " é: " + raizQuadrada);
    }
}
