package parcial;

import java.util.LinkedList;

public interface IElementoAB<T> {

    /**
     * Obtiene el valor de la etiqueta del nodo.
     *
     * @return Etiqueta del nodo.
     */
    public Comparable getEtiqueta();

    /**
     * Obtiene el hijo izquierdo del nodo.
     *
     * @return Hijo Izquierdo del nodo.
     */
    public TElementoAB<T> getHijoIzq();

    /**
     * Obtiene el hijo derecho del nodo.
     *
     * @return Hijo derecho del nodo.
     */
    public TElementoAB<T> getHijoDer();

    /**
     * Asigna el hijo izquierdo del nodo.
     *
     * @return Elemento a ser asignado como hijo izquierdo.
     */
    public void setHijoIzq(TElementoAB<T> elemento);

    /**
     * Asigna el hijo derecho del nodo.
     *
     * @return Elemento a ser asignado como hijo derecho.
     */
    public void setHijoDer(TElementoAB<T> elemento);

    /**
     * Busca un elemento dentro del arbol con la etiqueta indicada.
     *
     * @param unaEtiqueta del nodo a buscar
     * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
     */
    public TElementoAB<T> buscar(Comparable unaEtiqueta);



    /**
     * Inserta un elemento dentro del arbol.
     *
     * @param elemento Elemento a insertar.
     * @return Exito de la operaci�n.
     */
    public boolean insertar(TElementoAB<T> elemento);



     /**
     * pone las etiquetas del recorrido en preorden en una linkedlist.
     *
     * @param unaLista
     */
    public void preOrden(LinkedList<T> unaLista);

       /**
     * pone las etiquetas del recorrido en inorden en una linkedlist.
     *
     * @param unaLista
     */
    public void inOrden(LinkedList<T> unaLista);


       /**
     * pone las etiquetas del recorrido en postorden en una linkedlist.
     *
     * @param unaLista
     */
    public void postOrden(LinkedList<T> unaLista);

    /**
     * Retorna los datos contenidos en el elemento.
     *
     * @return
     */
    public T getDatos();

    /**
     * Elimina un elemento dada una etiqueta.
     * @param unaEtiqueta
     * @return
     */
    public TElementoAB<T> eliminar(Comparable unaEtiqueta);

    public int obtenerTamanio();


}
