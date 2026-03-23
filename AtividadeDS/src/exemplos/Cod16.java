package exemplos;

public class Cod16 {
    public static void main(String[] args) {

        System.out.println("Entre com a opção desejada");
        System.out.println("1 - Pratos");
        System.out.println("2 - Bebidas");
        System.out.println("3 - Encerre sua conta");

        int opcao = new java.util.Scanner(System.in).nextInt();

        switch(opcao) {
            case 1:
                System.out.println(" * Hamburguer");
                System.out.println(" * Pizza a moda da casa");
                System.out.println(" * Batata empanada");
                break;

            case 2:
                System.out.println(" * Agua");
                System.out.println(" * Refrigerante");
                break;

            case 3:
                System.out.println("Conta encerrada!");
                break;

            default:
                System.out.println("Opção Incorreta!");
        }
    }
}
