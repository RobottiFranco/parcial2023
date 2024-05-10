package parcial;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Unit test for implemented methods.
 */
public class Parcial1Test_Junit5 {
    Facultad facultad;

    @BeforeEach
    public void setUp() {
        facultad = new Facultad();
    }

    /**
     * Sample test in JUnit 5
     */
    @Test
    public void listaAlumnosVacia() {
        assertEquals(0, facultad.listaAlumnos.size());
    }

    @Test
    public void listaCursosVacia() {
        assertEquals(0, facultad.listaCursos.size());
    }

    @Test
    public void listaCursos1Elemento() {
        facultad.listaCursos.add(new Curso(1, "calculo"));
        assertEquals(1, facultad.listaCursos.size());
    }

    @Test
    public void listaAlumnos1Elemento() {
        List<Integer> cursos = new ArrayList<>();
        cursos.add(1);
        facultad.listaAlumnos.add(new Alumno(1, "Juan", "Pepe", cursos));
        assertEquals(1, facultad.listaAlumnos.size());
    }


    @Test
    public void armarIndiceCurso() {

        facultad.listaCursos.add(new Curso(1, "calculo"));
        facultad.listaCursos.add(new Curso(2, "calculo 2"));


        List<Integer> cursos = new ArrayList<>();
        cursos.add(1);
        facultad.listaAlumnos.add(new Alumno(1, "Juan", "Pepe", cursos));

        cursos.clear();
        cursos.add(2);
        facultad.listaAlumnos.add(new Alumno(2, "Franco", "Pepe", cursos));

        LinkedList<Alumno> x = facultad.armarIndiceCurso("calculo").inOrden();
        assertEquals(1, x.size());
    }

    @Test
    public void armarIndiceCursoVacio() {
        facultad.listaCursos.add(new Curso(1, "calculo"));
        facultad.listaCursos.add(new Curso(2, "calculo 2"));


        List<Integer> cursos = new ArrayList<>();
        cursos.add(2);
        facultad.listaAlumnos.add(new Alumno(1, "Juan", "Pepe", cursos));

        cursos.clear();
        cursos.add(2);
        facultad.listaAlumnos.add(new Alumno(2, "Franco", "Pepe", cursos));

        LinkedList<Alumno> x = facultad.armarIndiceCurso("calculo").inOrden();

        assertNull(x);
    }

}
