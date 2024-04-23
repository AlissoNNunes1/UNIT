
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fila<String> f1 = new Fila<>();
		Fila<String> especial = new Fila<>();

		f1.enfileirar("alisson");
		f1.enfileirar("jorge");
		f1.enfileirar("Aisaacque");
		f1.enfileirar("pedro");
		f1.enfileirar("pato");
		f1.enfileirar("treto");

		especial.enfileirar("leo");
		especial.enfileirar("especial");
		especial.enfileirar("portea");
		especial.enfileirar("ADONAI");
		especial.enfileirar("SANTIAGO");

		while (especial.tamanho() > 0 | f1.tamnho()> 0) {
			for(int y; y <= 5; y++){
				switch (y) {
					case 1:
						especial.desenfileirar()
						break;
				
					default:
						break;
				}
			}
		}
	}

}
