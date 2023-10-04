package Ejercicio_2;

public class Espadachin extends Personaje{

    private Integer ataque = 0;

    public Espadachin(Integer salud, Integer ataque){
        super(salud);
        this.ataque = ataque;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;

    }

    @Override
    public Integer entrenar() {
        ataque = ataque + 10;
        setAtaque(ataque);
        return this.ataque;


    }


}
