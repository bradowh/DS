package Exercicios5;

//Crie métodos sobrecarregados para calcular área de um quadrado e de um retângulo.

public class Exc02 {
    public static int area(int lado) {
        return lado * lado;
    }

    public static int area(int base, int altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        System.out.println(area(4));
        System.out.println(area(4, 5));
    }
}
