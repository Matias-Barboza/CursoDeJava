package tiposAbstractosDeDatos.ListaCircularDoblementeEnlazada;

public class ListaCircularDoble {
    private NodoCircularDoble primero;
    private NodoCircularDoble ultimo;
    private int tamanho = 0;
    private int indice = 0;

    public ListaCircularDoble(){
        primero = null;
        ultimo = null;
    }

    public NodoCircularDoble getPrimero() {
        return primero;
    }

    public NodoCircularDoble getUltimo() {
        return ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void enlazar(String dato){

        NodoCircularDoble nuevo = new NodoCircularDoble(dato,indice);
        indice++;

        if(vacia()){
            primero = nuevo;
            ultimo = nuevo;
            primero.setSiguiente(ultimo);
            primero.setAnterior(ultimo);
            ultimo.setSiguiente(primero);
            ultimo.setAnterior(primero);
        }else{
            NodoCircularDoble aux = ultimo;

            aux.setSiguiente(nuevo);
            ultimo = nuevo;
            ultimo.setAnterior(aux);
            ultimo.setSiguiente(primero);
            primero.setAnterior(ultimo);
        }

        tamanho++;
    }

    public boolean vacia(){
        return primero == null;
    }

    public String devolverValor(int indice){
        NodoCircularDoble aux = primero;

        if(vacia()){
            System.out.println("Lista circular doblemente enlazada vacia");
            return "-1";
        }else{
            if(indice < 0 || indice > tamanho - 1){
                return "-1";
            }else{
                while (aux.getIndice() != indice){
                    aux = aux.getSiguiente();
                }

                return aux.getDato();
            }
        }
    }

    public void eliminarUltimo(){

        if(vacia()){
            System.out.println("Lista circular doblemente enlazada vacia");
        }else{
            NodoCircularDoble aux = ultimo;

            ultimo = aux.getAnterior();
            ultimo.setSiguiente(primero);
            primero.setAnterior(ultimo);
            tamanho--;
            indice--;
        }
    }

    public void eliminar(int indice){
        NodoCircularDoble aux = primero;

        if(vacia()){
            System.out.println("Lista circular doblemente enlazada vacia");
        }else{
            if(indice < 0 || indice > tamanho-1){
                System.out.println("Indice invalido");
            }else{
                if(indice > 0 && indice < tamanho -1){

                    if(indice - primero.getIndice() <= ultimo.getIndice() - indice) {
                        while (aux.getIndice() != indice) {
                            aux = aux.getSiguiente();
                        }

                        aux.getAnterior().setSiguiente(aux.getSiguiente());
                        aux.getSiguiente().setAnterior(aux.getAnterior());
                    }else{
                        while (aux.getIndice() != indice) {
                            aux = aux.getAnterior();
                        }

                        aux.getAnterior().setSiguiente(aux.getSiguiente());
                        aux.getSiguiente().setAnterior(aux.getAnterior());
                    }

                    tamanho--;
                    reIndexar();
                }else if(indice == ultimo.getIndice()){
                    eliminarUltimo();
                }else{


                    tamanho--;
                    reIndexar();
                }
            }
        }
    }

    public void imprimir(){
        NodoCircularDoble aux = primero;

        if(vacia()){
            System.out.println("Lista circular doblemente enlazada vacia");
        }else {
            for (int i = 0; i < tamanho; i++) {
                System.out.print(aux.getDato() + "; ");
                aux = aux.getSiguiente();
            }
        }
    }

    public void imprimirConIndice(){
        NodoCircularDoble aux = primero;

        if(vacia()){
            System.out.println("Lista circular doblemente enlazada vacia");
        }else {
            for (int i = 0; i < tamanho; i++) {
                System.out.print(aux.getDato() + "[" + aux.getIndice() + "]; ");
                aux = aux.getSiguiente();
            }
        }
    }

    public void reIndexar(){
        indice = 0;

        NodoCircularDoble aux = primero;

        for (int i = 0; i < tamanho; i++){
            aux.setIndice(indice);
            indice++;
            aux = aux.getSiguiente();
        }
    }

    public void imprimirInformacionNodos(){
        NodoCircularDoble aux = primero;

        if(vacia()){
            System.out.println("Lista circular doblemente enlazada vacia");
        }else{
            for (int i = 0; i < tamanho; i++) {
                System.out.println(aux);
                aux = aux.getSiguiente();
            }
        }
    }

    public void imprimirInformacionNodo(int indice){
        NodoCircularDoble aux = primero;

        if(vacia()){
            System.out.println("Lista circular doblemente enlazada vacia");
        }else if(indice < 0 || indice > tamanho-1){
            System.out.println("Indice invalido");
        }else {
            for (int i = 0; i < tamanho; i++) {
                if (indice == aux.getIndice()) {
                    System.out.println(aux);
                }
                aux = aux.getSiguiente();
            }
        }
    }
}
