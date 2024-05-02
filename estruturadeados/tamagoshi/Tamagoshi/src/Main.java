public class Main {
    public static void main(String[] args) {
        
        Tamagoshi tamagoshi1 = new Tamagoshi("Tama1", 50, 80, 2);
        Tamagoshi tamagoshi2 = new Tamagoshi("Tama2", 60, 70, 3);

        
        tamagoshi1.alterarNome("Tama Um");
        tamagoshi1.alterarFome(40);
        tamagoshi1.alterarSaude(90);
        tamagoshi1.alterarIdade(3);

        tamagoshi2.alterarNome("Tama Dois");
        tamagoshi2.alterarFome(55);
        tamagoshi2.alterarSaude(75);
        tamagoshi2.alterarIdade(4);

        
        System.out.println("Tamagoshi 1:");
        tamagoshi1.imprimir();
        System.out.println();

        System.out.println("Tamagoshi 2:");
        tamagoshi2.imprimir();
    }
}
