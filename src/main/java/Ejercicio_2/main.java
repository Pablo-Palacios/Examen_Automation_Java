package Ejercicio_2;

public class main {

    public static void main(String[] args) {

        Espadachin espadachin = new Espadachin(100, 0);
        Torre torre = new Torre(100, 0);
        Mago mago = new Mago(100,"magia");


        System.out.println(" ");
        System.out.println("................... PERSONAJES ........................");
        System.out.println(" ");


        System.out.println(">>> ESPADACHIN");
        System.out.println(" ");

        System.out.println(" Salud: "+ espadachin.getSalud() + " Ataque: " + espadachin.getAtaque());
        System.out.println(" ");
        System.out.println("El ESPADACHIN se ha puesto a entrenar, incrementará un % 10 su Ataque!!");
        espadachin.entrenar();
        System.out.println(" ");

        System.out.println(" Salud: "+ espadachin.getSalud() + " Ataque: " + espadachin.getAtaque());
        System.out.println(" ");
        System.out.println("El ESPADACHIN se ha puesto a entrenar, incrementará un % 10 su Ataque!!");
        espadachin.entrenar();
        System.out.println(" ");

        System.out.println(" Salud: "+ espadachin.getSalud() + " Ataque: " + espadachin.getAtaque());


        System.out.println(" ");
        System.out.println(" ");



        System.out.println(">>> TORRE");
        System.out.println(" ");

        System.out.println(" Salud: "+ torre.getSalud() + " Nivel: " + torre.getNivel());
        System.out.println(" ");
        System.out.println("La TORRE se ha puesto a entrenar, incrementará un % 1 su Nivel!!");
        torre.entrenar();
        System.out.println(" ");
        System.out.println(" Salud: "+ torre.getSalud() + " Nivel: " + torre.getNivel());
        System.out.println(" ");
        System.out.println("La TORRE se ha puesto a entrenar, incrementará un % 1 su Nivel!!");
        torre.entrenar();
        System.out.println(" ");
        System.out.println(" Salud: "+ torre.getSalud() + " Nivel: " + torre.getNivel());


        System.out.println(" ");
        System.out.println(" ");


        System.out.println(">>> MAGO");
        System.out.println(" ");

        System.out.println(" Salud: "+ mago.getSalud() + " Poder: " + mago.getMagia());
        System.out.println(" ");
        System.out.println("El MAGO no entrena, es un vago, pero sabio!!");














    }

}
