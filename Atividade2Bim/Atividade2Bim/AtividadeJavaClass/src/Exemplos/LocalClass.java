package Exemplos;

//exemplo 6, de classe local

class Relatorio {
    public void gerar() {
        // Classe local: só existe dentro deste método.
        class Cabecalho {
            private String titulo;
            public Cabecalho(String titulo) {
                this.titulo = titulo;
            }
            public void mostrar() {
                System.out.println("=== " + titulo + " ===");
            }
        }
        // Criando e usando a classe local.
        Cabecalho cab = new Cabecalho("Relatório de Vendas");
        cab.mostrar();
        System.out.println("Conteúdo do relatório...");
    }
}
public class LocalClass {
    public static void main(String[] args) {
        Relatorio r = new Relatorio();
        r.gerar();
    }
}

