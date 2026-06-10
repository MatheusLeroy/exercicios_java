import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor do lado X: ");
        double x = sc.nextDouble();
        System.out.print("Valor do lado Y: ");
        double y = sc.nextDouble();
        System.out.print("Valor do lado Z: ");
        double z = sc.nextDouble();
        
        // A condição de existência de um triângulo é que a medida de qualquer 
        // um dos lados seja menor que a soma das medidas dos outros dois
        if (x < (y + z) && y < (x + z) && z < (x + y)) {
            System.out.println("Os valores informados podem formar um triângulo.");
        } else {
            System.out.println("Erro: Os valores NÃO formam um triângulo.");
        }
    }
}