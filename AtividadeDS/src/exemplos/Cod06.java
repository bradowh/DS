package exemplos;

public class Cod06 {
    static void main(String[] args) {
        int a = 30;
        int b = 30;
        System.out.println(a + " " + (a++) + " " + a);
        // O valor sera printado na tela e só depois irá ser incrementado
        System.out.println(b + " " + (++b) + " " + b);
        // O valor sera primeiro incrementado e depois printado na tela

    }
}
