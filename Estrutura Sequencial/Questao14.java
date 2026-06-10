import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Informe o valor de B: ");
        int b = sc.nextInt();
        
        int aux = a;
        a = b;
        b = aux;
        
        System.out.println("Saída: A = " + a + ", B = " + b);

    }
}