import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a altura do homem em metros (ex: 1.75): ");
        double h = sc.nextDouble();
        
        double pesoIdeal = (72.7 * h) - 58;
        System.out.printf("O peso ideal é: %.2f kg\n", pesoIdeal);
    }
}