package org.example;
import classes.Cachorro;
import classes.Dono;
import classes.Gato;


public class Main {
    public static void main(String[] args) {


        Gato gato = new Gato();

        gato.setNome("Nina");
        gato.setIdade(2);
        gato.setRaca("Siamês");


        Cachorro cachorro = new Cachorro("Pandora", "Golden", 5);

        cachorro.setNome("Pandora");
        cachorro.setIdade(5);
        cachorro.setRaca("Golden");

        Dono dono = new Dono("Gustavo", 30, cachorro);

        dono.setNome("Gustavo");
        dono.setIdade(30);
        dono.setAnimais(cachorro);
        dono.setAnimais(gato);
        dono.mostrarDados();

    }
}

