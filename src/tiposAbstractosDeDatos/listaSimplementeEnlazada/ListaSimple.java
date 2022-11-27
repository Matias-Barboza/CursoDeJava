package tiposAbstractosDeDatos.listaSimplementeEnlazada;

public class ListaSimple {
    private NodoSimple primero;
    private int indice = 0;
    private int tamanho = 0;

    public ListaSimple(){
        primero = null;
    }

    public int getTamanho(){
        return tamanho;
    }

    public NodoSimple getPrimero(){
        return primero;
    }

    public void enlazar(String dato){

        NodoSimple nuevo = new NodoSimple(dato,indice);
        indice++;

        if(vacia()){
            primero = nuevo;
        }else{
            NodoSimple aux = primero;

            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }

            aux.setSiguiente(nuevo);
        }

        tamanho++;
    }

    public boolean vacia(){
        return primero == null;
    }

    public String devolverValor(int indice){

        NodoSimple aux = primero;

        if(vacia()){
            System.out.println("Lista simplemente enlazada vacia");
            return "-1";
        }else {
            if (indice > tamanho - 1 || indice < 0) {
                return "-1";
            }
            while (aux.getIndice() != indice && aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
        }

        return aux.getDato();
    }

    public void eliminarUltimo(){

        NodoSimple aux = primero;
        NodoSimple anterior = null;

        if(vacia()){
            System.out.println("Lista simplemente enlazada vacia");
        }else{
            while (aux.getSiguiente() != null) {
                anterior = aux;
                aux = aux.getSiguiente();
            }
            anterior.setSiguiente(null);
            tamanho--;
            indice--;
        }
    }

    public void eliminar(int indice){

        NodoSimple aux = primero;
        NodoSimple anterior = null;

        if(vacia()){
            System.out.println("Lista simplemente enlazada vacia");
        }else if (indice >= 0 && indice < tamanho){
            if(indice != 0) {
                while (aux.getIndice() != indice) {
                    anterior = aux;
                    aux = aux.getSiguiente();
                }

                anterior.setSiguiente(aux.getSiguiente());
                aux = null;
                tamanho--;
                //this.indice--;
            }else{
                primero = aux.getSiguiente();
                aux = null;
                tamanho--;
                //this.indice--;
            }

            reIndexar();
        }else{
            System.out.println("Indice invalido");
        }
    }

    public void imprimir(){

        NodoSimple aux = primero;

        if(vacia()){
            System.out.println("Lista simplemente enlazada vacia");
        }else {
            for (int i = 0; i < tamanho; i++) {
                System.out.print(aux.getDato());
                System.out.print("; ");
                aux = aux.getSiguiente();
            }
        }
    }

    public void imprimirConIndice(){

        NodoSimple aux = primero;

        if(vacia()){
            System.out.println("Lista simplemente enlazada vacia");
        }else {
            for (int i = 0; i < tamanho; i++) {
                System.out.print(aux.getDato());
                System.out.print(" [" + aux.getIndice() + "]; ");
                aux = aux.getSiguiente();
            }
        }
    }

    private void reIndexar(){
        indice = 0;

        NodoSimple aux = primero;

        for (int i = 0; i < tamanho; i++) {
            aux.setIndice(indice);
            indice++;
            aux = aux.getSiguiente();
        }
    }

    public void imprimirInformacionNodos(){

        NodoSimple aux = primero;

        if(vacia()){
            System.out.println("Lista simplemente enlazada vacia");
        }else {
            for (int i = 0; i < tamanho; i++) {
                System.out.println(aux);
                aux = aux.getSiguiente();
            }
        }
    }

    public void imprimirInformacionNodo(int indice){

        NodoSimple aux = primero;

        if(vacia()){
            System.out.println("Lista simplemente enlazada vacia");
        }else {
            for (int i = 0; i < tamanho; i++) {
                if(i == indice){
                    System.out.println(aux);
                }
                aux = aux.getSiguiente();
            }
        }
    }
}
