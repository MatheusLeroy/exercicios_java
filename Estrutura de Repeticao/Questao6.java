import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int homens = 0;
        int mulheres = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i);
            System.out.print("Digite 1 para Masculino ou 2 para Feminino: ");
            int sexo = sc.nextInt();
            
            System.out.print("Digite o peso em kg: ");
            double peso = sc.nextDouble();

            // Verifica se é homem (1) E está na faixa de peso (60 a 80)
            if (sexo == 1 && peso >= 60 && peso <= 80) {
                homens++;
            }
            
            // Verifica se é mulher (2) E está na faixa de peso (50 a 70)
            if (sexo == 2 && peso >= 50 && peso <= 70) {
                mulheres++;
            }
        }

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Homens entre 60kg e 80kg: " + homens);
        System.out.println("Mulheres entre 50kg e 70kg: " + mulheres);
    }
}