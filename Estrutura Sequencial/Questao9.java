import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número positivo: ");
        double num = sc.nextDouble();
        
        System.out.printf("a) Ao quadrado: %.2f\n", Math.pow(num, 2));
        System.out.printf("b) Ao cubo: %.2f\n", Math.pow(num, 3));
        System.out.printf("c) Raiz quadrada: %.2f\n", Math.sqrt(num));
        System.out.printf("d) Raiz cúbica: %.2f\n", Math.cbrt(num));
    
    }
}