import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int num = sc.nextInt();
        
        System.out.println("Antecessor: " + (num - 1));
        System.out.println("Sucessor: " + (num + 1));
        System.out.println("Dobro: " + (num * 2));
        System.out.println("Metade: " + (num / 2.0));
    }
}