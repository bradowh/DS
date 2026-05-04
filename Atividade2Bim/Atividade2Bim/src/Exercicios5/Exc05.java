package Exercicios5;

//Crie métodos sobrecarregados para exibir caracteres e strings.

public class Exc05 {
    public static void mostrar(char c) {
        System.out.println("Char: " + c);
    }

    public static void mostrar(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        mostrar('A');
        mostrar("Java");
    }
}
