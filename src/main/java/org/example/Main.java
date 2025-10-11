package org.example;
import classes.Cachorro;
import classes.Gato;

public class Main {
    public static void main(String[] args) {
        Cachorro dog1 = new Cachorro();
        dog1.setNome("Dog 1");
        dog1.setIdade(10);
        dog1.setRaca("Golden");
        dog1.emitirSom();
        dog1.alimentar();
        System.out.println(dog1.getNome() + "\n"+dog1.getIdade() + "\n"+dog1.getRaca());

        Gato cat1 = new Gato("Miau", "vira-lata", 3);
        cat1.mostrarDados();
        cat1.alimentar();
        cat1.emitirSom();
    }
}