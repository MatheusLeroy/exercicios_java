import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a idade do nadador: ");
        int idade = sc.nextInt();

        if (idade <= 7) {
            System.out.println("Categoria: INFANTIL");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Categoria: JUVENIL");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println("Categoria: ADOLESCENTE");
        } else if (idade >= 16 && idade <= 30) {
            System.out.println("Categoria: ADULTO");
        } else {
            System.out.println("Categoria: SENIOR");
        }
    }
}