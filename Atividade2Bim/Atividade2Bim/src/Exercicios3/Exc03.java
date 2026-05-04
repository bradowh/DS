package Exercicios3;

//Crie um método que receba nome e idade e imprima-os.

public class Exc03 {

    public static void mostrarDados(String nome, int idade) {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        mostrarDados("João", 16);
    }
}
