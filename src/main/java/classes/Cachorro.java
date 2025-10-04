package classes;

public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public void setNome(String nome) {this.nome = nome;}
    public String getNome() {return nome;}

    public void setRaca(String raca) {this.raca = raca;}
    public String getRaca() {return raca;}

    public void setIdade(int idade) {this.idade = idade;}
    public int getIdade() {return idade;}

    public void exibirDados(){
        System.out.println("nome: " + Cachorro.this.getNome() + "\n" + "raca: " + Cachorro.this.getRaca() + "\n" + "idade: " + Cachorro.this.getIdade());
    }


    void mostrarDados() {
        System.out.println("Nome: " + nome + "\nRaça: " + raca + "\nIdade: " + idade + " anos\n");
    }
}



