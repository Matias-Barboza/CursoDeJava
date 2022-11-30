package tiposAbstractosDeDatos.grafo;

import java.util.LinkedList;

public class VerticeNoDirigido {
    private String valor;
    private LinkedList<String> adyacentes;

    public VerticeNoDirigido(String valor){
        this.valor = valor;
        adyacentes = new LinkedList<>();
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public LinkedList<String> getAdyacentes() {
        return adyacentes;
    }

    public void setAdyacentes(LinkedList<String> adyacentes) {
        this.adyacentes = adyacentes;
    }

    public void añadirAdyacente(String verticeAdyacente){
        adyacentes.add(verticeAdyacente);
    }

    public void eliminarAdyacente(String verticeAdyacente){

        adyacentes.removeIf(vertice -> vertice.equals(verticeAdyacente));
    }

    @Override
    public String toString() {
        return valor + "| "  + adyacentes;
    }
}
