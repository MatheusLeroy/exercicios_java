import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario;
        double somaSalarios = 0;
        int filhos;
        int somaFilhos = 0;
        int totalHabitantes = 0;

        while (true) {
            System.out.print("Informe o salário (ou um valor negativo para encerrar): R$ ");
            salario = sc.nextDouble();
            
            if (salario < 0) {
                break;
            }

            System.out.print("Informe o número de filhos: ");
            filhos = sc.nextInt();

            somaSalarios += salario;
            somaFilhos += filhos;
            totalHabitantes++;
        }

        if (totalHabitantes > 0) {
            System.out.printf("\na) Média do salário da população: R$ %.2f\n", (somaSalarios / totalHabitantes));
            System.out.printf("b) Média do número de filhos: %.2f\n", ((double) somaFilhos / totalHabitantes));
        } else {
            System.out.println("\nNenhum dado foi inserido.");
        }
    }
}