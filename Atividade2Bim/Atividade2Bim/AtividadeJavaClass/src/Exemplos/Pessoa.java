package Exemplos;

//Exemplo 1, de classe concreta

public class Pessoa {
    // Atributos da classe.
    private String nome;
    private int idade;
    // Construtor para inicializar os atributos.
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    // Método que exibe os dados do objeto.
    public void apresentar() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}
