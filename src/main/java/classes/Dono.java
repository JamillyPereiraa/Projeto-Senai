package classes;

import java.util.ArrayList;
import java.util.List;

public class Dono {
   private String nome;
   private int idade;
   private List<Animal> animais = new ArrayList<>();

    public Dono(String nome, int idade, Animal animais) {
        this.nome = nome;
        this.idade = idade;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setNome(String nome) {this.nome = nome;}
    public String getNome(){return nome;}

    public void setIdade(int idade) { this.idade = idade;}
    public int getIdade(){return idade;}

    public void setAnimais(Animal animal){
        this.animais.add(animal);
    }

    public void mostrarDados() {
        System.out.println( nome + " adotou: " + "\n");
        for (Animal a: animais) {
            System.out.println(a.getNome());
        }
    }

}