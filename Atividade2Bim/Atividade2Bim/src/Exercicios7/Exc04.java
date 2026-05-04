package Exercicios7;

//Crie um método estático que receba uma mensagem e imprima-a 3 vezes.

public class Exc04 {

    public static void repetir(String msg) {
        for (int i = 0; i < 3; i++) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        repetir("Java");
    }
}
