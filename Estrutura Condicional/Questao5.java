import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o sexo (1 para homens, 2 para mulheres): ");
        int sexo = sc.nextInt();
        System.out.print("Informe a altura em metros (ex: 1.75): ");
        double h = sc.nextDouble();
        
        double pesoIdeal = 0;

        if (sexo == 1) {
            pesoIdeal = (72.7 * h) - 58;
            System.out.printf("Peso ideal para homem: %.2f kg\n", pesoIdeal);
        } else if (sexo == 2) {
            pesoIdeal = (62.1 * h) - 44.7;
            System.out.printf("Peso ideal para mulher: %.2f kg\n", pesoIdeal);
        } else {
            System.out.println("Opção de sexo inválida. Use 1 ou 2.");
        }
    }
}