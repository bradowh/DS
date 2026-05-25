package Exemplos;

//exemplo 5, de classe estática aninhada

class Empresa {

// Classe aninhada estática: não depende de instância da classe externa.

static class Departamento {
    private String nome;
    public Departamento(String nome) {
        this.nome = nome;
    }
    public void mostrar() {
        System.out.println("Departamento: " + nome);
    }
}
}
public class StaticNested {
    public static void main(String[] args) {

        // A classe aninhada estática pode ser criada sem objeto externo.

        Empresa.Departamento d = new Empresa.Departamento("Financeiro");
        d.mostrar();
    }
}

