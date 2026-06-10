import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double somaTemperaturas = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe a temperatura do dia " + i + " de janeiro de 2021 em BH: ");
            double temperatura = sc.nextDouble();
            somaTemperaturas += temperatura;
        }

        double media = somaTemperaturas / 10;
        System.out.printf("\nA média das temperaturas nos 10 primeiros dias foi de: %.2f°C\n", media);

    }
}