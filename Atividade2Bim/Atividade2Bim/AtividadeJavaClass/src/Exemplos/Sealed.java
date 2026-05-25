package Exemplos;

//Exemplo 10, de classe selada (sealed class)

sealed class Veiculo permits Carro, Moto {
    public void mover() {
        System.out.println("O veículo está em movimento.");
    }
}
// Classe final permitida pela classe sealed.
final class Carro extends Veiculo {
    public void abrirPortaMalas() {
        System.out.println("Porta-malas aberto.");
    }
}
// Outra classe final permitida.
final class Moto extends Veiculo {
    public void empinar() {
        System.out.println("A moto empinou com segurança no exemplo didático.");
    }
}
public class Sealed {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.mover();
        c.abrirPortaMalas();
        Moto m = new Moto();
        m.mover();
        m.empinar();
    }
}
