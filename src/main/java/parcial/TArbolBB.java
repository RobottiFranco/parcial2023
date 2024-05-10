package parcial;

import java.util.LinkedList;

public class TArbolBB<T> implements IArbolBB<T> {

    private TElementoAB<T> raiz;

    public TElementoAB<T> getRaiz() {
        return raiz;
    }

    /**
     * Separador utilizado entre elemento y elemento al imprimir la lista
     */
    public static final String SEPARADOR_ELEMENTOS_IMPRESOS = "-";

    public TArbolBB() {
        raiz = null;
    }

    /**
     * @param unElemento
     * @return
     */
    public boolean insertar(TElementoAB<T> unElemento) {
        if (esVacio()) {
            raiz = unElemento;
            return true;
        } else {
            return raiz.insertar(unElemento);
        }
    }

    /**
     * @param unaEtiqueta
     * @return
     */
    @SuppressWarnings("unchecked")
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        if (esVacio()) {
            return null;
        } else {
            return raiz.buscar(unaEtiqueta);
        }
    }

    public boolean esVacio() {
        return (raiz == null);
    }

    /**
     * @return True si habían elementos en el árbol, false en caso contrario
     */
    public boolean vaciar() {
        if (!esVacio()) {
            raiz = null;
            return true;
        }
        return false;
    }

    @Override
    public LinkedList<T> inOrden() {
        LinkedList<T> listaInorden = null;
        if (!esVacio()) {
            listaInorden = new LinkedList<>();
            raiz.inOrden(listaInorden);
        }
        return listaInorden;

    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        if (!esVacio()) {
            this.raiz = this.raiz.eliminar(unaEtiqueta);
        }
    }

    @Override
    public LinkedList<T> preOrden() {
        LinkedList<T> listaPreOrden = null;
        if (!esVacio()) {
            listaPreOrden = new LinkedList<>();
            raiz.preOrden(listaPreOrden);
        }
        return listaPreOrden;
    }

    @Override
    public LinkedList<T> postOrden() {
        LinkedList<T> listaPostOrden = null;
        if (!esVacio()) {
            listaPostOrden = new LinkedList<>();
            raiz.postOrden(listaPostOrden);
        }
        return listaPostOrden;

    }

    public int obtenerNivel(Comparable unaEtiqueta) {
        if (raiz != null) {
            return raiz.obtenerNivel(unaEtiqueta);
        }
        return -1;
    }

}
