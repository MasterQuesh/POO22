import java.util.Scanner;

public class Comparador {   
    public static void main(String[] args) {    
        Scanner read = new Scanner(System.in);

        double num1;
        double num2;
        System.out.println("Digite um número: ");
        num1 = read.nextDouble();
        System.out.println("Digite outro número: ");
        num2 = read.nextDouble();

        if (num1 < num2) {    
            System.out.println("O primeiro número é menor que o segundo");
        } else {    
            System.out.println("O segundo número é menor que o primeiro");
        };

    }
}