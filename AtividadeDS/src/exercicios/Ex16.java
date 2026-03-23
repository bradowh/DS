package exercicios;
import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        // leitura
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        // diagonal secundária
        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][2 - i]);
        }
    }
}
