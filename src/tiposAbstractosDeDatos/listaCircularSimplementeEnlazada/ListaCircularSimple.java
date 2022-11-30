package tiposAbstractosDeDatos.listaCircularSimplementeEnlazada;

public class ListaCircularSimple {
    private NodoCircularSimple ultimo;
    private int tamanho = 0;
    private int indice = 0;

    public ListaCircularSimple(){
        ultimo = null;
    }

    public int getTamanho() {
        return tamanho;
    }

    public NodoCircularSimple getUltimo() {
        return ultimo;
    }

    public void enlazar(String dato){

        NodoCircularSimple nuevo = new NodoCircularSimple(dato,indice);
        indice++;

        if(vacia()){
            ultimo = nuevo;
            ultimo.setSiguiente(ultimo);
        }else{
            NodoCircularSimple aux = ultimo;

            nuevo.setSiguiente(ultimo.getSiguiente());
            ultimo.setSiguiente(nuevo);
        }

        tamanho++;
    }

    private boolean vacia(){
        return ultimo == null;
    }

    public String devolverValor(int indice){
        NodoCircularSimple aux = ultimo.getSiguiente();

        if(vacia()){
            System.out.println("Lista circular simplemente enlazada vacia");
            return "-1";
        }else {
            if(indice >= 0 && indice < tamanho) {
                while (indice != aux.getIndice() && aux != ultimo) {
                    aux = aux.getSiguiente();
                }
            }else{
                return "-1";
            }
        }

        return aux.getDato();
    }

    public void eliminarUltimo(){
        NodoCircularSimple aux = ultimo.getSiguiente();
        NodoCircularSimple aux1 = ultimo.getSiguiente();

        while(aux.getSiguiente() != ultimo){
            aux = aux.getSiguiente();
        }

        ultimo = aux;
        ultimo.setSiguiente(aux1);
        tamanho--;
        reIndexar();
    }

    public void eliminar(int indice){
        NodoCircularSimple aux = ultimo.getSiguiente();
        NodoCircularSimple aux1 = ultimo.getSiguiente();

        if(vacia()){
            System.out.println("Lista circular simplemente enlazada vacia");
        }else{
            if(indice < 0 || indice > tamanho-1){
                System.out.println("Indice invalido");
            }else{
                if(indice == 0){
                    eliminarUltimo();
                }else if(indice > 0 && indice < ultimo.getSiguiente().getIndice()){

                    while (aux.getIndice() != (indice+1)){
                        aux = aux.getSiguiente();
                    }
                    while (aux1.getIndice() != (indice-1)){
                        aux1 = aux1.getSiguiente();
                    }

                    aux.setSiguiente(aux1);
                    tamanho--;
                    reIndexar();
                }else{
                    aux = ultimo.getSiguiente().getSiguiente();
                    ultimo.setSiguiente(aux);

                    tamanho--;
                    indice--;
                }
            }
        }
    }

    public void imprimir(){
        NodoCircularSimple aux = ultimo.getSiguiente();

        if(vacia()){
            System.out.println("Lista circular simplemente enlazada vacia");
        }else {
            for (int i = 0; i < tamanho; i++) {
                System.out.print(aux.getDato() + "; ");
                aux = aux.getSiguiente();
            }
        }
    }

    public void imprimirConIndice(){
        NodoCircularSimple aux = ultimo.getSiguiente();

        if(vacia()){
            System.out.println("Lista circular simplemente enlazada vacia");
        }else {
            for (int i = 0; i < tamanho; i++) {
                System.out.print(aux.getDato() + "[" + aux.getIndice() + "]; ");
                aux = aux.getSiguiente();
            }
        }
    }

    private void reIndexar(){
        indice = tamanho-1;

        NodoCircularSimple aux = ultimo.getSiguiente();

        for (int i=tamanho-1; i>=0 ; i--){
            aux.setIndice(indice);
            indice--;
            aux = aux.getSiguiente();
        }

        indice = tamanho-1;
    }

    public void imprimirInformacionNodos(){

        NodoCircularSimple aux = ultimo.getSiguiente();

        if(vacia()){
            System.out.println("Lista circular simplemente enlazada vacia");
        }else {
            for (int i = 0; i < tamanho; i++) {
                System.out.println(aux);
                aux = aux.getSiguiente();
            }
        }
    }

    public void imprimirInformacionNodo(int indice){

        NodoCircularSimple aux = ultimo.getSiguiente();

        if(vacia()){
            System.out.println("Lista circular simplemente enlazada vacia");
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
