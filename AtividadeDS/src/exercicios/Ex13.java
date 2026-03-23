package exercicios;
import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int resultado = 1;

        for (int i = 0; i < y; i++) {
            resultado *= x;
        }

        System.out.println("Resultado: " + resultado);
    }
}
