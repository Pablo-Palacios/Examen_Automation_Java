package Ejercicio_2;

public class Torre extends Personaje{

    private Integer nivel = 0;

    public Torre(Integer salud, Integer nivel){
        super(salud);
        this.nivel = nivel;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    @Override
    public Integer entrenar() {
        nivel = nivel + 1;
        setNivel(nivel);
        return nivel;
    }
}
