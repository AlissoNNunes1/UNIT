public class Matriz {
    public static void main(String[] args) {
        
        int[][] matriz = new int[3][3];

       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] *= 5;
            }
        }

        
        System.out.println("\nMatriz multiplicada por 5:");
        imprimirMatriz(matriz);
    }

    // Método para imprimir a matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
