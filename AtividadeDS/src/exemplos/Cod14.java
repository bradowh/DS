package exemplos;

public class Cod14 {
    static void main() {
        System.out.println("Entre com um valor para x");
        int x = new java.util.Scanner(System.in).nextInt();
        System.out.println(x % 2 == 0 ? "É par" : "É impar");
    }
}
