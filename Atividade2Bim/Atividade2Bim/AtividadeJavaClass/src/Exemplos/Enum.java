package Exemplos;

//Exemplo 08, de enum class

enum StatusPedido {
    PENDENTE,
    PROCESSANDO,
    ENVIADO,
    ENTREGUE
}

public class Enum {
    public static void main(String[] args) {
        // Variável do tipo enum.
        StatusPedido status = StatusPedido.PENDENTE;
        // Exibindo o valor escolhido.
        System.out.println("Status atual: " + status);
    }
}
