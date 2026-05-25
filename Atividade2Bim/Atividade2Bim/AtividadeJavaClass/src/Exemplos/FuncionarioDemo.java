package Exemplos;

//Exemplo 2, classe abstrata

abstract class Funcionario {
    // Atributo protegido para ser reutilizado nas subclasses.
    protected String nome;
    // Construtor da classe abstrata.
    public Funcionario(String nome) {
        this.nome = nome;
    }
    // Método concreto: já possui implementação.
    public void mostrarNome() {
        System.out.println("Funcionário: " + nome);
    }
    // Método abstrato: cada subclasse deve implementar.
    public abstract double calcularSalario();
}
// Subclasse concreta que implementa o método abstrato.
class FuncionarioCLT extends Funcionario {
    private double salarioBase;
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }
    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}
public class FuncionarioDemo {
    public static void main(String[] args) {
        // Não é possível fazer: new Funcionario(...)
        Funcionario f = new FuncionarioCLT("Carlos", 3500.0);
        f.mostrarNome();
        System.out.println("Salário: R$ " + f.calcularSalario());
    }
}

