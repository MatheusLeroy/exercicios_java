import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe um número inteiro positivo: ");
        int numero = sc.nextInt();

        System.out.println("Números ímpares de 1 até " + numero + ":");
       
        for (int i = 1; i <= numero; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); 
    }
}