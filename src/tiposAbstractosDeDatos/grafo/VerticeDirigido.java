package tiposAbstractosDeDatos.grafo;

import java.util.LinkedList;

public class VerticeDirigido {
    private String valor;
    private LinkedList<String> adyacentes;

    public VerticeDirigido(String valor){
        this.valor = valor;
        adyacentes = new LinkedList<>();
    }

    public String getValor() {
        return valor;
    }

    public void añadirAdyacente(String verticeAdyacente){
        adyacentes.add(verticeAdyacente);
    }

    @Override
    public String toString() {
        return valor + "| "  + adyacentes;
    }
}
