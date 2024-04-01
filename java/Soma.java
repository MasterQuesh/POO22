import java.util.Scanner;

public class Soma { 
    public static void main(String []args) {    
        Scanner read = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Digite o primeiro valor: ");
        num1 = read.nextInt();
        System.out.println("Digite o segundo valor: ");
        num2 = read.nextInt();

        int soma = num1 + num2;

        System.out.println("O resultado é: " + soma);

    }
}