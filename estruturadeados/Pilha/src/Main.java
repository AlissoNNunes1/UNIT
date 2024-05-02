import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String expressao = "(4 * 2) * 3 - (8 / 2) * 3";

        double resultado = resolverExpressao(expressao);
        System.out.println("Resultado da expressão: " + resultado);
    }

    public static double resolverExpressao(String expressao) {
        Pilha<Double> pilha = new Pilha<>();
        Stack<Character> operadores = new Stack<>();

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);

            if (caractere == '(') {
                operadores.push(caractere);
            } else if (caractere == ')') {
                while (!operadores.isEmpty() && operadores.peek() != '(') {
                    calcularOperacao(pilha, operadores.pop());
                }
                operadores.pop(); // Remover o '(' da pilha de operadores
            } else if (isOperador(caractere)) {
                while (!operadores.isEmpty() && precedence(operadores.peek()) >= precedence(caractere)) {
                    calcularOperacao(pilha, operadores.pop());
                }
                operadores.push(caractere);
            } else if (Character.isDigit(caractere)) {
                StringBuilder numeroStr = new StringBuilder();
                while (i < expressao.length() && (Character.isDigit(expressao.charAt(i)) || expressao.charAt(i) == '.')) {
                    numeroStr.append(expressao.charAt(i++));
                }
                i--;
                double numero = Double.parseDouble(numeroStr.toString());
                pilha.push(numero);
            }
        }

        while (!operadores.isEmpty()) {
            calcularOperacao(pilha, operadores.pop());
        }

        return pilha.recuperaTopo();
    }

    public static boolean isOperador(char caractere) {
        return caractere == '+' || caractere == '-' || caractere == '*' || caractere == '/';
    }

    public static int precedence(char operador) {
        if (operador == '+' || operador == '-') {
            return 1;
        } else if (operador == '*' || operador == '/') {
            return 2;
        }
        return 0;
    }

    public static void calcularOperacao(Pilha<Double> pilha, char operador) {
        double segundoNumero = pilha.recuperaTopo();
        pilha.pop();
        double primeiroNumero = pilha.recuperaTopo();
        pilha.pop();
        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = primeiroNumero + segundoNumero;
                break;
            case '-':
                resultado = primeiroNumero - segundoNumero;
                break;
            case '*':
                resultado = primeiroNumero * segundoNumero;
                break;
            case '/':
                if (segundoNumero != 0) {
                    resultado = primeiroNumero / segundoNumero;
                } else {
                    throw new ArithmeticException("Divisão por zero!");
                }
                break;
        }

        pilha.push(resultado);
    }
}
