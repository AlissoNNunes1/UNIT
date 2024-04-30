
public class Main {

	public static void main(String[] args) {
		Deque d = new Deque ();
		
		String frase ="jorge esoj";
		String expressao = frase.toLowerCase();
		for (int i = 0; i < expressao.length(); i++) {
			Character caractere = expressao.charAt(i);
			if(!caractere.equals(' ')) {
				d.adicionaFim(caractere);
				
			}
			
		}
		boolean palíndromo = true;
		while(d.tamanho() > 1) {
			char inicio = (char) d.removeInicio();
			char fim = (char) d.removeFim();
			if(inicio != fim) {
				palíndromo = false;
				break;
			}
		}
		if(palíndromo == false) {
			
				System.out.println("Não é palíndromo");
				
			}else {
				System.out.println("É palíndromo");
			}

	
		}
}
