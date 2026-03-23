package exemplos;

public class Cod10 {
    static void main() {
        System.out.println("Entre com um valor para x: ");
        int x = new java.util.Scanner(System.in).nextInt();
        if(x >= 1 && x <= 1000) {
            System.out.println("O numero esta entre 1 e 1000");
        }else {
            System.out.println("O numero não esta entre 1 e 1000");
        }
    }
}
