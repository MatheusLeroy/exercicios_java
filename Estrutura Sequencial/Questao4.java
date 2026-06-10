import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a diagonal maior do losango: ");
        double diagMaior = sc.nextDouble();
        System.out.print("Informe a diagonal menor do losango: ");
        double diagMenor = sc.nextDouble();
        
        double area = (diagMaior * diagMenor) / 2;
        System.out.printf("A área do losango é: %.2f\n", area);
        
    }
}