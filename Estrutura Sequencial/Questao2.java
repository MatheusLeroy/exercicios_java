import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();
        
        int idadeAtual = anoAtual - anoNascimento;
        int idade2050 = 2050 - anoNascimento;
        
        System.out.println("a) Idade no ano atual: " + idadeAtual + " anos");
        System.out.println("b) Idade que terá em 2050: " + idade2050 + " anos");

    }
}