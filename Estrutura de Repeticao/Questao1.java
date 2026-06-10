import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matricula;

        do {
            System.out.print("\nInforme a matrícula do aluno (ou um número negativo para encerrar): ");
            matricula = sc.nextInt();
            
            // Condição de parada imediata
            if (matricula < 0) {
                System.out.println("Programa encerrado.");
                break;
            }

            System.out.print("Informe a nota 1: ");
            double n1 = sc.nextDouble();
            System.out.print("Informe a nota 2: ");
            double n2 = sc.nextDouble();
            System.out.print("Informe a nota 3: ");
            double n3 = sc.nextDouble();

            double media = (n1 + n2 + n3) / 3.0;
            System.out.printf("Média do aluno: %.2f\n", media);

            if (media >= 70) {
                System.out.println("Situação: APROVADO");
            } else if (media >= 60) {
                System.out.println("Situação: EXAME");
            } else {
                System.out.println("Situação: REPROVADO");
            }
            
        } while (matricula >= 0);

    }
}