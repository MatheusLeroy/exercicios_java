import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        if (n1 > n2) {
            System.out.println("Maior: " + n1 + "\nMenor: " + n2);
        } else if (n2 > n1) {
            System.out.println("Maior: " + n2 + "\nMenor: " + n1);
        } else {
            System.out.println("Os dois números são iguais.");
        }
    } 
}    