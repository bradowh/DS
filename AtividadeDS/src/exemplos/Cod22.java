package exemplos;

public class Cod22 {
    static void main(String[] args) {
        int quantidadeNumerosPrimos = 0;
        for (int i = 2; i <= 10; i++) {
            System.out.println(i + "é primo?");
            int numeroDivisores = 0;
            int j = 1;
            while (j <= i) {
                if (i % j == 0) {
                    numeroDivisores++;
                }
                j++;

            }
            if (numeroDivisores == 2){
                quantidadeNumerosPrimos++;
                System.out.println("... sim!");
            }else {
                System.out.println("... nao!");
            }
        }
        System.out.println("Quantidade de numeros primos: " + quantidadeNumerosPrimos);
    }
}
