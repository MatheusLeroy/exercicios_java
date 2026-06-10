import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a idade da pessoa: ");
        int idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Classe eleitoral: Não eleitor");
        } else if (idade >= 18 && idade < 65) {
            System.out.println("Classe eleitoral: Eleitor obrigatório");
        } else {
            System.out.println("Classe eleitoral: Eleitor facultativo");
        }
    }
}