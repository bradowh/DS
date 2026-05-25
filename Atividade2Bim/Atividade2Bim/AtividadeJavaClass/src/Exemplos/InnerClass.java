package Exemplos;

//Exemplo 4, de classe interna

class Computador {
    // Atributo da classe externa.
    private String marca;
    public Computador(String marca) {
        this.marca = marca;
    }
    // Classe interna: depende de um objeto Computador.
    class Processador {
        private String modelo;
        public Processador(String modelo) {
            this.modelo = modelo;
        }
        public void mostrarDados() {
            // A classe interna pode acessar atributos da classe externa.
            System.out.println("Marca do computador: " + marca);
            System.out.println("Modelo do processador: " + modelo);
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        // Criando objeto externo.
        Computador pc = new Computador("Dell");
        // Criando objeto da classe interna associado ao objeto externo.
        Computador.Processador proc = pc.new Processador("Intel i5");
        proc.mostrarDados();
    }
}
