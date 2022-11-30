package tiposAbstractosDeDatos.arbolBinario;

public class ArbolBinarioLlave {
    private NodoBinarioLlave raiz;

    public ArbolBinarioLlave(){
        this.raiz = null;
    }

    public NodoBinarioLlave getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoBinarioLlave raiz) {
        this.raiz = raiz;
    }

    public void insertar(int llave, String dato){
        NodoBinarioLlave nuevo = new NodoBinarioLlave(llave,dato);

        if(vacio()){
            raiz = nuevo;
        }else{
            NodoBinarioLlave aux = raiz;

            while (aux != null){

                nuevo.setPadre(aux);

                if(nuevo.getLlave() >= aux.getLlave()){
                    aux = aux.getHijoDerecho();
                }else{
                    aux = aux.getHijoIzquierdo();
                }
            }

            if(nuevo.getLlave() < nuevo.getPadre().getLlave()){
                nuevo.getPadre().setHijoIzquierdo(nuevo);
            }else{
                nuevo.getPadre().setHijoDerecho(nuevo);
            }
        }
    }

    public void insertar(NodoBinarioLlave nodo){

        if(vacio()){
            raiz = nodo;
        }else{
            NodoBinarioLlave aux = raiz;

            while (aux != null){

                nodo.setPadre(aux);

                if(nodo.getLlave() >= aux.getLlave()){
                    aux = aux.getHijoDerecho();
                }else{
                    aux = aux.getHijoIzquierdo();
                }
            }

            if(nodo.getLlave() < nodo.getPadre().getLlave()){
                nodo.getPadre().setHijoIzquierdo(nodo);
            }else{
                nodo.getPadre().setHijoDerecho(nodo);
            }
        }
    }

    public boolean vacio(){
        return raiz == null;
    }

    //Búsquedas en profundidad
    //Recorrido preOrden
    public void preOrden(NodoBinarioLlave nodo){
        if(nodo != null) {
            System.out.println(nodo.getLlave() + ", Dato = [ " + nodo.getDato() + " ]");
            preOrden(nodo.getHijoIzquierdo());
            preOrden(nodo.getHijoDerecho());
        }
    }

    //Recorrido inOrden
    public void inOrden(NodoBinarioLlave nodo){
        if(nodo != null) {
            inOrden(nodo.getHijoIzquierdo());
            System.out.println(nodo.getLlave() + ", Dato = [ " + nodo.getDato() + " ]");
            inOrden(nodo.getHijoDerecho());
        }
    }

    //Busqueda inOrden
    //No funciona
    /*
    public NodoBinarioLlave inOrden(NodoBinarioLlave nodo,String dato){
        NodoBinarioLlave aux = null;

        if (nodo != null && nodo.getDato().compareTo(dato) != 0){
            if(nodo.getHijoDerecho() != null && nodo.getHijoDerecho().getDato().compareTo(dato) != 0) {
                nodo = inOrden(nodo.getHijoIzquierdo(), dato);
            }else if(nodo.getHijoIzquierdo() != null && nodo.getHijoIzquierdo().getDato().compareTo(dato) != 0) {
                nodo = inOrden(nodo.getHijoDerecho(), dato);
            }
        }

        if(nodo!= null && nodo.getDato().compareTo(dato) == 0){
            //System.out.println(nodo);
            //System.out.println(nodo.getDato());
            aux = nodo;
        }

        return aux;
    }
     */

    //Recorrido postOrden
    public void postOrden(NodoBinarioLlave nodo){
        if(nodo != null) {
            postOrden(nodo.getHijoIzquierdo());
            postOrden(nodo.getHijoDerecho());
            System.out.println(nodo.getLlave() + ", Dato = [ " + nodo.getDato() + " ]");
        }
    }

    //Busqueda en anchura


    public NodoBinarioLlave buscar(int llave){

        if(vacio()){
            System.out.println("El arbol binario esta vacio");
            return null;
        }else {
            NodoBinarioLlave aux = raiz;

            while (aux != null && aux.getLlave() != llave) {

                if (llave >= aux.getLlave()) {
                    aux = aux.getHijoDerecho();
                } else {
                    aux = aux.getHijoIzquierdo();
                }
            }

            return aux;
        }
    }

    public NodoBinarioLlave buscar(NodoBinarioLlave nodo){

        if(vacio()){
            System.out.println("El arbol binario esta vacio");
            return null;
        }else {
            NodoBinarioLlave aux = raiz;

            while (aux != null && aux.getLlave() != nodo.getLlave()) {

                if (nodo.getLlave() >= aux.getLlave()) {
                    aux = aux.getHijoDerecho();
                } else {
                    aux = aux.getHijoIzquierdo();
                }
            }

            return aux;
        }
    }

    //No funciona
    /*
    public NodoBinarioLlave buscar(String dato){

        if(vacio()){
            System.out.println("El arbol binario esta vacio");
            return null;
        }else {
            NodoBinarioLlave aux = raiz;
            NodoBinarioLlave aux2 = inOrden(aux,dato);

            return aux2;
        }
    }
     */

    public void eliminar(NodoBinarioLlave nodo){

        if (vacio()){
            System.out.println("El arbol binario esta vacio");
        }else{
            NodoBinarioLlave aux = raiz;

            while (aux != null && aux.getLlave() != nodo.getLlave()){

                if(aux.getLlave() >= nodo.getLlave()){
                    aux = aux.getHijoIzquierdo();
                }else{
                    aux = aux.getHijoDerecho();
                }
            }

            if(aux == null){
                System.out.println("El nodo que se intenta eliminar no existe en el arbol");
            }else if(aux.getHijoDerecho() == null && aux.getHijoIzquierdo() == null){
                //Elimina un nodo hoja
                eliminarNodoHoja(aux);
            }else if(aux.getHijoDerecho() == null && aux.getHijoIzquierdo() != null){
                //Elimina un nodo con un subarbol hijo izquierdo hoja
                eliminarNodoConSubarbolHijoIzquierdoHoja(aux);

            }else if(aux.getHijoDerecho() != null && aux.getHijoIzquierdo() == null){
                //Elimina un nodo con un subarbol hijo derecho hoja
                eliminarNodoConSubarbolHijoDerechoHoja(aux);

            }else if(aux.getHijoDerecho() != null && aux.getHijoIzquierdo() != null){
                //Elimina un nodo con dos subarboles hijos
                eliminarNodoConDosSubarbolesHijos(aux);

            }
        }
    }

    public void eliminar(int llave){

        if (vacio()){
            System.out.println("El arbol binario esta vacio");
        }else{
            NodoBinarioLlave aux = raiz;

            while (aux != null && aux.getLlave() != llave){

                if(aux.getLlave() >= llave){
                    aux = aux.getHijoIzquierdo();
                }else{
                    aux = aux.getHijoDerecho();
                }
            }

            if(aux == null){
                System.out.println("El nodo que se intenta eliminar no existe en el arbol");
            }else if(aux.getHijoDerecho() == null && aux.getHijoIzquierdo() == null){
                //Elimina un nodo hoja
                eliminarNodoHoja(aux);
            }else if(aux.getHijoDerecho() == null && aux.getHijoIzquierdo() != null){
                //Elimina un nodo con un subarbol hijo izquierdo hoja
                eliminarNodoConSubarbolHijoIzquierdoHoja(aux);

            }else if(aux.getHijoDerecho() != null && aux.getHijoIzquierdo() == null){
                //Elimina un nodo con un subarbol hijo derecho hoja
                eliminarNodoConSubarbolHijoDerechoHoja(aux);

            }else if(aux.getHijoDerecho() != null && aux.getHijoIzquierdo() != null){
                //Elimina un nodo con dos subarboles hijos
                eliminarNodoConDosSubarbolesHijos(aux);

            }
        }
    }

    private void eliminarNodoHoja(NodoBinarioLlave nodo){
        //Elimina un nodo hoja
        if(nodo.getLlave() == nodo.getPadre().getHijoIzquierdo().getLlave()){
            nodo.getPadre().setHijoIzquierdo(null);
        }else if(nodo.getLlave() == nodo.getPadre().getHijoDerecho().getLlave()){
            nodo.getPadre().setHijoDerecho(null);
        }
        nodo.setPadre(null);
    }

    private void eliminarNodoConSubarbolHijoIzquierdoHoja(NodoBinarioLlave nodo){
        NodoBinarioLlave hijo = null;

        //Elimina un nodo con un subarbol hijo izquierdo hoja
        if (nodo.getHijoIzquierdo().esHoja()) {
            hijo = nodo.getHijoIzquierdo();
            if(nodo.getPadre().getHijoDerecho().getLlave() == nodo.getLlave()){
                nodo.getPadre().setHijoDerecho(hijo);
                hijo.setPadre(nodo.getPadre());
                nodo.setPadre(null);
            }else if(nodo.getPadre().getHijoIzquierdo().getLlave() == nodo.getLlave()){
                nodo.getPadre().setHijoIzquierdo(hijo);
                hijo.setPadre(nodo.getPadre());
                nodo.setPadre(null);
            }
        }
    }

    private void eliminarNodoConSubarbolHijoDerechoHoja(NodoBinarioLlave nodo){
        NodoBinarioLlave hijo = null;

        //Elimina un nodo con un subarbol hijo derecho hoja
        if(nodo.getHijoDerecho().esHoja()){
            hijo = nodo.getHijoDerecho();
            if(nodo.getPadre().getHijoDerecho().getLlave() == nodo.getLlave()){

                nodo.getPadre().setHijoDerecho(hijo);
                hijo.setPadre(nodo.getPadre());
                nodo.setPadre(null);

            }else if(nodo.getPadre().getHijoIzquierdo().getLlave() == nodo.getLlave()){

                nodo.getPadre().setHijoIzquierdo(hijo);
                hijo.setPadre(nodo.getPadre());
                nodo.setPadre(null);

            }
        }
    }

    private void eliminarNodoConDosSubarbolesHijos(NodoBinarioLlave nodo){
        NodoBinarioLlave hijo = nodo.getHijoDerecho();
        NodoBinarioLlave izquierda = null;

        //Elimina un nodo con dos subarboles hijos
        while (hijo != null) {
            izquierda = hijo;
            hijo = hijo.getHijoIzquierdo();
        }

        if(nodo.getPadre() != null) {
            if (izquierda.esHoja()) {

                if (nodo.getPadre().getHijoDerecho().getLlave() == nodo.getLlave()) {
                    nodo.getPadre().setHijoDerecho(izquierda);
                    izquierda.setPadre(nodo.getPadre());
                    izquierda.getPadre().setHijoDerecho(izquierda);

                    if (nodo.getHijoIzquierdo() != null) {
                        izquierda.setHijoIzquierdo(nodo.getHijoIzquierdo());
                        nodo.getHijoIzquierdo().setPadre(izquierda);
                    }

                    nodo.setPadre(null);
                }else if (nodo.getPadre().getHijoIzquierdo().getLlave() == nodo.getLlave()) {
                    nodo.getPadre().setHijoIzquierdo(izquierda);
                    izquierda.setPadre(nodo.getPadre());
                    izquierda.getPadre().setHijoIzquierdo(izquierda);

                    if (nodo.getHijoIzquierdo() != null) {
                        izquierda.setHijoIzquierdo(nodo.getHijoIzquierdo());
                        nodo.getHijoIzquierdo().setPadre(izquierda);
                    }

                    nodo.setPadre(null);
                }

            }else {
                NodoBinarioLlave hijoIzquierda = null;

                if (izquierda.getHijoDerecho() == null && izquierda.getHijoIzquierdo() != null) {
                    hijoIzquierda = izquierda;
                    eliminarNodoConSubarbolHijoIzquierdoHoja(hijoIzquierda);
                } else if (izquierda.getHijoDerecho() != null && izquierda.getHijoIzquierdo() == null) {
                    hijoIzquierda = izquierda;
                    eliminarNodoConSubarbolHijoDerechoHoja(hijoIzquierda);
                } else {
                    hijoIzquierda = izquierda;
                    eliminarNodoConDosSubarbolesHijos(hijoIzquierda);
                }

                if (nodo.getPadre().getHijoDerecho().getLlave() == nodo.getLlave()) {
                    nodo.getPadre().setHijoDerecho(izquierda);
                    izquierda.setPadre(nodo.getPadre());
                    izquierda.getPadre().setHijoDerecho(izquierda);

                    if (nodo.getHijoIzquierdo() != null) {
                        izquierda.setHijoIzquierdo(nodo.getHijoIzquierdo());
                        nodo.getHijoIzquierdo().setPadre(izquierda);
                    }

                    nodo.setPadre(null);
                } else if (nodo.getPadre().getHijoIzquierdo().getLlave() == nodo.getLlave()) {
                    nodo.getPadre().setHijoIzquierdo(izquierda);
                    izquierda.setPadre(nodo.getPadre());
                    izquierda.getPadre().setHijoIzquierdo(izquierda);

                    if (nodo.getHijoIzquierdo() != null) {
                        izquierda.setHijoIzquierdo(nodo.getHijoIzquierdo());
                        nodo.getHijoIzquierdo().setPadre(izquierda);
                    }

                    nodo.setPadre(null);

                }
            }
        }else{
            if(izquierda.esHoja()){

                raiz = izquierda;
                izquierda.setHijoIzquierdo(nodo.getHijoIzquierdo());
                nodo.getHijoIzquierdo().setPadre(izquierda);
                izquierda.setHijoDerecho(nodo.getHijoDerecho());
                izquierda.getPadre().setHijoIzquierdo(null);
                izquierda.setPadre(null);
                nodo = null;

            }else{
                NodoBinarioLlave hijoIzquierda = null;

                if (izquierda.getHijoDerecho() == null && izquierda.getHijoIzquierdo() != null) {
                    hijoIzquierda = izquierda;
                    eliminarNodoConSubarbolHijoIzquierdoHoja(hijoIzquierda);
                } else if (izquierda.getHijoDerecho() != null && izquierda.getHijoIzquierdo() == null) {
                    hijoIzquierda = izquierda;
                    eliminarNodoConSubarbolHijoDerechoHoja(hijoIzquierda);
                } else {
                    hijoIzquierda = izquierda;
                    eliminarNodoConDosSubarbolesHijos(hijoIzquierda);
                }

                raiz = izquierda;
                izquierda.setHijoIzquierdo(nodo.getHijoIzquierdo());
                nodo.getHijoIzquierdo().setPadre(izquierda);
                izquierda.setHijoDerecho(nodo.getHijoDerecho());
                izquierda.getPadre().setHijoIzquierdo(null);
                izquierda.setPadre(null);
                nodo = null;
            }
        }

    }

}
