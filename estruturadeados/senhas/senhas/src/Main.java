import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
        ListaSimples<String> senhas = new ListaSimples<>();

        try {
            File myObj = new File("senhas.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String senha = myReader.nextLine().replaceAll("[0-9]", "").replaceAll("\\s+", "");
                senhas.adicionaFim(senha);
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
            return;
        }

        System.out.println("Senhas lidas com suscesso ");

        
        // Ordenação usando Selection Sort
        try{
        long inicio = System.currentTimeMillis();
        selectionSortLista(senhas);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo Selection Sort: " + (fim - inicio) + "ms");

       // for (int i = 0; i < senhas.tamanho(); i++) {
           // System.out.println(senhas.Recupera(i));
       // }
     } catch (Exception e) {
         System.out.println("Erro ao ordenar a lista");
         e.printStackTrace();
     }
     
     // Resetando lista de senhas para a próxima ordenação
        senhas = new ListaSimples<>();
        try{
         File myObj = new File("senhas.txt");
        Scanner myReader = new Scanner(myObj);

        while (myReader.hasNextLine()) {
            String senha = myReader.nextLine().replaceAll("[0-9]", "").replaceAll("\\s+", "");
            senhas.adicionaFim(senha);
        }
        myReader.close();
    } catch (FileNotFoundException e) {
        System.out.println("Ocorreu um erro.");
        e.printStackTrace();
        return;
    }
    System.out.println("Senhas lidas com suscesso ");
        

        // Ordenação usando Quicksort
        try{
        long inicio = System.currentTimeMillis();
        quickSortLista(senhas, 0, senhas.tamanho() - 1);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo Quicksort: " + (fim - inicio) + "ms");

        for (int i = 0; i < senhas.tamanho(); i++) {
            System.out.println(senhas.Recupera(i));
    }
        } catch (Exception e) {
            System.out.println("Erro ao ordenar a lista");
            e.printStackTrace();
        }
}
public static void selectionSortLista(ListaSimples<String> lista) {
        for (int i = 0; i < lista.tamanho(); i++) {
            int menor = i;
            for (int j = i + 1; j < lista.tamanho(); j++) {
                if (lista.Recupera(j).compareTo(lista.Recupera(menor)) < 0) {
                    menor = j;
                }
            }
            if(menor != i) {
                lista.trocaPosicao(i, menor);
        }
    }
    }

public static void quickSortLista(ListaSimples<String> lista, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = particiona(lista, inicio, fim);
            quickSortLista(lista, inicio, posicaoPivo - 1);
            quickSortLista(lista, posicaoPivo + 1, fim);
        }
    }

    public static int particiona(ListaSimples<String> lista, int inicio, int fim) {
        String pivo = lista.Recupera(fim);
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (lista.Recupera(j).compareTo(pivo) < 0) {
                i++;
                lista.trocaPosicao(i, j);
            }
        }
        lista.trocaPosicao(i + 1, fim);
        return i + 1;
    }
}

// COM APROXIMADAMENTE 750 LINHAS O TEMPO FOI DE 
// 754ms PARA O SELECTION SORT
// 33ms PARA O QUICKSORT