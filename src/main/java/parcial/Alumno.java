package parcial;


import java.util.List;

public class Alumno {
    int identificador;
    String nombre;
    String apellido;

    int[] cursos;

    public Alumno(int identificador, String nombre, String apellido, List<Integer> cursos) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cursos = cursos.stream().mapToInt(Integer::intValue).toArray();
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int[] getCursos() {
        return cursos;
    }
}
