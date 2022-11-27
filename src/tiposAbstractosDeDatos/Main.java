package tiposAbstractosDeDatos;

import tiposAbstractosDeDatos.Cola.Cola;
import tiposAbstractosDeDatos.ListaCircularDoblementeEnlazada.ListaCircularDoble;
import tiposAbstractosDeDatos.ListaCircularSimplementeEnlazada.ListaCircularSimple;
import tiposAbstractosDeDatos.ListaDoblementeEnlazada.ListaDoble;
import tiposAbstractosDeDatos.Pila.Pila;
import tiposAbstractosDeDatos.listaSimplementeEnlazada.ListaSimple;

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
    }
}
