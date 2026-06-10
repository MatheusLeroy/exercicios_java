import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maiorNota = Double.MIN_VALUE; 
        double menorNota = Double.MAX_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Informe a nota do aluno " + i + ": ");
            double nota = sc.nextDouble();

            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        System.out.println("\nA maior nota da turma é: " + maiorNota);
        System.out.println("A menor nota da turma é: " + menorNota);

    }
}