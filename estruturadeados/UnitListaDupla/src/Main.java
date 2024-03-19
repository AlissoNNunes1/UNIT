
public class Main
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
        public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Anderson", 42);
		Aluno a2 = new Aluno("Ana", 31);
		Aluno a3 = new Aluno("José", 23);
                Aluno a4 =  new Aluno("Maria", 56);
	ListaDupla lista = new ListaDupla();
        
        lista.adicionaInicio(a1);  //funcionando
        lista.adicionaInicio(a2);  //funcionando
        lista.adicionaInicio(a3);  //funcionando        
        lista.adicionaInicio(a4); 
         //funcionando
        
        

        System.out.println(a1.getNome() + " - " + a1.getIdade());  //funcionando
        System.out.println(a2.getNome() + " - " + a2.getIdade());  //funcionando
                System.out.println(lista.existeDado("nome"));
	}
}
