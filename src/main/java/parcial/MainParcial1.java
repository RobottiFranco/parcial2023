package parcial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Parcial 1
 *
 */
public class MainParcial1 {
    public static void main(String[] args) {
        Facultad facultad = new Facultad();

        String[] file = ManejadorArchivosGenerico.leerArchivo("alumnos.csv");
        String[] linea;
        for (String string : file) {
            linea = string.split(",");
            List<Integer> cursos = new ArrayList<>();
            for (int i = 3; i < linea.length; i++) {
                cursos.add(Integer.parseInt(linea[i]));
            }
            Alumno alumno = new Alumno(Integer.parseInt(linea[0]), linea[1], linea[2], cursos);
            facultad.listaAlumnos.add(alumno);
        }

        file = ManejadorArchivosGenerico.leerArchivo("cursos.csv");
        for (String string : file) {
            linea = string.split(",");
            Curso curso = new Curso(Integer.parseInt(linea[0]), linea[1]);
            facultad.listaCursos.add(curso);
        }

        TArbolBBAlumnos cursoPorIndice = facultad.armarIndiceCurso("Programacion en Tcl");

        LinkedList<Alumno> cursoPorIndiceOrdenado = cursoPorIndice.inOrden();
        System.out.println(cursoPorIndiceOrdenado);
        for (Alumno string : cursoPorIndiceOrdenado) {

            String linea2 = string.getIdentificador() + " " + string.getNombre() + " " + string.getApellido();
            System.out.println(linea2);
            String[] lineaEscrita = {linea2};
            ManejadorArchivosGenerico.escribirArchivo("salida.csv", lineaEscrita);

        }

        TArbolBBAlumnos pares = new TArbolBBAlumnos();
        TArbolBBAlumnos inpares = new TArbolBBAlumnos();


        cursoPorIndice.armarSubgrupos(inpares, pares);
    }
}
