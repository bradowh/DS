package exercicios;
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int maior = (a > b) ? a : b;

        System.out.println("Maior: " + maior);
    }
}
