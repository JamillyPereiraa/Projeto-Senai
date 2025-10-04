package org.example;

class Cachorro {
    String nome;
    String raca;
    int idade;

    void latir() {
        System.out.println(nome + " está latindo: Au Au!");
    }

    void mostrarDados() {
        System.out.println("Nome: " + nome + "\nRaça: " + raca + "\nIdade: " + idade + " anos\n");
    }
}

class Dono {
    String nome;
    int idade;

    void mostrarDados() {
        System.out.println("Dono: " + nome + "\nIdade: " + idade + " anos\n");
    }
}

class Musica {
    String nome;
    String cantor;
    String estilo;
}




public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Brusk";
        cachorro.raca = "Golden";
        cachorro.idade = 5;


        Dono dono = new Dono();
        dono.nome = "Bruno";
        dono.idade = 26;

        System.out.println(" Dados do cachorro:");
        cachorro.latir();
        cachorro.mostrarDados();


        System.out.println("Dados do dono:");
        dono.mostrarDados();
    }
}

