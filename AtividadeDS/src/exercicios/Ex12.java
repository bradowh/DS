package exercicios;
import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial: " + fatorial);
    }
}
