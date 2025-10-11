package classes;

public class Animal {
    private String nome;
    private int idade;

    public void emitirSom() {
        System.out.println("Som de animal");
    }

    public void alimentar(){
        System.out.println("Alimentando");
    }

    public void mostrarDados () {
        System.out.println("Nome: " + nome + "\nIdade: " + idade);
    }

    public void setNome(String nome) {this.nome = nome;}
    public String getNome() {return nome;}

    public void setIdade(int idade) {this.idade = idade;}
    public int getIdade() {return idade;}



}