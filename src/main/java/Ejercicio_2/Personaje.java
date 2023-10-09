package Ejercicio_2;

abstract public class Personaje {

    protected Integer salud;

    public Personaje(Integer salud){
        this.salud = salud;
    }

    public Integer getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }

    abstract public Integer entrenar();



}
