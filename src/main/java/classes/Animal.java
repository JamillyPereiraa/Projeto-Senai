package classes;

abstract class Animal {
    private String nome;
    private String raca;
    private int idade;

    public Animal(String nome, String raca, int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;

    }

    public Animal(){

    }

    public void setNome(String nome) {this.nome = nome;}
    public String getNome() {return nome;}

    public void setRaca(String raca) {this.raca = raca;}
    public String getRaca() {return raca;}

    public void setIdade(int idade) {this.idade = idade;}
    public int getIdade() {return idade;}

    public void exibirDados(){
        System.out.println("nome: " + Animal.this.getNome() + "\n" + "raca: " + Animal.this.getRaca() + "\n" + "idade: " + Animal.this.getIdade());
    }
}
