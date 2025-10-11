package classes;

public class Gato extends Animal{
    private String raca;

    @Override
    public void alimentar(){
        super.alimentar();
        System.out.println(super.getNome() +" Gostou Miaaau");

    }

    public Gato(String nome, String raca, int idade) {
        super.setNome(nome);
        super.setIdade(idade);
        this.raca = raca;
    }
}
