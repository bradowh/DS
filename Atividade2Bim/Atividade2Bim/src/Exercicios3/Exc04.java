package Exercicios3;

//Crie um método que receba um número e diga se ele é positivo ou negativo.

public class Exc04 {

    public static void verificarNumero(int n) {
        if (n >= 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
    }

    public static void main(String[] args) {
        verificarNumero(-5);
    }
}
