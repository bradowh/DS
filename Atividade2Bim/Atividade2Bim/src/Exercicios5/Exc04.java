package Exercicios5;

//Crie métodos sobrecarregados para realizar soma com 2, 3 e 4 números inteiros.

public class Exc04 {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static int somar(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        System.out.println(somar(1,2));
        System.out.println(somar(1,2,3));
        System.out.println(somar(1,2,3,4));
    }

}
