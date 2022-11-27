package tiposAbstractosDeDatos.Pila;

public class Pila {
    private Nodo tope;
    private int tamanho;
    private int indice = 0;

    public Pila(int tamanho){
        this.tamanho = tamanho;
        tope = null;
    }

    public Nodo getTope() {
        return tope;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean vacia(){
        return tope == null;
    }

    public boolean llena(){
        return indice == tamanho;
    }

    public void apilar(String dato){
        Nodo nuevo = new Nodo(dato,indice);

        if(llena()){
            System.out.println("La pila esta llena");
        }else if(vacia()){
            indice++;
            tope = nuevo;
        }else{
            indice++;
            Nodo aux = tope;

            nuevo.setAnterior(aux);
            tope = nuevo;
        }
    }

    public String desapilar(){

        if(vacia()){
            return null;
        }else{
            Nodo aux = tope;
            tope = tope.getAnterior();
            indice--;
            return aux.getDato();
        }
    }

    public void vaciar(){

        if(vacia()){
            System.out.println("La pila esta vacia");
        }else{
            Nodo aux = tope;
            tope = null;

            for (int i = 0; i < indice; i++){
                aux = aux.getAnterior();
            }
            aux = null;

            indice = 0;
            imprimir();
        }
    }

    public void imprimir(){
        Nodo aux = tope;

        if(vacia()){
            System.out.println("La pila esta vacia");
        }else {
            for (int i = 0; i < indice; i++) {
                System.out.println(aux.getDato());
                aux = aux.getAnterior();
            }
        }
    }

    public void imprimirConIndice(){
        Nodo aux = tope;

        if(vacia()){
            System.out.println("La pila esta vacia");
        }else {
            for (int i = 0; i < indice; i++) {
                System.out.println(aux.getDato() + "[" + aux.getIndice() + "]");
                aux = aux.getAnterior();
            }
        }
    }
}
