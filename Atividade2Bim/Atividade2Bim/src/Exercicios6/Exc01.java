package Exercicios6;

//Crie uma classe Pessoa com atributos privados nome e idade, e crie métodos getters e setters para eles.

public class Exc01{
    public String nome;
    public int idade;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {

        Exc01 p = new Exc01();
        p.setNome("João");
        p.setIdade(16);

        System.out.println(p.getNome());
        System.out.println(p.getIdade());
    }
}
