package classes;

public class Cachorro extends Animal {
    private String raca;

    @Override
    public void emitirSom(){
        super.emitirSom();
        System.out.println( super.getNome() + "Está latindo: Au au au au au au au au");
    };

    @Override
    public void alimentar(){
        super.alimentar();
        System.out.println(super.getNome()+" Gostou Auau");
    }
    public void setRaca(String raca) {this.raca = raca;}
    public String getRaca() {return raca;}


}