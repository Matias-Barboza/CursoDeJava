package tiposAbstractosDeDatos.arbolBinario;

public class NodoBinario {
    private String dato;
    private NodoBinario padre;
    private NodoBinario hijoIzquierdo;
    private NodoBinario hijoDerecho;

    public NodoBinario(String dato){
        this.dato = dato;
        this.padre = null;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoBinario getPadre() {
        return padre;
    }

    public void setPadre(NodoBinario padre) {
        this.padre = padre;
    }

    public NodoBinario getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoBinario hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoBinario getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoBinario hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public boolean esHoja(){
        return hijoDerecho == null && hijoIzquierdo == null;
    }

    public String informacionAString(){
        if(padre == null){
            return "NodoBinario{" +
                    ", dato='" + dato + '\'' +
                    ", padre="+ null +
                    ", hijoIzquierdo={ Dato " + hijoIzquierdo.getDato() + "}" +
                    ", hijoDerecho={ Dato " + hijoDerecho.getDato() + "}" +
                    '}';
        }else if(hijoIzquierdo != null && hijoDerecho == null){
            return "NodoBinario{" +
                    ", dato='" + dato + '\'' +
                    ", padre={ Dato " + padre.getDato() + "}" +
                    ", hijoIzquierdo={ Dato " + hijoIzquierdo.getDato() +  "}" +
                    ", hijoDerecho=" + null +
                    '}';
        }else if(hijoIzquierdo == null && hijoDerecho != null){
            return "NodoBinario{" +
                    ", dato='" + dato + '\'' +
                    ", padre={ Dato " + padre.getDato() + "}" +
                    ", hijoIzquierdo="+ null +
                    ", hijoDerecho={  Dato " + hijoDerecho.getDato() +  "}" +
                    '}';
        }else if(hijoIzquierdo == null && hijoDerecho == null) {
            return "NodoBinario{" +
                    ", dato='" + dato + '\'' +
                    ", padre={ Dato " + padre.getDato() + "}" +
                    ", hijoIzquierdo="+ null +
                    ", hijoDerecho=" + null +
                    '}';
        }else{
            return "NodoBinario{" +
                    ", dato='" + dato + '\'' +
                    ", padre={ Dato " + padre.getDato() + "}" +
                    ", hijoIzquierdo={ Dato " + hijoIzquierdo.getDato() +  "}" +
                    ", hijoDerecho={ Dato " + hijoDerecho.getDato() +  "}" +
                    '}';
        }
    }

    @Override
    public String toString() {
        return informacionAString();
    }
}
