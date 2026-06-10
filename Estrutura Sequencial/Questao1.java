import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int n2 = sc.nextInt();
        System.out.print("Digite o terceiro número inteiro: ");
        int n3 = sc.nextInt();
        
        double media = (n1 + n2 + n3) / 3.0;
        System.out.printf("A média aritmética é: %.2f\n", media);
        
    }
}