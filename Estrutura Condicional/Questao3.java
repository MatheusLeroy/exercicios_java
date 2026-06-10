import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduza a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Introduza a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.print("Introduza a terceira nota: ");
        double n3 = sc.nextDouble();
        
        double media = (n1 + n2 + n3) / 3;
        System.out.printf("Média calculada: %.2f\n", media);
        
        if (media >= 0 && media < 3) {
            System.out.println("Mensagem: REPROVADO");
        } else if (media >= 3 && media < 7) {
            System.out.println("Mensagem: EXAME");
        } else if (media >= 7 && media <= 10) {
            System.out.println("Mensagem: APROVADO");
        } else {
            System.out.println("Erro: A média calculada está fora do intervalo de 0 a 10.");
        }
    }
}