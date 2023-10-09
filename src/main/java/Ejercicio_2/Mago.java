package Ejercicio_2;

public class Mago extends Personaje{

    private String magia;

    public Mago(Integer salud, String magia){
        super(salud);
        this.magia = magia;
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    @Override
    public Integer entrenar() {
        return null;
    }
}
