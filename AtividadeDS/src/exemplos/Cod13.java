package exemplos;

public class Cod13 {
    static void main() {
        System.out.println("Entre com um valor para x");
        int x = new java.util.Scanner(System.in).nextInt();

        System.out.println("Entre com um valor para y");
        int y = new java.util.Scanner(System.in).nextInt();

        System.out.println("Entre com um valor para z");
        int z = new java.util.Scanner(System.in).nextInt();

        if(x > y && x > z) {
            System.out.println("Maior = " + x);
        }else{
            if(y > x && y > z) {
                System.out.println("Maior = " + y);
            }else {
                System.out.println("Maior = " + z);
            }
        }

    }
}
