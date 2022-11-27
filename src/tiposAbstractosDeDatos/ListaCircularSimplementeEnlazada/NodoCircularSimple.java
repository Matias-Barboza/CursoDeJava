package tiposAbstractosDeDatos.ListaCircularSimplementeEnlazada;

public class NodoCircularSimple {
    private String dato;
    private NodoCircularSimple siguiente;
    private int indice;

    public NodoCircularSimple(String dato, int indice){
        this.dato = dato;
        this.indice = indice;
        siguiente = null;
    }

    public String getDato() {
        return dato;
    }

    public NodoCircularSimple getSiguiente() {
        return siguiente;
    }

    public int getIndice() {
        return indice;
    }

    public void setSiguiente(NodoCircularSimple siguiente) {
        this.siguiente = siguiente;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    @Override
    public String toString() {
        return "NodoCircularSimple{" +
                "dato='" + dato + '\'' +
                ", siguiente=" + siguiente.getDato() +
                ", indice=" + indice +
                '}';
    }
}
