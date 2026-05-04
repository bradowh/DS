package Exercicios5;

//Crie métodos sobrecarregados que exibam texto simples e texto repetido várias vezes.

public class Exc03 {
    public static void mostrar(String texto) {
        System.out.println(texto);
    }

    public static void mostrar(String texto, int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.println(texto);
        }
    }

    public static void main(String[] args) {
        mostrar("Olá");
        mostrar("Oi", 3);
    }
}
