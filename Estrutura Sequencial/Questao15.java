import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número total de eleitores: ");
        int totalEleitores = sc.nextInt();
        System.out.print("Informe os votos do primeiro candidato: ");
        int votosCand1 = sc.nextInt();
        System.out.print("Informe os votos do segundo candidato: ");
        int votosCand2 = sc.nextInt();
        
        int votosNulosBrancos = totalEleitores - (votosCand1 + votosCand2);
        
        double percCand1 = (votosCand1 * 100.0) / totalEleitores;
        double percCand2 = (votosCand2 * 100.0) / totalEleitores;
        double percNulos = (votosNulosBrancos * 100.0) / totalEleitores;
        
        System.out.printf("Percentual do Candidato 1: %.2f%%\n", percCand1);
        System.out.printf("Percentual do Candidato 2: %.2f%%\n", percCand2);
        System.out.printf("Percentual de votos nulos/brancos: %.2f%%\n", percNulos);

    }
}