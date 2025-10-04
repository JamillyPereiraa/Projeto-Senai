package classes;

public class Dono {
   private String nome;
   private int idade;

    public void setNome(String nome) {this.nome = nome;}
    public String getNome(){return nome;}

    public void setIdade(int idade) { this.idade = idade;}
    public int getIdade(){return idade;}

    public void mostrarDados() {
        System.out.println("Dono: " + nome + "\nIdade: " + idade + " anos\n");
    }
}
