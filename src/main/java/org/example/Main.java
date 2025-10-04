package org.example;
import classes.Cachorro;
import classes.Dono;


public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();

        cachorro.setNome("Pandora");
        cachorro.setIdade(5);
        cachorro.setRaca("Golden");

        cachorro.exibirDados();

        Cachorro cachorro2 = new Cachorro();
        cachorro2.setNome("David");
        cachorro2.setRaca("Pinscher");
        cachorro2.setIdade(23);


        Dono dono = new Dono();

        dono.setNome("Gustavo");
        dono.setIdade(30);

        dono.mostrarDados();
    }
}

