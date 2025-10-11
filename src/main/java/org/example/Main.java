package org.example;
import classes.Cachorro;
import classes.Dono;
import classes.Gato;


public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();

        cachorro.setNome("Pandora");
        cachorro.setIdade(5);
        cachorro.setRaca("Golden");

        cachorro.exibirDados();

        Dono dono = new Dono();

        dono.setNome("Gustavo");
        dono.setIdade(30);

        dono.mostrarDados();

        Gato cat1 = new  Gato("Miau", "Siamês", 2);

        cat1.MostrarDados();
    }
}

