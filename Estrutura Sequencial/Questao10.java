import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor gasto pelo cliente: R$ ");
        double valorGasto = sc.nextDouble();
        
        double gorjeta = valorGasto * 0.10;
        System.out.printf("O valor a ser pago de gorjeta (10%%) é: R$ %.2f\n", gorjeta);
 
    }
}