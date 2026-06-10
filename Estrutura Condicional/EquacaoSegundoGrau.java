import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        double delta = (b * b) - (4 * a * c);

        System.out.println("Delta = " + delta);

        if (delta < 0) {
            System.out.println("Não existem raízes reais.");
        }
        else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Existe apenas uma raiz real:");
            System.out.println("x = " + x);
        }
        else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Existem duas raízes reais:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}