import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor do salário mínimo atual: R$ ");
        double salMinimo = sc.nextDouble();
        System.out.print("Informe o salário do funcionário: R$ ");
        double salFuncionario = sc.nextDouble();
        
        double qtdSalarios = salFuncionario / salMinimo;
        System.out.printf("O funcionário recebe %.2f salários mínimos.\n", qtdSalarios);
    }
}