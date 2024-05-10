package parcial;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    List<Alumno> listaAlumnos = new ArrayList<>();
    List<Curso> listaCursos = new ArrayList<>();

    Facultad() {
        listaAlumnos = this.listaAlumnos;
        listaCursos = this.listaCursos;
    }

    public TArbolBBAlumnos armarIndiceCurso(String cursoNombre) {
        if (this.listaAlumnos != null) {
            TArbolBBAlumnos indice = new TArbolBBAlumnos();
            int codigoClase = codigoClase(cursoNombre);
            for (Alumno alumno : listaAlumnos) {
                if (alumnoContieneCurso(codigoClase, alumno.getCursos())) {
                    TElementoAB alu = new TElementoAB<Alumno>(alumno.getIdentificador(), alumno);
                    indice.insertar(alu);
                }
            }
            return indice;
        }
        return null;
    }

    private int codigoClase(String cursoNombre) {
        for (Curso curso : listaCursos) {
            if (curso.getNombre().equals(cursoNombre)) {
                return curso.getIdentificador();
            }
        }
        return 0;
    }

    private boolean alumnoContieneCurso(int codigoClase, int[] listaCursos) {
        for (int i = 0; i < listaCursos.length; i++) {
            if (listaCursos[i] == codigoClase) {
                return true;
            }
        }
        return false;
    }
}
