package tiposAbstractosDeDatos.ListaDoblementeEnlazada;

public class ListaDoble {
    private NodoDoble primero;
    private NodoDoble ultimo;
    private int tamanho = 0;
    private int indice = 0;

    public ListaDoble(){
        primero = null;
        ultimo = null;
    }

    public int getTamanho(){
        return tamanho;
    }

    public NodoDoble getPrimero() {
        return primero;
    }

    public NodoDoble getUltimo() {
        return ultimo;
    }

    public void enlazar(String dato){

        NodoDoble nuevo = new NodoDoble(dato,indice);
        indice++;

        if(vacia()){
            primero = nuevo;
        }else{
            NodoDoble aux = primero;

            while (aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }

            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
            ultimo = nuevo;
        }

        tamanho++;
    }

    public String devolverValor(int indice){
       NodoDoble aux = null;

        if(vacia()){
            System.out.println("Lista doblemente enlazada vacia");
            return "-1";
        }else {
            if (indice < 0 || indice > tamanho - 1) {
                return "-1";
            }

            if(indice - primero.getIndice() <= ultimo.getIndice() - indice ) {
                aux = primero;

                while (aux.getIndice() != indice && aux.getSiguiente() != null) {
                    aux = aux.getSiguiente();
                }
            }else{
                aux = ultimo;

                while (aux.getIndice() != indice && aux.getAnterior() != null) {
                    aux = aux.getAnterior();
                }
            }
        }

        return aux.getDato();
    }

    private boolean vacia(){
        return primero == null;
    }

    public void eliminarUltimo(){
        NodoDoble aux = ultimo;

        if(vacia()){
            System.out.println("Lista doblemente enlazada vacia");
        }else{
            aux = ultimo.getAnterior().getAnterior();
            ultimo = ultimo.getAnterior();
            ultimo.setSiguiente(null);
            aux.setSiguiente(ultimo);
            tamanho--;
            indice--;
        }
    }

    public void eliminar(int indice){

        NodoDoble auxPrimero = primero;
        NodoDoble auxUltimo = ultimo;

        if(vacia()){
            System.out.println("Lista doblemente enlazada vacia");
        }else if(indice >= 0 && indice < tamanho){
            if(indice != 0 && indice < ultimo.getIndice()){
                if(indice - auxPrimero.getIndice() <= auxUltimo.getIndice() - indice) {
                    while (auxPrimero.getIndice() != indice) {
                        auxPrimero = auxPrimero.getSiguiente();
                    }

                    auxPrimero.getAnterior().setSiguiente(auxPrimero.getSiguiente());
                    auxPrimero.getSiguiente().setAnterior(auxPrimero.getAnterior());
                }else{
                    while (auxUltimo.getIndice() != indice) {
                        auxUltimo = auxUltimo.getAnterior();
                    }

                    auxUltimo.getAnterior().setSiguiente(auxUltimo.getSiguiente());
                    auxUltimo.getSiguiente().setAnterior(auxUltimo.getAnterior());
                }

            }else if(indice == 0){
                primero = primero.getSiguiente();
                primero.setAnterior(null);
            }else if(indice == ultimo.getIndice()){
                ultimo = ultimo.getAnterior();
                ultimo.setSiguiente(null);
            }

            tamanho--;
            reIndexar();
        }else{
            System.out.println("Indice invalido");
        }
    }

    public void imprimir(){

        NodoDoble aux = primero;

        if(vacia()){
            System.out.println("Lista doblemente enlazada vacia");
        }else {
            for (int i = 0; i < tamanho; i++) {
                System.out.print(aux.getDato());
                System.out.print("; ");
                aux = aux.getSiguiente();
            }
        }
    }

    public void imprimirConIndice(){

        NodoDoble aux = primero;

        if(vacia()){
            System.out.println("Lista doblemente enlazada vacia");
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

        NodoDoble aux = primero;

        for (int i = 0; i < tamanho; i++) {
            aux.setIndice(indice);
            indice++;
            aux = aux.getSiguiente();
        }
    }

    public void imprimirInformacionNodos(){

        NodoDoble aux = primero;

        if(vacia()){
            System.out.println("Lista doblemente enlazada vacia");
        }else {
            for (int i = 0; i < tamanho; i++) {
                System.out.println(aux);
                aux = aux.getSiguiente();
            }
        }
    }

    public void imprimirInformacionNodo(int indice){

        NodoDoble aux = primero;

        if(vacia()){
            System.out.println("Lista doblemente enlazada vacia");
        }else if(indice >= 0 && indice < tamanho){
            for (int i = 0; i < tamanho; i++) {
                if(i == indice) {
                    System.out.println(aux);
                }
               aux = aux.getSiguiente();
            }
        }else{
            System.out.println("Indice invalido");
        }
    }
}
