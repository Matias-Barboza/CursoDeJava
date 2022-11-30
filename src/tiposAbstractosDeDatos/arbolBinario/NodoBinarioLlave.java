package tiposAbstractosDeDatos.arbolBinario;

public class NodoBinarioLlave {
    private int llave;
    private String dato;
    private NodoBinarioLlave padre;
    private NodoBinarioLlave hijoIzquierdo;
    private NodoBinarioLlave hijoDerecho;

    public NodoBinarioLlave(int llave, String dato){
        this.llave = llave;
        this.dato = dato;
        this.padre = null;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    public int getLlave() {
        return llave;
    }

    public void setLlave(int llave) {
        this.llave = llave;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoBinarioLlave getPadre() {
        return padre;
    }

    public void setPadre(NodoBinarioLlave padre) {
        this.padre = padre;
    }

    public NodoBinarioLlave getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoBinarioLlave hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoBinarioLlave getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoBinarioLlave hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public boolean esHoja(){
        return hijoDerecho == null && hijoIzquierdo == null;
    }

    public String informacionAString(){
        if(padre == null){
            return "NodoBinarioLlave{" +
                    "llave=" + llave +
                    ", dato='" + dato + '\'' +
                    ", padre="+ null +
                    ", hijoIzquierdo={ Llave " + hijoIzquierdo.getLlave() + ", Dato " + hijoIzquierdo.getDato() + "}" +
                    ", hijoDerecho={ Llave " + hijoDerecho.getLlave() + ", Dato " + hijoDerecho.getDato() + "}" +
                    '}';
        }else if(hijoIzquierdo != null && hijoDerecho == null){
            return "NodoBinarioLlave{" +
                    "llave=" + llave +
                    ", dato='" + dato + '\'' +
                    ", padre={ Llave " + padre.getLlave() + ", Dato " + padre.getDato() + "}" +
                    ", hijoIzquierdo={ Llave " + hijoIzquierdo.getLlave() + ", Dato " + hijoIzquierdo.getDato() +  "}" +
                    ", hijoDerecho=" + null +
                    '}';
        }else if(hijoIzquierdo == null && hijoDerecho != null){
            return "NodoBinarioLlave{" +
                    "llave=" + llave +
                    ", dato='" + dato + '\'' +
                    ", padre={ Llave " + padre.getLlave() + ", Dato " + padre.getDato() + "}" +
                    ", hijoIzquierdo="+ null +
                    ", hijoDerecho={ Llave " + hijoDerecho.getLlave() + ", Dato " + hijoDerecho.getDato() +  "}" +
                    '}';
        }else if(hijoIzquierdo == null && hijoDerecho == null) {
            return "NodoBinarioLlave{" +
                    "llave=" + llave +
                    ", dato='" + dato + '\'' +
                    ", padre={ Llave " + padre.getLlave() + ", Dato " + padre.getDato() + "}" +
                    ", hijoIzquierdo="+ null +
                    ", hijoDerecho=" + null +
                    '}';
        }else{
            return "NodoBinarioLlave{" +
                    "llave=" + llave +
                    ", dato='" + dato + '\'' +
                    ", padre={ Llave " + padre.getLlave() + ", Dato " + padre.getDato() + "}" +
                    ", hijoIzquierdo={ Llave" + hijoIzquierdo.getLlave() + ", Dato " + hijoIzquierdo.getDato() +  "}" +
                    ", hijoDerecho={ Llave " + hijoDerecho.getLlave() + ", Dato " + hijoDerecho.getDato() +  "}" +
                    '}';
        }
    }

    @Override
    public String toString() {
        return informacionAString();
    }
}
