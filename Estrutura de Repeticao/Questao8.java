import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contMais90kg = 0;
        int somaIdades = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Pessoa " + i + " - Informe a idade: ");
            int idade = sc.nextInt();
            
            System.out.print("Pessoa " + i + " - Informe o peso (kg): ");
            double peso = sc.nextDouble();

            somaIdades += idade;
            
            if (peso > 90) {
                contMais90kg++;
            }
        }

        double mediaIdades = (double) somaIdades / 7;

        System.out.println("\nQuantidade de pessoas com mais de 90 kg: " + contMais90kg);
        System.out.printf("Média de idade das sete pessoas: %.2f anos\n", mediaIdades);
    }
}