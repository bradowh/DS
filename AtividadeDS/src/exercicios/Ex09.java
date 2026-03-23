package exercicios;
import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Equilátero");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }
    }
}
