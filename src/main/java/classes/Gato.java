package classes;

public class Gato {
    private String nome;
    private int idade;
    private String raca;

    public Gato(String nome, String raca, int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void MostrarDados () {
        System.out.println("nome: " + nome + "\nraca: " + raca + "\nidade: " + idade);
    }
}
