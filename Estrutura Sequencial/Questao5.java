import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a temperatura em Celsius: ");
        double celsius = sc.nextDouble();
        
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.printf("A temperatura em Fahrenheit é: %.2f °F\n", fahrenheit);
        
    }
}