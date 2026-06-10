import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Informe o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("\nMENU DE OPÇÕES:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opção: ");
        
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Resultado da Soma: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado da Subtração: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado da Multiplicação: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado da Divisão: " + (num1 / num2));
                } else {
                    System.out.println("Erro: Não é possível dividir por zero.");
                }
                break;
            case 5:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
}