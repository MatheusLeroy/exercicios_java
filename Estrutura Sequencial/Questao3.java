import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a cotação do dólar atual (R$): ");
        double cotacao = sc.nextDouble();
        System.out.print("Informe o valor que você possui em dólares (US$): ");
        double valorDolar = sc.nextDouble();
        
        double valorReal = cotacao * valorDolar;
        System.out.printf("O valor convertido é: R$ %.2f\n", valorReal);
        
    }
}