package tiposAbstractosDeDatos.listaSimplementeEnlazada;

public class NodoSimple {
    private String dato;
    private NodoSimple siguiente;
    private int indice;

    public NodoSimple(String dato, int indice){
        this.dato = dato;
        this.indice = indice;
        siguiente = null;
    }

    public String getDato(){
        return dato;
    }

    public NodoSimple getSiguiente(){
        return siguiente;
    }

    public int getIndice(){
        return indice;
    }

    public void setIndice(int indice){
        this.indice = indice;
    }

    public void setSiguiente(NodoSimple siguiente){
        this.siguiente = siguiente;
    }

    public String informacionAString(){
        if(getSiguiente() == null){
            return "Nodo{" +
                    "dato='" + dato + '\'' +
                    ", siguiente=null" +
                    ", indice=" + indice +
                    '}';
        }else{
            return "Nodo{" +
                    "dato='" + dato + '\'' +
                    ", siguiente=" + siguiente.getDato() +
                    ", indice=" + indice +
                    '}';
        }
    }

    @Override
    public String toString() {
        return informacionAString();
    }
}
