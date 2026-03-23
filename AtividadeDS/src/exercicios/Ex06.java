package exercicios;
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite x1: ");
        int x1 = sc.nextInt();

        System.out.print("Digite y1: ");
        int y1 = sc.nextInt();

        System.out.print("Digite x2: ");
        int x2 = sc.nextInt();

        System.out.print("Digite y2: ");
        int y2 = sc.nextInt();

        int distancia = (int)(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        System.out.println("Ponto 1: (" + x1 + "," + y1 + ")");
        System.out.println("Ponto 2: (" + x2 + "," + y2 + ")");
        System.out.println("Distância: " + distancia);
    }
}
