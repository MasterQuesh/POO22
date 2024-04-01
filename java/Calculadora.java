import java.util.Scanner;

public class Calculadora {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Digite um numero");
    double n1 = read.nextDouble();
    System.out.println("Digite outro numero");
    double n2 = read.nextDouble();

    System.out.println("Selecione uma operação: \n soma \n subtracao \n multiplicacao \n divisao");
    String op = read.next();
    if (op.equals("soma")) {
      System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
    } else if (op.equals("subtracao")) {
      System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
    } else if (op.equals("multiplicacao")) {
      System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
    } else if (op.equals("divisao")) {
      System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
    } else {
      System.out.println("Opção invalida");
    }
  }
}