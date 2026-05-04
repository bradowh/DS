package Exercicios5;

//  Crie métodos sobrecarregados que exibam números inteiros e números reais.

public class Exc01 {

    public static void mostrar(int n) {
        System.out.println("Inteiro: " + n);
    }

    public static void mostrar(double n) {
        System.out.println("Real: " + n);
    }

    public static void main(String[] args) {
        mostrar(10);
        mostrar(5.5);
    }
}
