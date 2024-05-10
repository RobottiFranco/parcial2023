package parcial;

import java.util.LinkedList;

// Se puede modificar la clase de la cual se hereda si se considera necesario
public class TArbolBBAlumnos extends TArbolBB<Alumno> implements IArbolBBAlumnos {

    @Override
    public void armarSubgrupos(TArbolBB<Alumno> grupoImpares, TArbolBB<Alumno> grupoPares) {
/*         aux(this, grupoImpares, grupoPares, 0);
 */    }

/*     private int aux(TArbolBBAlumnos arbolOriginal,TArbolBB<Alumno> grupoImpares, TArbolBB<Alumno> grupoPares, int nivel){

        TElementoAB actual = arbolOriginal.getRaiz();

        if (nivel % 2 == 0) {
            grupoPares.insertar(actual);
        }else{
            grupoPares.insertar(actual);
        }

        if (actual.getHijoIzq() != null) {
            aux(actual.getHijoIzq(), grupoImpares, grupoPares, nivel)
        }
    }



    public void armarSubgrupos(TArbolBB<T> grupoImpares, TArbolBB<T> grupoPares, int nivel) {
        if (nivel % 2 == 0){
            grupoPares.insertar(this);
        } else {
            grupoImpares.insertar(this);
        }
        if( hijoIzq != null){
            hijoIzq.armarSubgrupos(grupoImpares, grupoPares, nivel + 1);
        }

        if( hijoDer != null){
            hijoDer.armarSubgrupos(grupoImpares, grupoPares, nivel + 1);
        }        
    }
 */
}
