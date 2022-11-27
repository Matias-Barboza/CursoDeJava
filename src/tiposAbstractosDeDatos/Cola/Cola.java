package tiposAbstractosDeDatos.Cola;

public class Cola {
    private Nodo primero;
    private int tamanho;
    private int indice = 0;

    public Cola(int tamanho){
        this.tamanho = tamanho;
        primero = null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void encolar(String dato){
        Nodo nuevo = new Nodo(dato,indice);

        if(vacia()){
            primero = nuevo;
            indice++;
        }else if(llena()){
            System.out.println("La cola esta llena");
        }else{
            indice++;
            Nodo aux = primero;

            while(aux.getAnterior() != null){
                aux= aux.getAnterior();
            }

            aux.setAnterior(nuevo);
        }
    }

    public boolean vacia(){
        return primero == null;
    }

    public boolean llena(){
        return indice == tamanho;
    }

    public String desencolar(){

        if(vacia()){
            System.out.println("La cola esta vacia");
            return null;
        }else{
            Nodo aux = primero;
            primero = primero.getAnterior();
            indice--;
            reindexar();
            return aux.getDato();
        }
    }

    public void vaciar(){
        if(vacia()){
            System.out.println("La cola esta vacia");
        }else{
            Nodo aux = primero;
            primero = null;

            for(int i=0; i < indice; i++){
                aux = aux.getAnterior();
            }

            aux = null;
            indice = 0;
            imprimir();
        }
    }

    private void reindexar(){
        Nodo aux = primero;

        for (int i=0 ; i < indice; i++){
            aux.setIndice(i);
            aux = aux.getAnterior();
        }
    }

    public void imprimir(){

        if(vacia()){
            System.out.println("La cola esta vacia");
        }else {
            Nodo aux = primero;

            for (int i = 0; i < indice; i++) {
                System.out.print(aux.getDato() + "; ");
                aux = aux.getAnterior();
            }
        }
    }

    public void imprimirDesdeAtras(){

        if(vacia()){
            System.out.println("La cola esta vacia");
        }else {
            Nodo aux = primero;
            String dato;
            String[] datos = new String[indice];

            for (int i = 0; i < indice; i++) {
                dato = aux.getDato();
                datos[i] = dato;
                aux = aux.getAnterior();
            }

            for (int i = indice - 1; i >= 0; i--) {
                System.out.print(datos[i] + "; ");
            }
        }
    }
}
