package exercicios;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de A: ");
        int a = sc.nextInt();

        System.out.print("Valor de B: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Maior: " + a);
        } else {
            System.out.println("Maior: " + b);
        }
    }
}
