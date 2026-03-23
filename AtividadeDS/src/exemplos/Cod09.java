package exemplos;

import java.util.Scanner;

public class Cod09 {
    static void main() {
        System.out.println("Entre com um valor para x:");
        int x = new Scanner(System.in).nextInt();
        if (x % 2 == 0) {
            System.out.println("É par");
        }else {
            System.out.println("É impar");
        }
    }
}
