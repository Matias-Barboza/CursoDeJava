package tiposAbstractosDeDatos.listaDoblementeEnlazada;

public class NodoDoble {
    private String dato;
    private NodoDoble siguiente;
    private NodoDoble anterior;
    private int indice;

    public NodoDoble(String dato, int indice){
        this.dato = dato;
        this.indice = indice;
        siguiente = null;
        anterior = null;
    }

    public String getDato(){
        return dato;
    }

    public NodoDoble getSiguiente(){
        return siguiente;
    }

    public NodoDoble getAnterior(){
        return anterior;
    }

    public int getIndice(){
        return indice;
    }

    public void setIndice(int indice){
        this.indice = indice;
    }

    public void setSiguiente(NodoDoble siguiente){
        this.siguiente = siguiente;
    }
    public void setAnterior(NodoDoble anterior){
        this.anterior = anterior;
    }

    private String informacionAString(){
        if(getAnterior() == null){
            return "Nodo{" +
                    "dato='" + dato + '\'' +
                    ", siguiente=" + siguiente.getDato() +
                    ", anterior=null"+
                    ", indice=" + indice +
                    '}';
        }else if(getSiguiente() == null){
            return "Nodo{" +
                    "dato='" + dato + '\'' +
                    ", siguiente=null" +
                    ", anterior=" + anterior.getDato() +
                    ", indice=" + indice +
                    '}';
        }else{
            return "Nodo{" +
                    "dato='" + dato + '\'' +
                    ", siguiente=" + siguiente.getDato() +
                    ", anterior=" + anterior.getDato() +
                    ", indice=" + indice +
                    '}';
        }
    }

    @Override
    public String toString() {
        return informacionAString();
    }
}
