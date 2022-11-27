package tiposAbstractosDeDatos.ListaCircularDoblementeEnlazada;

public class NodoCircularDoble {
    private String dato;
    private NodoCircularDoble siguiente;
    private NodoCircularDoble anterior;
    private int indice;

    public NodoCircularDoble(String dato,int indice){
        this.dato = dato;
        this.indice = indice;
        siguiente = null;
        anterior = null;
    }

    public String getDato() {
        return dato;
    }

    public NodoCircularDoble getSiguiente() {
        return siguiente;
    }

    public NodoCircularDoble getAnterior() {
        return anterior;
    }

    public int getIndice() {
        return indice;
    }

    public void setSiguiente(NodoCircularDoble siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(NodoCircularDoble anterior) {
        this.anterior = anterior;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    @Override
    public String toString() {
        return "NodoCircularDoble{" +
                "dato='" + dato + '\'' +
                ", siguiente=" + siguiente.getDato() +
                ", anterior=" + anterior.getDato() +
                ", indice=" + indice +
                '}';
    }
}
