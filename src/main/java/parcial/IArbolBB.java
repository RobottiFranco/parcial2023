package parcial;

import java.util.LinkedList;

public interface IArbolBB<T> {

    /**
     * Inserta un elemento en el arbol. En caso de ya existir un elemento con la
     * clave indicada en "unElemento", retorna falso.
     *
     * @param unElemento Elemento a insertar
     * @return Exito de la operaci�n
     */
    public boolean insertar(TElementoAB<T> unElemento);

    /**
     * Busca un elemento dentro del �rbol.
     *
     *
     * @param unaEtiqueta Etiqueta identificadora del elemento a buscar. .
     * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
     */
    public TElementoAB<T> buscar(Comparable unaEtiqueta);

    /**
     * Elimina un elemento dada una etiqueta.
     *
     * @param unaEtiqueta
     */
    public void eliminar(Comparable unaEtiqueta);



    /**
     *
     *
     * @return una LinkedList con los elementos del recorrido en preorden.
     *
     */
    public LinkedList<T> preOrden();

    /**
     *
     *
     * @return una LinkedList con los elementos del recorrido en inorden.
     *
     */
    public LinkedList<T> inOrden();


    /**
     *
     *
     * @return una LinkedList con los elementos del recorrido en postorden.
     *
     */
    public LinkedList<T> postOrden();
}
