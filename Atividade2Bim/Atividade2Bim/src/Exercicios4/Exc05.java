package Exercicios4;

//Crie um método que receba uma idade e retorne true se for maior ou igual a 18.

public class Exc05 {

    public static boolean maiorDeIdade(int idade) {
        return idade >= 18;
    }

    public static void main(String[] args) {
        System.out.println(maiorDeIdade(20));
    }
}
