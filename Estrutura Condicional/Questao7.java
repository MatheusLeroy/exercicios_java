import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário atual do funcionário: R$ ");
        double salario = sc.nextDouble();

        if (salario < 1000.00) {
            double novoSalario = salario + (salario * 0.30); // Aumento de 30%
            System.out.printf("O valor do salário reajustado é: R$ %.2f\n", novoSalario);
        } else {
            System.out.println("O funcionário não tem direito ao aumento, pois o salário é igual ou superior a R$ 1000,00.");
        }
    }
}