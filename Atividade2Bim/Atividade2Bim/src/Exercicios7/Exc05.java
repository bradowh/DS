package Exercicios7;

//Crie um método estático que verifique se um número recebido por parâmetro é par (retorne booleano).

public class Exc05 {
    public static boolean ehPar(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(ehPar(4));
    }
}
