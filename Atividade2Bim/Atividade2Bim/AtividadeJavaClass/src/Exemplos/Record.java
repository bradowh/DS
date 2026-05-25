package Exemplos;

//Exemplo 09, de Record class

record Aluno(String nome, int idade) {
    // Bloco opcional para validações.
    public Aluno {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
    }
}
public class Record {
    public static void main(String[] args) {
        // Criando um objeto record.
        Aluno a = new Aluno("Marina", 18);
        // Métodos nome() e idade() são gerados automaticamente.
        System.out.println("Nome: " + a.nome());
        System.out.println("Idade: " + a.idade());
        System.out.println(a);
    }
}
