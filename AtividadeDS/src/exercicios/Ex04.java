package exercicios;
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite X: ");
        int x = sc.nextInt();

        System.out.print("Digite Y: ");
        int y = sc.nextInt();

        System.out.print("Digite Z: ");
        int z = sc.nextInt();

        int resultado = x * y / z;

        System.out.println("Resultado: " + resultado);
    }
}
