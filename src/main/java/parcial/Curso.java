package parcial;

public class Curso {
    int identificador;
    String nombre;

    public Curso(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }
}
