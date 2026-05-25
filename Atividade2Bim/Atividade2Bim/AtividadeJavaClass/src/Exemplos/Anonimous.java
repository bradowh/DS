package Exemplos;

//Exemplo 7 de classe anonima

interface Saudacao {
    void mostrarMensagem();
}
public class Anonimous {
    public static void main(String[] args) {
        // Classe anônima implementando a interface Saudacao.
        Saudacao s = new Saudacao() {
            @Override
            public void mostrarMensagem() {
                System.out.println("Olá! Esta mensagem vem de uma classe anônima.");
            }
        };
        // Chamando o método da classe anônima.
        s.mostrarMensagem();
    }
}
