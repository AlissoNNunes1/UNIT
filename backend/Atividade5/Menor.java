import java.util.Scanner;

public class Menor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro:");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo numero inteiro:");
        int num2 = input.nextInt();

        System.out.println("Digite o terceiro mumero inteiro:");
        int num3 = input.nextInt();
        
        if (num1 < num2 && num1 < num3){
            System.out.println("O menor valor digitado foi " + num1);
        }else if (num2 < num1 && num2 < num3){
            System.out.println("O menor valor digitado foi " + num2);
        } else{
            System.out.println("O menor valor digitado foi " + num3);
    
    }
}
}
