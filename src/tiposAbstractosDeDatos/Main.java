package tiposAbstractosDeDatos;


import tiposAbstractosDeDatos.grafo.GrafoDirigido;
import tiposAbstractosDeDatos.grafo.GrafoNoDirigido;

public class Main {
    public static void main(String[] args) {

        //Lista simplemente enlazada
        /*
        ListaSimple miLista = new ListaSimple();

        miLista.enlazar("A");
        miLista.enlazar("B");
        miLista.enlazar("C");
        miLista.enlazar("D");
        miLista.enlazar("E");
        miLista.enlazar("F");

        System.out.println(miLista.devolverValor(0));
        System.out.println();
        System.out.println(miLista.devolverValor(1));
        System.out.println();
        System.out.println(miLista.devolverValor(2));
        System.out.println();
        System.out.println(miLista.devolverValor(3));
        System.out.println();
        System.out.println(miLista.devolverValor(4));
        System.out.println();
        System.out.println(miLista.devolverValor(5));
        System.out.println();
        System.out.println(miLista.getTamanho());
        System.out.println();

        miLista.imprimir();
        System.out.println();

        miLista.eliminarUltimo();

        miLista.imprimirConIndice();
        System.out.println(miLista.getTamanho());

        System.out.println();
        System.out.println(miLista.devolverValor(5));

        miLista.enlazar("F");

        System.out.println(miLista.devolverValor(5));
        System.out.println();

        miLista.imprimir();

        System.out.println();
        miLista.eliminar(-1);
        miLista.eliminar(6);

        miLista.eliminar(3);

        miLista.imprimir();
        System.out.println();
        miLista.imprimirConIndice();

        miLista.enlazar("G");

        System.out.println();
        miLista.imprimirConIndice();
        System.out.println();
        miLista.imprimir();
        System.out.println();

        miLista.eliminar(0);

        miLista.imprimirConIndice();
        System.out.println();
        miLista.imprimir();

        miLista.eliminar(2);

        miLista.imprimirConIndice();
        System.out.println();
        miLista.imprimir();

        miLista.imprimirInformacionNodos();

        miLista.imprimirInformacionNodo(5);

        System.out.println(miLista.getPrimero());

        System.out.println(miLista.getTamanho());
        miLista.imprimirConIndice();

        miLista.eliminarUltimo();

        System.out.println();
        miLista.imprimirInformacionNodos();
        System.out.println();
        miLista.imprimirConIndice();
        System.out.println(miLista.getTamanho());

        */

        //Lista doblemente enlazada
        /*
        ListaDoble lista = new ListaDoble();

        lista.enlazar("A");
        lista.enlazar("B");
        lista.enlazar("C");
        lista.enlazar("D");
        lista.enlazar("E");
        lista.enlazar("F");

        System.out.println(lista.devolverValor(0));
        System.out.println();
        System.out.println(lista.devolverValor(1));
        System.out.println();
        System.out.println(lista.devolverValor(2));
        System.out.println();
        System.out.println(lista.devolverValor(3));
        System.out.println();
        System.out.println(lista.devolverValor(4));
        System.out.println();
        System.out.println(lista.devolverValor(5));
        System.out.println();
        System.out.println(lista.getTamanho());
        System.out.println();

        lista.imprimir();
        System.out.println();

        lista.eliminarUltimo();

        lista.imprimir();

        System.out.println();
        System.out.println(lista.devolverValor(5));

        lista.enlazar("F");

        System.out.println(lista.devolverValor(5));
        System.out.println();

        lista.imprimir();

        System.out.println();
        lista.eliminar(-1);
        lista.eliminar(6);

        lista.eliminar(3);

        lista.imprimir();
        System.out.println();
        lista.imprimirConIndice();

        lista.enlazar("G");

        System.out.println();
        lista.imprimirConIndice();
        System.out.println();
        lista.imprimir();
        System.out.println();

        lista.eliminar(0);

        lista.imprimirConIndice();
        System.out.println();
        lista.imprimir();
        System.out.println("----------------------------");

        lista.eliminar(2);

        lista.imprimirConIndice();
        System.out.println();
        lista.imprimir();

        System.out.println();
        lista.imprimirInformacionNodos();

        lista.imprimirInformacionNodo(5);

        System.out.println(lista.getUltimo());

        System.out.println(lista.getTamanho());
        lista.imprimirConIndice();

        lista.eliminarUltimo();

        System.out.println();
        lista.imprimirInformacionNodos();
        System.out.println();
        lista.imprimirConIndice();
        System.out.println(lista.getTamanho());

        */

        //Lista circular simplemente enlazada
        /*
        ListaCircularSimple lc = new ListaCircularSimple();

        lc.enlazar("A");

        lc.enlazar("B");

        lc.enlazar("C");

        lc.enlazar("D");

        lc.enlazar("F");

        lc.imprimirInformacionNodos();

        System.out.println(lc.getUltimo());

        System.out.println(lc.devolverValor(5));

        System.out.println(lc.devolverValor(2));

        System.out.println(lc.devolverValor(4));

        System.out.println();
        lc.imprimirConIndice();

        System.out.println();
        lc.imprimir();

        lc.eliminarUltimo();

        System.out.println();
        lc.imprimirConIndice();

        System.out.println();
        lc.imprimir();

        System.out.println();
        lc.imprimirInformacionNodos();
        System.out.println(lc.getTamanho());

        lc.eliminar(3);

        System.out.println();
        System.out.println(lc.getTamanho());
        lc.imprimirConIndice();
        System.out.println();
        lc.imprimirInformacionNodos();
        System.out.println();
        lc.imprimir();

        System.out.println(lc.devolverValor(5));
        System.out.println(lc.devolverValor(2));
        System.out.println(lc.devolverValor(-1));
        System.out.println(lc.devolverValor(0));
        System.out.println(lc.devolverValor(1));
        */

        //Lista circular doblemente enlazada
        /*
        ListaCircularDoble lcd = new ListaCircularDoble();

        lcd.enlazar("A");
        lcd.enlazar("B");
        lcd.enlazar("C");
        lcd.enlazar("D");
        lcd.enlazar("E");
        lcd.enlazar("F");

        System.out.println(lcd.getTamanho());

        lcd.imprimirConIndice();
        System.out.println();
        lcd.imprimirInformacionNodos();
        System.out.println();
        lcd.imprimirInformacionNodo(3);
        lcd.imprimirInformacionNodo(7);
        lcd.imprimirInformacionNodo(-1);


        System.out.println();
        System.out.println(lcd.devolverValor(6));
        System.out.println(lcd.devolverValor(-1));
        System.out.println(lcd.devolverValor(4));
        System.out.println(lcd.devolverValor(0));

        System.out.println();

        lcd.eliminarUltimo();

        System.out.println(lcd.getTamanho());

        lcd.imprimirConIndice();
        System.out.println();
        lcd.imprimir();
        System.out.println();
        lcd.imprimirInformacionNodos();

        lcd.eliminar(3);

        System.out.println();
        lcd.imprimirConIndice();
        System.out.println();
        lcd.imprimir();
        System.out.println();
        lcd.imprimirInformacionNodos();
        */

        //Pila
        /*
        Pila miPila = new Pila(5);

        System.out.println(miPila.vacia());

        miPila.apilar("A");
        miPila.apilar("B");
        miPila.apilar("C");
        miPila.apilar("D");

        miPila.imprimir();

        System.out.println(miPila.desapilar());

        System.out.println();
        miPila.imprimir();

        miPila.apilar("D");
        miPila.apilar("E");
        miPila.apilar("F");

        miPila.imprimir();
        miPila.imprimirConIndice();

        miPila.apilar("J");

        System.out.println(miPila.desapilar());

        System.out.println();
        miPila.apilar("J");

        miPila.imprimir();
        miPila.imprimirConIndice();
        System.out.println();

        miPila.vaciar();

        miPila.apilar("A");

        miPila.imprimirConIndice();

        */


        //Cola
        /*
        Cola queue = new Cola(5);

        queue.encolar("A");
        queue.encolar("B");
        queue.encolar("C");
        queue.encolar("D");
        queue.encolar("E");
        queue.encolar("F");

        System.out.println(queue.vacia());

        System.out.println(queue.llena());

        System.out.println();
        queue.imprimir();
        System.out.println();
        queue.imprimirDesdeAtras();

        queue.desencolar();

        System.out.println();
        queue.imprimir();
        System.out.println();
        queue.imprimirDesdeAtras();

        System.out.println();
        queue.vaciar();

        queue.encolar("Z");
        queue.imprimir();

        */

        //Arbol binario Llave
        /*
        ArbolBinarioLlave miArbolBinario = new ArbolBinarioLlave();

        NodoBinarioLlave nodo1 = new NodoBinarioLlave(56,"A");
        NodoBinarioLlave nodo2 = new NodoBinarioLlave(43,"B");
        NodoBinarioLlave nodo3 = new NodoBinarioLlave(70,"C");
        NodoBinarioLlave nodo4 = new NodoBinarioLlave(38,"D");
        NodoBinarioLlave nodo5 = new NodoBinarioLlave(67,"F");
        NodoBinarioLlave nodo6 = new NodoBinarioLlave(65,"G");
        NodoBinarioLlave nodo7 = new NodoBinarioLlave(37,"H");
        NodoBinarioLlave nodo8 = new NodoBinarioLlave(45,"Z");
        NodoBinarioLlave nodo9 = new NodoBinarioLlave(80,"T");
        //No va a estar insertado
        NodoBinarioLlave nodo10 = new NodoBinarioLlave(85,"Y");
        //Va a estar insertado
        NodoBinarioLlave nodo11 = new NodoBinarioLlave(81,"W");
        NodoBinarioLlave nodo12 = new NodoBinarioLlave(77,"L");

        miArbolBinario.insertar(nodo1);
        miArbolBinario.insertar(nodo2);
        miArbolBinario.insertar(nodo3);
        miArbolBinario.insertar(nodo4);
        miArbolBinario.insertar(nodo5);
        miArbolBinario.insertar(nodo6);
        miArbolBinario.insertar(nodo7);
        miArbolBinario.insertar(nodo8);
        miArbolBinario.insertar(nodo9);
        miArbolBinario.insertar(nodo11);
        miArbolBinario.insertar(nodo12);
        miArbolBinario.insertar(83,"K");
        miArbolBinario.insertar(82,"Ñ");

        /*
        miArbolBinario.preOrden(nodo1);
        System.out.println();
        miArbolBinario.inOrden(nodo1);
        System.out.println();
        miArbolBinario.postOrden(nodo1);

        System.out.println("\nBusqueda por llave");
        System.out.println(miArbolBinario.buscar(56));
        System.out.println(miArbolBinario.buscar(43));
        System.out.println(miArbolBinario.buscar(70));
        System.out.println(miArbolBinario.buscar(38));
        System.out.println(miArbolBinario.buscar(67));
        System.out.println(miArbolBinario.buscar(65));
        System.out.println(miArbolBinario.buscar(37));
        System.out.println(miArbolBinario.buscar(45));
        System.out.println(miArbolBinario.buscar(80));
        System.out.println(miArbolBinario.buscar(81));
        System.out.println(miArbolBinario.buscar(83));
        System.out.println(miArbolBinario.buscar(82));
        //Si busco un nodo con una llave que no existe en el arbol, devuelve null
        System.out.println(miArbolBinario.buscar(84));

        /*

        System.out.println("\nBusqueda por nodo");
        System.out.println(miArbolBinario.buscar(nodo1));
        System.out.println(miArbolBinario.buscar(nodo2));
        System.out.println(miArbolBinario.buscar(nodo3));
        System.out.println(miArbolBinario.buscar(nodo4));
        System.out.println(miArbolBinario.buscar(nodo5));
        System.out.println(miArbolBinario.buscar(nodo6));
        System.out.println(miArbolBinario.buscar(nodo7));
        System.out.println(miArbolBinario.buscar(nodo8));
        System.out.println(miArbolBinario.buscar(nodo9));
        //Si busco un nodo que no existe en el arbol, devuelve null
        System.out.println(miArbolBinario.buscar(nodo10));

        System.out.println("\nBusqueda por dato");
        System.out.println(miArbolBinario.buscar("A"));
        System.out.println(miArbolBinario.buscar("B"));
        System.out.println(miArbolBinario.buscar("C"));
        System.out.println(miArbolBinario.buscar("D"));
        System.out.println(miArbolBinario.buscar("F"));
        System.out.println(miArbolBinario.buscar("G"));
        System.out.println(miArbolBinario.buscar("H"));
        System.out.println(miArbolBinario.buscar("Z"));
        System.out.println(miArbolBinario.buscar("T"));
        //Si busco un nodo que no existe en el arbol, devuelve null
        System.out.println(miArbolBinario.buscar("Y"));

        miArbolBinario.eliminar(nodo3);

        System.out.println();
        miArbolBinario.inOrden(nodo1);
        System.out.println();
        System.out.println(miArbolBinario.buscar(nodo3));

        System.out.println("\nBusqueda por nodo");
        System.out.println(miArbolBinario.buscar(nodo1));
        System.out.println(miArbolBinario.buscar(nodo2));
        System.out.println(miArbolBinario.buscar(nodo3));
        System.out.println(miArbolBinario.buscar(nodo4));
        System.out.println(miArbolBinario.buscar(nodo5));
        System.out.println(miArbolBinario.buscar(nodo6));
        System.out.println(miArbolBinario.buscar(nodo7));
        System.out.println(miArbolBinario.buscar(nodo8));
        System.out.println(miArbolBinario.buscar(nodo9));
        //Si busco un nodo que no existe en el arbol, devuelve null
        System.out.println(miArbolBinario.buscar(nodo10));
        System.out.println(miArbolBinario.buscar(nodo11));
        System.out.println(miArbolBinario.buscar(nodo12));

        System.out.println();
        miArbolBinario.inOrden(nodo1);

        miArbolBinario.eliminar(nodo1);

        System.out.println();
        miArbolBinario.inOrden(miArbolBinario.getRaiz());



        System.out.println();
        miArbolBinario.inOrden(miArbolBinario.getRaiz());

        miArbolBinario.eliminar(nodo9);

        System.out.println();
        miArbolBinario.inOrden(miArbolBinario.getRaiz());

        System.out.println();
        System.out.println(miArbolBinario.getRaiz());

        System.out.println("\nBusqueda por nodo");
        System.out.println(miArbolBinario.buscar(nodo1));
        System.out.println(miArbolBinario.buscar(nodo2));
        System.out.println(miArbolBinario.buscar(nodo3));
        System.out.println(miArbolBinario.buscar(nodo4));
        System.out.println(miArbolBinario.buscar(nodo5));
        System.out.println(miArbolBinario.buscar(nodo6));
        System.out.println(miArbolBinario.buscar(nodo7));
        System.out.println(miArbolBinario.buscar(nodo8));
        System.out.println(miArbolBinario.buscar(nodo9));
        //Si busco un nodo que no existe en el arbol, devuelve null
        System.out.println(miArbolBinario.buscar(nodo10));
        System.out.println(miArbolBinario.buscar(nodo11));
        System.out.println(miArbolBinario.buscar(nodo12));
        System.out.println(miArbolBinario.buscar(83));
        System.out.println(miArbolBinario.buscar(82));

         */
        /*
        System.out.println("\nBusqueda por dato");
        System.out.println(miArbolBinario.buscar("A"));
        System.out.println(miArbolBinario.buscar("D"));
        System.out.println(miArbolBinario.buscar("H"));
        System.out.println(miArbolBinario.buscar("C"));
        System.out.println(miArbolBinario.buscar("T"));
        System.out.println(miArbolBinario.buscar("W"));
        System.out.println(miArbolBinario.buscar("K"));
        System.out.println(miArbolBinario.buscar("Ñ"));
        System.out.println(miArbolBinario.buscar("B"));
         */

        //Arbol binario
        /*
        ArbolBinario miBST = new ArbolBinario();

        /*
        miBST.insertar("F");
        miBST.insertar("J");
        miBST.insertar("C");
        miBST.insertar("H");
        miBST.insertar("G");
        miBST.insertar("K");
        miBST.insertar("B");
        miBST.insertar("D");
        miBST.insertar("A");


        miBST.insertar(new NodoBinario("F"));
        miBST.insertar(new NodoBinario("J"));
        miBST.insertar(new NodoBinario("C"));
        miBST.insertar(new NodoBinario("H"));
        miBST.insertar(new NodoBinario("G"));
        miBST.insertar(new NodoBinario("K"));
        miBST.insertar(new NodoBinario("B"));
        miBST.insertar(new NodoBinario("D"));
        miBST.insertar(new NodoBinario("A"));

        miBST.inOrden(miBST.getRaiz());
        //miBST.preOrden(miBST.getRaiz());

        System.out.println(miBST.buscar("B"));
        System.out.println(miBST.buscar(new NodoBinario("K")));

        miBST.eliminar("H");

        miBST.inOrden(miBST.getRaiz());
        */

        //Grafo dirigido
        /*
        String[] vertices = {"0","1","2","3","4","5","6","7","8"};

        GrafoDirigido grafoDirigido = new GrafoDirigido(vertices);

        grafoDirigido.conectar("0","1",3);
        grafoDirigido.conectar("0","4",4);
        grafoDirigido.conectar("0","3",5);
        grafoDirigido.conectar("4","6",6);
        grafoDirigido.conectar("4","7",7);
        grafoDirigido.conectar("3","6",8);
        grafoDirigido.conectar("6","8",9);
        grafoDirigido.conectar("7","8",10);
        grafoDirigido.conectar("1","4",11);
        grafoDirigido.conectar("1","5",12);
        grafoDirigido.conectar("1","2",13);
        grafoDirigido.conectar("2","5",14);
        grafoDirigido.conectar("5","7",15);


        /*
        grafoDirigido.conectar("0","1");
        grafoDirigido.conectar("0","4");
        grafoDirigido.conectar("0","3");
        grafoDirigido.conectar("4","6");
        grafoDirigido.conectar("4","7");
        grafoDirigido.conectar("3","6");
        grafoDirigido.conectar("6","8");
        grafoDirigido.conectar("7","8");
        grafoDirigido.conectar("1","4");
        grafoDirigido.conectar("1","5");
        grafoDirigido.conectar("1","2");
        grafoDirigido.conectar("2","5");
        grafoDirigido.conectar("5","7");

        grafoDirigido.imprimirMatriz();
        System.out.println();
        grafoDirigido.imprimirParesAdyacencia();
        System.out.println();
        grafoDirigido.imprimirListaDeAdyacencia();


        grafoDirigido.eliminarConexion("0","4");
        grafoDirigido.eliminarConexion("7","8");
        grafoDirigido.eliminarConexion("5","7");

        grafoDirigido.imprimirMatriz();
        System.out.println();
        grafoDirigido.imprimirParesAdyacencia();
        System.out.println();
        grafoDirigido.imprimirListaDeAdyacencia();

        grafoDirigido.modificarPeso("3","6",3);
        grafoDirigido.modificarPeso("6","8",7);
        grafoDirigido.modificarPeso("0","4",45);

        System.out.println();
        grafoDirigido.imprimirMatriz();

        grafoDirigido.conocerConexion("0","4");
        grafoDirigido.conocerConexion("0","8");


         */



        //Grafo no dirigido

        /*
        String[] vertices = {"A","B","C","D","E","F"};

        GrafoNoDirigido grafoNoDirigido = new GrafoNoDirigido(vertices);

        /*
        grafoNoDirigido.conectar("A","E",80);
        grafoNoDirigido.conectar("E","A",45);
        grafoNoDirigido.conectar("A","B",34);
        grafoNoDirigido.conectar("A","F",23);
        grafoNoDirigido.conectar("E","F",2);
        grafoNoDirigido.conectar("E","D",5);
        grafoNoDirigido.conectar("E","C",78);
        grafoNoDirigido.conectar("E","B",4);
        grafoNoDirigido.conectar("B","C",66);
        grafoNoDirigido.conectar("C","B",12);
        grafoNoDirigido.conectar("C","D",17);
        grafoNoDirigido.conectar("D","F",10);
        grafoNoDirigido.conectar("F","D",9);
         */

        /*
        grafoNoDirigido.conectar("A","E");
        grafoNoDirigido.conectar("E","A");
        grafoNoDirigido.conectar("A","B");
        grafoNoDirigido.conectar("A","F");
        grafoNoDirigido.conectar("E","F");
        grafoNoDirigido.conectar("E","D");
        grafoNoDirigido.conectar("E","C");
        grafoNoDirigido.conectar("E","B");
        grafoNoDirigido.conectar("B","C");
        grafoNoDirigido.conectar("C","B");
        grafoNoDirigido.conectar("C","D");
        grafoNoDirigido.conectar("D","F");
        grafoNoDirigido.conectar("F","D");
         */

        /*
        grafoNoDirigido.imprimirListaDeAdyacencia();
        System.out.println();
        grafoNoDirigido.imprimirParesAdyacencia();
        System.out.println();
        grafoNoDirigido.imprimirMatriz();
        System.out.println();
        System.out.println("Nodos adyacentes: " + grafoNoDirigido.obtenerNodosAdyacentes("A"));
        System.out.println("Nodos adyacentes: " +grafoNoDirigido.obtenerNodosAdyacentes("D"));
        System.out.println("Nodos adyacentes: " +grafoNoDirigido.obtenerNodosAdyacentes("Z"));

        System.out.println();
        grafoNoDirigido.eliminarConexion("E","A");
        grafoNoDirigido.eliminarConexion("A","E");

        System.out.println();
        grafoNoDirigido.imprimirListaDeAdyacencia();
        System.out.println();
        grafoNoDirigido.imprimirParesAdyacencia();
        System.out.println();
        grafoNoDirigido.imprimirMatriz();

        */
    }
}
