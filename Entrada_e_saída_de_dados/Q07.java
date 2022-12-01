import java.util.Scanner;
public class Q07{
  public static void main(String[] args){
    Scanner read = new Scanner(System.in);
    System.out.println("Digite um numero");
    int n = read.nextInt();
    for(int i = 1; i <= n; i++){
      System.out.println(i);      
    }
  }
}