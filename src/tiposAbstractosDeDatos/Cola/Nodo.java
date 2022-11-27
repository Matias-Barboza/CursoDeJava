package tiposAbstractosDeDatos.Cola;

public class Nodo {
    private String dato;
    private Nodo anterior;
    private int indice;

    public Nodo(String dato,int indice){
        this.dato = dato;
        this.indice = indice;
        anterior = null;
    }

    public String getDato() {
        return dato;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public int getIndice() {
        return indice;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String informacionAString(){
        if(getAnterior() == null){
            return "Nodo{" +
                    "dato='" + dato + '\'' +
                    ", anterior=null" +
                    ", indice=" + indice +
                    '}';
        }else{
            return "Nodo{" +
                    "dato='" + dato + '\'' +
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
