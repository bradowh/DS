package Exercicios4;

//Crie um método que receba um nome e retorne uma mensagem de boas-vindas personalizada.

public class Exc02 {

    public static String boasVindas(String nome) {
        return "Bem-vindo, " + nome + "!";
    }

    public static void main(String[] args) {
        System.out.println(boasVindas("Carlos"));
    }
}
