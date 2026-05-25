package Exemplos;

//Exemplo 3, de classe final

final class UtilitarioMatematica {
    // Método simples de soma.
    public int somar(int a, int b) {
        return a + b;
    }
}
public class FinalDemo {
    public static void main(String[] args) {
        // Criando objeto normalmente.
        UtilitarioMatematica u = new UtilitarioMatematica();
        System.out.println("Soma: " + u.somar(10, 5));
    }
}
