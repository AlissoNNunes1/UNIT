public class Filas {

    public static void main(String[] args) {
        Fila<String> filaNormal = new Fila<>();
        Fila<String> filaEspecial = new Fila<>();

        // Adicionando valores às filas
        filaNormal.enfileirar("alisson");
        filaNormal.enfileirar("jorge");
        filaNormal.enfileirar("Aisaacque");
        filaNormal.enfileirar("pedro");
        filaNormal.enfileirar("pato");
        filaNormal.enfileirar("treto");

        filaEspecial.enfileirar("leo");
        filaEspecial.enfileirar("especial");
        filaEspecial.enfileirar("portea");
        filaEspecial.enfileirar("ADONAI");
        filaEspecial.enfileirar("SANTIAGO");

        // Loop para simular as posições de um caixa
        for (int i = 1; i <= 5; i++) {
            String cliente;
            if (i <= 2) { // Consumir valores da Fila Especial nas posições 1 e 2
                if (filaEspecial.tamanho() > 0) {
                    cliente = filaEspecial.desenfileirar().toString();
                } else {
                    cliente = "Não há clientes especiais na fila. Consumindo cliente normal.";
                    if (filaNormal.tamanho() > 0) {
                        cliente = filaNormal.desenfileirar().toString();
                    } else {
                        cliente = "Não há clientes na fila normal.";
                    }
                }
            } else { // Consumir valores da Fila Normal nas posições 3, 4 e 5
                if (filaNormal.tamanho() > 0) {
                    cliente = filaNormal.desenfileirar().toString();
                } else {
                    cliente = "Não há clientes na fila normal. Consumindo cliente especial.";
                    if (filaEspecial.tamanho() > 0) {
                        cliente = filaEspecial.desenfileirar().toString();
                    } else {
                        cliente = "Não há clientes especiais na fila.";
                    }
                }
            }
            System.out.println("Caixa " + i + " atendeu: " + cliente);
        }
    }
}
