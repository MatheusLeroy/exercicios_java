import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduza o peso (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Introduza a altura (m): ");
        double altura = sc.nextDouble();
        
        double imc = peso / Math.pow(altura, 2);
        System.out.printf("O seu IMC é: %.2f\n", imc);
        
        if (imc < 20) {
            System.out.println("Situação: Abaixo do peso");
        } else if (imc <= 25) { // Cobre "de 20 até 25"
            System.out.println("Situação: Peso Normal");
        } else if (imc <= 30) { // Cobre "de 25 até 30"
            System.out.println("Situação: Sobre Peso");
        } else if (imc <= 40) { // Cobre "de 30 até 40"
            System.out.println("Situação: Obeso");
        } else {                // Cobre "de 40 e acima"
            System.out.println("Situação: Obeso Mórbido");
        }
    }
}